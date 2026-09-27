package com.fasterxml.jackson.databind.introspect;

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
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty3 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing7 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo6 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated4, objectIdInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing9 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findDeserializationType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray7 = jacksonAnnotationIntrospector0.findViews(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo8 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findFilterId(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0._isIgnorable(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findKeySerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findKeySerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value13 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findDeserializationType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findSerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.lang.Class<?> wildcardClass2 = version1.getClass();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray14 = jacksonAnnotationIntrospector9.findViews(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findNullSerializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int6 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        java.lang.annotation.Annotation annotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector0.findDeserializationType(annotated9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector0.findSerializationType(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jacksonAnnotationIntrospector9.hasAsValueAnnotation(annotatedMethod13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.getClass();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value5 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty7 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector0._isIgnorable(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findContentSerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jacksonAnnotationIntrospector9.hasAnySetterAnnotation(annotatedMethod16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findRootName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo6 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated4, objectIdInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value8 = jacksonAnnotationIntrospector0.findFormat(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value13 = jacksonAnnotationIntrospector0.findFormat(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationType(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include7 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated5, include6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        java.lang.Class<?> wildcardClass9 = version8.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing10 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findSerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value10 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector0._isIgnorable(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value7 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated6, include7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing10 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findDeserializationType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value3 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated3, objectIdInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findFilterId(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value9 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0._isIgnorable(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0._findFilterId(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated8, objectIdInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jacksonAnnotationIntrospector0._findFilterId(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.lang.annotation.Annotation annotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing8 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector0.findDeserializationType(annotated9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = jacksonAnnotationIntrospector9.findValueInstantiator(annotatedClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include11 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated9, include10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findDeserializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo12 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findSerializationType(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findFilterId(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jacksonAnnotationIntrospector9.hasAnyGetterAnnotation(annotatedMethod16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        java.lang.annotation.Annotation annotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value8 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector0._isIgnorable(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty8 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findContentSerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated8, objectIdInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode11 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated7, objectIdInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findSerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = jacksonAnnotationIntrospector9.findKeyDeserializer(annotated17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findContentSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty11 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0._findFilterId(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList10 = jacksonAnnotationIntrospector0.findSubtypes(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0._findFilterId(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty14 = jacksonAnnotationIntrospector9.findReferenceType(annotatedMember13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        java.lang.Class<?> wildcardClass5 = annotationIntrospectorCollection4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access8 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList14 = jacksonAnnotationIntrospector0.findSubtypes(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jacksonAnnotationIntrospector9.findInjectableValueId(annotatedMember13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findContentSerializer(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0._isIgnorable(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findSerializationType(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList7 = jacksonAnnotationIntrospector0.findSubtypes(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector0._isIgnorable(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value7 = jacksonAnnotationIntrospector0.findFormat(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findNullSerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector0.findKeySerializer(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value11 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findRootName(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector0.findSerializationType(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jacksonAnnotationIntrospector0.findKeySerializer(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access6 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = jacksonAnnotationIntrospector9._findFilterId(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = propertyName5.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = jacksonAnnotationIntrospector9._findFilterId(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findNullSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated6, include7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findDeserializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findKeySerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include13 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated11, include12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value7 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector0.findDeserializer(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value9 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector0.findDeserializer(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0._isIgnorable(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findContentSerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector6.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector6.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector6.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList9 = jacksonAnnotationIntrospector0.findSubtypes(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.lang.annotation.Annotation annotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray8 = jacksonAnnotationIntrospector0.findViews(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo19 = jacksonAnnotationIntrospector9.findObjectReferenceInfo(annotated17, objectIdInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = jacksonAnnotationIntrospector9.findIgnoreUnknownProperties(annotatedClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode9 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        java.lang.annotation.Annotation annotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jacksonAnnotationIntrospector9.isAnnotationBundle(annotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findKeySerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findRootName(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector0.findKeySerializer(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findDeserializationType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value7 = jacksonAnnotationIntrospector0.findFormat(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findKeySerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray11 = jacksonAnnotationIntrospector0.findViews(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findKeySerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findKeySerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include16 = jacksonAnnotationIntrospector9.findSerializationInclusionForContent(annotated14, include15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(propertyName9);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jacksonAnnotationIntrospector9.hasAsValueAnnotation(annotatedMethod17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value9 = jacksonAnnotationIntrospector0.findFormat(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findSerializationType(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findFilterId(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = jacksonAnnotationIntrospector9.findSerializationContentConverter(annotatedMember14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jacksonAnnotationIntrospector9.hasAsValueAnnotation(annotatedMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include6 = jacksonAnnotationIntrospector1.findSerializationInclusionForContent(annotated4, include5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0._findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value8 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findSerializationType(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated6, include7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector9.findNameForSerialization(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access5 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jacksonAnnotationIntrospector9.findDeserializationKeyType(annotated14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findContentSerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray8 = jacksonAnnotationIntrospector0.findViews(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findKeySerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector6.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector6._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector6.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = jacksonAnnotationIntrospector6._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector6.findWrapperName(annotated12);
        com.fasterxml.jackson.core.Version version14 = jacksonAnnotationIntrospector6.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector15.allIntrospectors();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector15.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector15);
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector15._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection22 = jacksonAnnotationIntrospector15.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection23 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(annotationIntrospector18);
        org.junit.Assert.assertNotNull(propertyName21);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection22);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated8, objectIdInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access10 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList9 = jacksonAnnotationIntrospector0.findSubtypes(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include10 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated8, include9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        java.lang.String str7 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray9 = jacksonAnnotationIntrospector0.findViews(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findKeySerializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include10 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated8, include9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value9 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray11 = jacksonAnnotationIntrospector0.findViews(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing8 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing15 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
        org.junit.Assert.assertNotNull(propertyName13);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing8 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated7, objectIdInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.core.Version version7 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value10 = jacksonAnnotationIntrospector0.findFormat(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access15 = jacksonAnnotationIntrospector9.findPropertyAccess(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findNullSerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated6, include7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector0.findDeserializationType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include9 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated7, include8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findDeserializationType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated8, objectIdInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include7 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated5, include6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName19 = jacksonAnnotationIntrospector9._propertyName("hi!", "hi!");
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(propertyName19);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing9 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector1.version();
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = jacksonAnnotationIntrospector9.findFilterId(annotatedClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray7 = jacksonAnnotationIntrospector0.findViews(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.core.Version version11 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector9._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo17 = jacksonAnnotationIntrospector9.findObjectIdInfo(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(propertyName15);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray5 = jacksonAnnotationIntrospector1.findViews(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access8 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access9 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo11 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationType(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0.findWrapperName(annotated12);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0.findWrapperName(annotated7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList12 = jacksonAnnotationIntrospector0.findSubtypes(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(propertyName9);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0._propertyName("", "");
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
        org.junit.Assert.assertNotNull(propertyName13);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findWrapperName(annotated2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNull(propertyName3);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector0._isIgnorable(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated6, include7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findWrapperName(annotated8);
        java.lang.annotation.Annotation annotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector0.isAnnotationBundle(annotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(propertyName9);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value15 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(propertyName10);
        org.junit.Assert.assertNotNull(propertyName13);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jacksonAnnotationIntrospector0.findPropertyDefaultValue(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(propertyName9);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0._findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector0.allIntrospectors();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo6 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.core.Version version9 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(propertyName8);
        org.junit.Assert.assertNotNull(version9);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection1 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0.findWrapperName(annotated5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector0.findFilterId(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }
}

