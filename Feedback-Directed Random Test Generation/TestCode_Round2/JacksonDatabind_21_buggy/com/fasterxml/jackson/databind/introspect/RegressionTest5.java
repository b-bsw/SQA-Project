package com.fasterxml.jackson.databind.introspect;

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
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector3.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector7.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray11 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector7, jacksonAnnotationIntrospector10 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList12 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12, annotationIntrospectorArray11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = jacksonAnnotationIntrospector6.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector3.allIntrospectors(annotationIntrospectorCollection14);
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector3.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(annotationIntrospector18);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember13);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName19 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version20 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean22 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotatedClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(propertyName19);
        org.junit.Assert.assertNotNull(version20);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector27.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName33 = jacksonAnnotationIntrospector31.findWrapperName(annotated32);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray35 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector31, jacksonAnnotationIntrospector34 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList36 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36, annotationIntrospectorArray35);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection38 = jacksonAnnotationIntrospector30.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector27.allIntrospectors(annotationIntrospectorCollection38);
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember41 = null;
        java.lang.String str42 = jacksonAnnotationIntrospector27.findImplicitPropertyName(annotatedMember41);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection43 = jacksonAnnotationIntrospector27.allIntrospectors();
        com.fasterxml.jackson.core.Version version44 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector45 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector27);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder46 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector47 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector48 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated49 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName50 = jacksonAnnotationIntrospector48.findWrapperName(annotated49);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector51 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray52 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector48, jacksonAnnotationIntrospector51 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList53 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList53, annotationIntrospectorArray52);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection55 = jacksonAnnotationIntrospector47.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList53);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder56 = jacksonAnnotationIntrospector47._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder57 = jacksonAnnotationIntrospector47._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder58 = jacksonAnnotationIntrospector47._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection59 = jacksonAnnotationIntrospector47.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder60 = jacksonAnnotationIntrospector47._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version61 = jacksonAnnotationIntrospector47.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember62 = null;
        java.lang.String str63 = jacksonAnnotationIntrospector47.findImplicitPropertyName(annotatedMember62);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector64 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector47);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass65 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName66 = jacksonAnnotationIntrospector47.findRootName(annotatedClass65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection38);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(annotationIntrospector45);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder46);
        org.junit.Assert.assertNull(propertyName50);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection55);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder56);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder57);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder58);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection59);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(annotationIntrospector64);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        java.lang.String str12 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember11);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector20.findWrapperName(annotated21);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray24 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector20, jacksonAnnotationIntrospector23 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList25 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList25, annotationIntrospectorArray24);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection27 = jacksonAnnotationIntrospector19.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList25);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection28 = jacksonAnnotationIntrospector16.allIntrospectors(annotationIntrospectorCollection27);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection27);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        java.lang.String str31 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember30);
        com.fasterxml.jackson.core.Version version32 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version33 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version34 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean36 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection27);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection28);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(version34);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        java.lang.String str13 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember12);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findDeserializer(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName31 = jacksonAnnotationIntrospector29.findWrapperName(annotated30);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated34 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName35 = jacksonAnnotationIntrospector33.findWrapperName(annotated34);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector36 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray37 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33, jacksonAnnotationIntrospector36 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList38 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList38, annotationIntrospectorArray37);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection40 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList38);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection41 = jacksonAnnotationIntrospector29.allIntrospectors(annotationIntrospectorCollection40);
        com.fasterxml.jackson.core.Version version42 = jacksonAnnotationIntrospector29.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection43 = jacksonAnnotationIntrospector29.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector44 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector29);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector45 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector29);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = jacksonAnnotationIntrospector15.hasAnyGetterAnnotation(annotatedMethod46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNull(propertyName31);
        org.junit.Assert.assertNull(propertyName35);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection40);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection41);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection43);
        org.junit.Assert.assertNotNull(annotationIntrospector44);
        org.junit.Assert.assertNotNull(annotationIntrospector45);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder43 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector25._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated47 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName48 = jacksonAnnotationIntrospector25.findWrapperName(annotated47);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection49 = jacksonAnnotationIntrospector25.allIntrospectors();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder43);
        org.junit.Assert.assertNotNull(propertyName46);
        org.junit.Assert.assertNull(propertyName48);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection49);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.core.Version version29 = jacksonAnnotationIntrospector26.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName32 = jacksonAnnotationIntrospector30.findWrapperName(annotated31);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated35 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName36 = jacksonAnnotationIntrospector34.findWrapperName(annotated35);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector37 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray38 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector34, jacksonAnnotationIntrospector37 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList39 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList39, annotationIntrospectorArray38);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection41 = jacksonAnnotationIntrospector33.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList39);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection42 = jacksonAnnotationIntrospector30.allIntrospectors(annotationIntrospectorCollection41);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection43 = jacksonAnnotationIntrospector30.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector30._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector47 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector30);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder48 = jacksonAnnotationIntrospector26._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember49 = null;
        java.lang.String str50 = jacksonAnnotationIntrospector26.findImplicitPropertyName(annotatedMember49);
        com.fasterxml.jackson.databind.introspect.Annotated annotated51 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName52 = jacksonAnnotationIntrospector26.findWrapperName(annotated51);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector53 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated54 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName55 = jacksonAnnotationIntrospector53.findWrapperName(annotated54);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector56 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector57 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated58 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName59 = jacksonAnnotationIntrospector57.findWrapperName(annotated58);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector60 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray61 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector57, jacksonAnnotationIntrospector60 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList62 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList62, annotationIntrospectorArray61);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection64 = jacksonAnnotationIntrospector56.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList62);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection65 = jacksonAnnotationIntrospector53.allIntrospectors(annotationIntrospectorCollection64);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember66 = null;
        java.lang.String str67 = jacksonAnnotationIntrospector53.findImplicitPropertyName(annotatedMember66);
        com.fasterxml.jackson.databind.introspect.Annotated annotated68 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName69 = jacksonAnnotationIntrospector53.findWrapperName(annotated68);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector70 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector71 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated72 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName73 = jacksonAnnotationIntrospector71.findWrapperName(annotated72);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector74 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray75 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector71, jacksonAnnotationIntrospector74 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList76 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList76, annotationIntrospectorArray75);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection78 = jacksonAnnotationIntrospector70.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList76);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection79 = jacksonAnnotationIntrospector53.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList76);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection80 = jacksonAnnotationIntrospector26.allIntrospectors(annotationIntrospectorCollection79);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection81 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection80);
        com.fasterxml.jackson.databind.introspect.Annotated annotated82 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode83 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNull(propertyName32);
        org.junit.Assert.assertNull(propertyName36);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection41);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection42);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection43);
        org.junit.Assert.assertNotNull(propertyName46);
        org.junit.Assert.assertNotNull(annotationIntrospector47);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(propertyName52);
        org.junit.Assert.assertNull(propertyName55);
        org.junit.Assert.assertNull(propertyName59);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection64);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(propertyName69);
        org.junit.Assert.assertNull(propertyName73);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection78);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection79);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection80);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection81);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo13 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember15);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = null;
        java.lang.String str20 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember19);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(propertyName16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing10 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember27 = null;
        java.lang.String str28 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember27);
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = jacksonAnnotationIntrospector0.findWrapperName(annotated29);
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList32 = jacksonAnnotationIntrospector0.findSubtypes(annotated31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(propertyName30);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector43 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated44 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName45 = jacksonAnnotationIntrospector43.findWrapperName(annotated44);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector46 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector47 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated48 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName49 = jacksonAnnotationIntrospector47.findWrapperName(annotated48);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector50 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray51 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector47, jacksonAnnotationIntrospector50 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList52 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList52, annotationIntrospectorArray51);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection54 = jacksonAnnotationIntrospector46.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList52);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection55 = jacksonAnnotationIntrospector43.allIntrospectors(annotationIntrospectorCollection54);
        com.fasterxml.jackson.core.Version version56 = jacksonAnnotationIntrospector43.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder57 = jacksonAnnotationIntrospector43._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector58 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector43);
        com.fasterxml.jackson.databind.introspect.Annotated annotated59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray60 = jacksonAnnotationIntrospector25.findPropertiesToIgnore(annotated59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNull(propertyName45);
        org.junit.Assert.assertNull(propertyName49);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection54);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection55);
        org.junit.Assert.assertNotNull(version56);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder57);
        org.junit.Assert.assertNotNull(annotationIntrospector58);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jacksonAnnotationIntrospector0.findDeserializationType(annotated17, javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(propertyName16);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder27 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection28 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder27);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection28);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        java.lang.String str12 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember11);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.PropertyName propertyName45 = jacksonAnnotationIntrospector25._propertyName("", "");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection46 = jacksonAnnotationIntrospector25.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value48 = jacksonAnnotationIntrospector25.findPOJOBuilderConfig(annotatedClass47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(propertyName45);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection46);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing23 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(propertyName16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(propertyName21);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        java.lang.String str19 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection20 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder21 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector0.findWrapperName(annotated22);
        com.fasterxml.jackson.core.Version version24 = jacksonAnnotationIntrospector0.version();
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection20);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder21);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertNotNull(version24);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector27.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName33 = jacksonAnnotationIntrospector31.findWrapperName(annotated32);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray35 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector31, jacksonAnnotationIntrospector34 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList36 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36, annotationIntrospectorArray35);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection38 = jacksonAnnotationIntrospector30.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector27.allIntrospectors(annotationIntrospectorCollection38);
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember41 = null;
        java.lang.String str42 = jacksonAnnotationIntrospector27.findImplicitPropertyName(annotatedMember41);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection43 = jacksonAnnotationIntrospector27.allIntrospectors();
        com.fasterxml.jackson.core.Version version44 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector45 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector27);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection46 = annotationIntrospector45.allIntrospectors();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection38);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(annotationIntrospector45);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection46);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = null;
        java.lang.String str26 = jacksonAnnotationIntrospector13.findImplicitPropertyName(annotatedMember25);
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector13._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean31 = jacksonAnnotationIntrospector13.isIgnorableType(annotatedClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(propertyName29);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector2.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray6 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector2, jacksonAnnotationIntrospector5 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList7 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7, annotationIntrospectorArray6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder14 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder19 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = jacksonAnnotationIntrospector1.findPropertyDescription(annotated21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder14);
        org.junit.Assert.assertNotNull(propertyName17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder19);
        org.junit.Assert.assertNotNull(annotationIntrospector20);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = null;
        java.lang.String str17 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember16);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include21 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated19, include20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector2.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray6 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector2, jacksonAnnotationIntrospector5 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList7 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7, annotationIntrospectorArray6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder14 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder16 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector1.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder14);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder16);
        org.junit.Assert.assertNull(propertyName18);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jacksonAnnotationIntrospector0._isIgnorable(annotated18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNotNull(propertyName17);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = jacksonAnnotationIntrospector0.findWrapperName(annotated29);
        com.fasterxml.jackson.core.Version version31 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = jacksonAnnotationIntrospector0.findKeySerializer(annotated32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNotNull(propertyName28);
        org.junit.Assert.assertNull(propertyName30);
        org.junit.Assert.assertNotNull(version31);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version25 = jacksonAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector27.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray31 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector27, jacksonAnnotationIntrospector30 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList32 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList32, annotationIntrospectorArray31);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection34 = jacksonAnnotationIntrospector26.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList32);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector26._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder36 = jacksonAnnotationIntrospector26._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = null;
        java.lang.String str39 = jacksonAnnotationIntrospector26.findImplicitPropertyName(annotatedMember38);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector40 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector41 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26, annotationIntrospector40);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean44 = jacksonAnnotationIntrospector26.findSerializationSortAlphabetically(annotatedClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder36);
        org.junit.Assert.assertNotNull(annotationIntrospector37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(annotationIntrospector41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0.findWrapperName(annotated12);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector19.findWrapperName(annotated20);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray23 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector19, jacksonAnnotationIntrospector22 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList24 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24, annotationIntrospectorArray23);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector18.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder27 = jacksonAnnotationIntrospector18._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder28 = jacksonAnnotationIntrospector18._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder29 = jacksonAnnotationIntrospector18._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version30 = jacksonAnnotationIntrospector18.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated33 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName34 = jacksonAnnotationIntrospector32.findWrapperName(annotated33);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector35 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray36 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector32, jacksonAnnotationIntrospector35 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList37 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37, annotationIntrospectorArray36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector31.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder40 = jacksonAnnotationIntrospector31._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector31._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector18, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector31);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector43 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector44 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated45 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector44.findWrapperName(annotated45);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector47 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray48 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector44, jacksonAnnotationIntrospector47 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList49 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList49, annotationIntrospectorArray48);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection51 = jacksonAnnotationIntrospector43.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList49);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder52 = jacksonAnnotationIntrospector43._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder53 = jacksonAnnotationIntrospector43._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember54 = null;
        java.lang.String str55 = jacksonAnnotationIntrospector43.findImplicitPropertyName(annotatedMember54);
        com.fasterxml.jackson.databind.PropertyName propertyName58 = jacksonAnnotationIntrospector43._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder59 = jacksonAnnotationIntrospector43._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector60 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector42, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector43);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector61 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder62 = jacksonAnnotationIntrospector61._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection63 = jacksonAnnotationIntrospector61.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector64 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector60, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector61);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection65 = annotationIntrospector64.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection66 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection65);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder67 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.lang.Class<?> wildcardClass68 = jacksonAnnotationIntrospector0.getClass();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNotNull(propertyName17);
        org.junit.Assert.assertNull(propertyName21);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder27);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder28);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNull(propertyName34);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNull(propertyName46);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection51);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder52);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(propertyName58);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder59);
        org.junit.Assert.assertNotNull(annotationIntrospector60);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder62);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection63);
        org.junit.Assert.assertNotNull(annotationIntrospector64);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection65);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection66);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        java.lang.String str19 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection20 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder21 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector0.findWrapperName(annotated22);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value25 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection20);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder21);
        org.junit.Assert.assertNull(propertyName23);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        java.lang.String str19 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection20 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection20);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember13);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.lang.annotation.Annotation annotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector19.findWrapperName(annotated20);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray23 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector19, jacksonAnnotationIntrospector22 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList24 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24, annotationIntrospectorArray23);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector18.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder27 = jacksonAnnotationIntrospector18._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder28 = jacksonAnnotationIntrospector18._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder29 = jacksonAnnotationIntrospector18._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version30 = jacksonAnnotationIntrospector18.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated33 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName34 = jacksonAnnotationIntrospector32.findWrapperName(annotated33);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector35 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray36 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector32, jacksonAnnotationIntrospector35 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList37 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37, annotationIntrospectorArray36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector31.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder40 = jacksonAnnotationIntrospector31._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector31._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector18, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector31);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector43 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector44 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated45 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector44.findWrapperName(annotated45);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector47 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray48 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector44, jacksonAnnotationIntrospector47 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList49 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList49, annotationIntrospectorArray48);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection51 = jacksonAnnotationIntrospector43.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList49);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder52 = jacksonAnnotationIntrospector43._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder53 = jacksonAnnotationIntrospector43._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember54 = null;
        java.lang.String str55 = jacksonAnnotationIntrospector43.findImplicitPropertyName(annotatedMember54);
        com.fasterxml.jackson.databind.PropertyName propertyName58 = jacksonAnnotationIntrospector43._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder59 = jacksonAnnotationIntrospector43._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector60 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector42, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector43);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector61 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder62 = jacksonAnnotationIntrospector61._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection63 = jacksonAnnotationIntrospector61.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector64 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector60, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector61);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection65 = annotationIntrospector64.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection66 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection65);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder67 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNotNull(propertyName17);
        org.junit.Assert.assertNull(propertyName21);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder27);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder28);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNull(propertyName34);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNull(propertyName46);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection51);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder52);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(propertyName58);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder59);
        org.junit.Assert.assertNotNull(annotationIntrospector60);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder62);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection63);
        org.junit.Assert.assertNotNull(annotationIntrospector64);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection65);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection66);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder67);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jacksonAnnotationIntrospector0._isIgnorable(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version14 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember15);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember27 = null;
        java.lang.String str28 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember27);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = null;
        java.lang.String str17 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember16);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection19 = jacksonAnnotationIntrospector0.allIntrospectors();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection19);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        java.lang.String str12 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember11);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector20.findWrapperName(annotated21);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray24 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector20, jacksonAnnotationIntrospector23 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList25 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList25, annotationIntrospectorArray24);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection27 = jacksonAnnotationIntrospector19.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList25);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection28 = jacksonAnnotationIntrospector16.allIntrospectors(annotationIntrospectorCollection27);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection27);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        java.lang.String str31 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember30);
        com.fasterxml.jackson.core.Version version32 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version33 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection34 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing36 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection27);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection28);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection34);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray22 = jacksonAnnotationIntrospector0.findViews(annotated21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(propertyName20);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector8.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray12 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector8, jacksonAnnotationIntrospector11 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList13 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList13, annotationIntrospectorArray12);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector7.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector4.allIntrospectors(annotationIntrospectorCollection15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector4.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector4._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector21 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector4);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version23 = jacksonAnnotationIntrospector0.version();
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNotNull(annotationIntrospector21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(version23);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector2.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray6 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector2, jacksonAnnotationIntrospector5 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList7 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7, annotationIntrospectorArray6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder14 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder19 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = jacksonAnnotationIntrospector1.findValueInstantiator(annotatedClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder14);
        org.junit.Assert.assertNotNull(propertyName17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder19);
        org.junit.Assert.assertNotNull(annotationIntrospector20);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember15);
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector0.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated19, javaType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(propertyName18);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = null;
        java.lang.String str26 = jacksonAnnotationIntrospector13.findImplicitPropertyName(annotatedMember25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13, annotationIntrospector27);
        com.fasterxml.jackson.core.Version version29 = jacksonAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = jacksonAnnotationIntrospector13.hasIgnoreMarker(annotatedMember30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(annotationIntrospector28);
        org.junit.Assert.assertNotNull(version29);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName27 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(propertyName12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.PropertyName propertyName45 = jacksonAnnotationIntrospector25._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember46 = null;
        java.lang.String str47 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember46);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean49 = jacksonAnnotationIntrospector25.findSerializationSortAlphabetically(annotatedClass48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(propertyName45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector27.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName33 = jacksonAnnotationIntrospector31.findWrapperName(annotated32);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray35 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector31, jacksonAnnotationIntrospector34 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList36 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36, annotationIntrospectorArray35);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection38 = jacksonAnnotationIntrospector30.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector27.allIntrospectors(annotationIntrospectorCollection38);
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember41 = null;
        java.lang.String str42 = jacksonAnnotationIntrospector27.findImplicitPropertyName(annotatedMember41);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection43 = jacksonAnnotationIntrospector27.allIntrospectors();
        com.fasterxml.jackson.core.Version version44 = jacksonAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector45 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector27);
        com.fasterxml.jackson.core.Version version46 = jacksonAnnotationIntrospector15.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray49 = jacksonAnnotationIntrospector15.findPropertiesToIgnore(annotated47, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection38);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(annotationIntrospector45);
        org.junit.Assert.assertNotNull(version46);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo14 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated12, objectIdInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = null;
        java.lang.String str26 = jacksonAnnotationIntrospector13.findImplicitPropertyName(annotatedMember25);
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector13._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = jacksonAnnotationIntrospector13.findDeserializationKeyType(annotated30, javaType31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(propertyName29);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include29 = jacksonAnnotationIntrospector15.findSerializationInclusion(annotated27, include28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember13);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = jacksonAnnotationIntrospector0.findDeserializer(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember13);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName19 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(propertyName19);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember15);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder19 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty21 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder19);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray23 = jacksonAnnotationIntrospector0.findViews(annotated22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNotNull(propertyName16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(propertyName21);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.PropertyName propertyName45 = jacksonAnnotationIntrospector25._propertyName("", "");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection46 = jacksonAnnotationIntrospector25.allIntrospectors();
        com.fasterxml.jackson.core.Version version47 = jacksonAnnotationIntrospector25.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value49 = jacksonAnnotationIntrospector25.findFormat(annotated48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(propertyName45);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection46);
        org.junit.Assert.assertNotNull(version47);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = null;
        java.lang.String str26 = jacksonAnnotationIntrospector13.findImplicitPropertyName(annotatedMember25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13, annotationIntrospector27);
        com.fasterxml.jackson.core.Version version29 = jacksonAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = jacksonAnnotationIntrospector13.hasAnySetterAnnotation(annotatedMethod30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(annotationIntrospector28);
        org.junit.Assert.assertNotNull(version29);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.core.Version version25 = jacksonAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean27 = jacksonAnnotationIntrospector13.isTypeId(annotatedMember26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNotNull(version25);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder43 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder43);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version14 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jacksonAnnotationIntrospector0._isIgnorable(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNotNull(version14);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(propertyName13);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access28 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder43 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector25._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated47 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName48 = jacksonAnnotationIntrospector25.findWrapperName(annotated47);
        com.fasterxml.jackson.databind.introspect.Annotated annotated49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = jacksonAnnotationIntrospector25.findContentSerializer(annotated49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder43);
        org.junit.Assert.assertNotNull(propertyName46);
        org.junit.Assert.assertNull(propertyName48);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector0.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector16.findWrapperName(annotated17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray20 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector16, jacksonAnnotationIntrospector19 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21, annotationIntrospectorArray20);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector15.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector15._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder26 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version27 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated28, javaType29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder26);
        org.junit.Assert.assertNotNull(version27);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        java.lang.String str15 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        java.lang.String str19 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember18);
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include22 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated20, include21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = jacksonAnnotationIntrospector0.findWrapperName(annotated29);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder31 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNotNull(propertyName28);
        org.junit.Assert.assertNull(propertyName30);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder31);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray8 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector4, jacksonAnnotationIntrospector7 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList9 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9, annotationIntrospectorArray8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector3.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection11);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version25 = jacksonAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector27.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray31 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector27, jacksonAnnotationIntrospector30 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList32 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList32, annotationIntrospectorArray31);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection34 = jacksonAnnotationIntrospector26.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList32);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector26._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder36 = jacksonAnnotationIntrospector26._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = null;
        java.lang.String str39 = jacksonAnnotationIntrospector26.findImplicitPropertyName(annotatedMember38);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector40 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector41 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26, annotationIntrospector40);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector26);
        com.fasterxml.jackson.core.Version version43 = jacksonAnnotationIntrospector26.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = jacksonAnnotationIntrospector26.findDeserializationConverter(annotated44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder36);
        org.junit.Assert.assertNotNull(annotationIntrospector37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(annotationIntrospector41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(version43);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector4.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector8.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray12 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector8, jacksonAnnotationIntrospector11 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList13 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList13, annotationIntrospectorArray12);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector7.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector4.allIntrospectors(annotationIntrospectorCollection15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector4.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector4._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector21 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector4);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = null;
        java.lang.String str24 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = jacksonAnnotationIntrospector0.findWrapperName(annotated25);
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = jacksonAnnotationIntrospector0.findSerializer(annotated27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNotNull(annotationIntrospector21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(propertyName26);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = jacksonAnnotationIntrospector0.findWrapperName(annotated25);
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo29 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated27, objectIdInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName26);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int6 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0.findWrapperName(annotated14);
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNull(propertyName15);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findContentSerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector1.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray5 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1, jacksonAnnotationIntrospector4 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6, annotationIntrospectorArray5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version12 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector14.findWrapperName(annotated15);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray18 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14, jacksonAnnotationIntrospector17 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList19 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19, annotationIntrospectorArray18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList19);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = jacksonAnnotationIntrospector26.findWrapperName(annotated27);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray30 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26, jacksonAnnotationIntrospector29 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList31 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31, annotationIntrospectorArray30);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection33 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList31);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder34 = jacksonAnnotationIntrospector25._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder35 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        java.lang.String str37 = jacksonAnnotationIntrospector25.findImplicitPropertyName(annotatedMember36);
        com.fasterxml.jackson.databind.PropertyName propertyName40 = jacksonAnnotationIntrospector25._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector25._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector25);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector43 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder44 = jacksonAnnotationIntrospector43._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection45 = jacksonAnnotationIntrospector43.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector46 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector42, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector43);
        com.fasterxml.jackson.core.Version version47 = jacksonAnnotationIntrospector43.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = jacksonAnnotationIntrospector43.findDeserializationContentConverter(annotatedMember48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection33);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder34);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(propertyName40);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNotNull(annotationIntrospector42);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder44);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection45);
        org.junit.Assert.assertNotNull(annotationIntrospector46);
        org.junit.Assert.assertNotNull(version47);
    }
}

