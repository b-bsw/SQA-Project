package org.mockito.internal.configuration;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.Class<?> wildcardClass1 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.Class<?> wildcardClass4 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.Class<?> wildcardClass13 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.Class<?> wildcardClass16 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.Class<?> wildcardClass10 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.Class<?> wildcardClass22 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = obj21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.Class<?> wildcardClass7 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = obj27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.Class<?> wildcardClass19 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = obj24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.Class<?> wildcardClass28 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.Class<?> wildcardClass31 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.Class<?> wildcardClass25 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.Class<?> wildcardClass34 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.Class<?> wildcardClass37 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = obj30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = obj36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = obj42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = obj39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = obj48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.Class<?> wildcardClass43 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.Class<?> wildcardClass46 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.Class<?> wildcardClass49 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = obj45.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.Class<?> wildcardClass40 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = obj33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.Class<?> wildcardClass55 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass52 = obj51.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.Class<?> wildcardClass52 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = obj54.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.Class<?> wildcardClass58 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.annotation.Annotation annotation58 = null;
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = spyAnnotationEngine0.createMockFor(annotation58, field59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = obj60.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass58 = obj57.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.annotation.Annotation annotation58 = null;
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = spyAnnotationEngine0.createMockFor(annotation58, field59);
        java.lang.annotation.Annotation annotation61 = null;
        java.lang.reflect.Field field62 = null;
        java.lang.Object obj63 = spyAnnotationEngine0.createMockFor(annotation61, field62);
        java.lang.Class<?> wildcardClass64 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.annotation.Annotation annotation58 = null;
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = spyAnnotationEngine0.createMockFor(annotation58, field59);
        java.lang.annotation.Annotation annotation61 = null;
        java.lang.reflect.Field field62 = null;
        java.lang.Object obj63 = spyAnnotationEngine0.createMockFor(annotation61, field62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass64 = obj63.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.annotation.Annotation annotation58 = null;
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = spyAnnotationEngine0.createMockFor(annotation58, field59);
        java.lang.annotation.Annotation annotation61 = null;
        java.lang.reflect.Field field62 = null;
        java.lang.Object obj63 = spyAnnotationEngine0.createMockFor(annotation61, field62);
        java.lang.annotation.Annotation annotation64 = null;
        java.lang.reflect.Field field65 = null;
        java.lang.Object obj66 = spyAnnotationEngine0.createMockFor(annotation64, field65);
        java.lang.annotation.Annotation annotation67 = null;
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = spyAnnotationEngine0.createMockFor(annotation67, field68);
        java.lang.Class<?> wildcardClass70 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        java.lang.annotation.Annotation annotation10 = null;
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = spyAnnotationEngine0.createMockFor(annotation10, field11);
        java.lang.annotation.Annotation annotation13 = null;
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = spyAnnotationEngine0.createMockFor(annotation13, field14);
        java.lang.annotation.Annotation annotation16 = null;
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = spyAnnotationEngine0.createMockFor(annotation16, field17);
        java.lang.annotation.Annotation annotation19 = null;
        java.lang.reflect.Field field20 = null;
        java.lang.Object obj21 = spyAnnotationEngine0.createMockFor(annotation19, field20);
        java.lang.annotation.Annotation annotation22 = null;
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = spyAnnotationEngine0.createMockFor(annotation22, field23);
        java.lang.annotation.Annotation annotation25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = spyAnnotationEngine0.createMockFor(annotation25, field26);
        java.lang.annotation.Annotation annotation28 = null;
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = spyAnnotationEngine0.createMockFor(annotation28, field29);
        java.lang.annotation.Annotation annotation31 = null;
        java.lang.reflect.Field field32 = null;
        java.lang.Object obj33 = spyAnnotationEngine0.createMockFor(annotation31, field32);
        java.lang.annotation.Annotation annotation34 = null;
        java.lang.reflect.Field field35 = null;
        java.lang.Object obj36 = spyAnnotationEngine0.createMockFor(annotation34, field35);
        java.lang.annotation.Annotation annotation37 = null;
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = spyAnnotationEngine0.createMockFor(annotation37, field38);
        java.lang.annotation.Annotation annotation40 = null;
        java.lang.reflect.Field field41 = null;
        java.lang.Object obj42 = spyAnnotationEngine0.createMockFor(annotation40, field41);
        java.lang.annotation.Annotation annotation43 = null;
        java.lang.reflect.Field field44 = null;
        java.lang.Object obj45 = spyAnnotationEngine0.createMockFor(annotation43, field44);
        java.lang.annotation.Annotation annotation46 = null;
        java.lang.reflect.Field field47 = null;
        java.lang.Object obj48 = spyAnnotationEngine0.createMockFor(annotation46, field47);
        java.lang.annotation.Annotation annotation49 = null;
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = spyAnnotationEngine0.createMockFor(annotation49, field50);
        java.lang.annotation.Annotation annotation52 = null;
        java.lang.reflect.Field field53 = null;
        java.lang.Object obj54 = spyAnnotationEngine0.createMockFor(annotation52, field53);
        java.lang.annotation.Annotation annotation55 = null;
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = spyAnnotationEngine0.createMockFor(annotation55, field56);
        java.lang.annotation.Annotation annotation58 = null;
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = spyAnnotationEngine0.createMockFor(annotation58, field59);
        java.lang.annotation.Annotation annotation61 = null;
        java.lang.reflect.Field field62 = null;
        java.lang.Object obj63 = spyAnnotationEngine0.createMockFor(annotation61, field62);
        java.lang.annotation.Annotation annotation64 = null;
        java.lang.reflect.Field field65 = null;
        java.lang.Object obj66 = spyAnnotationEngine0.createMockFor(annotation64, field65);
        java.lang.annotation.Annotation annotation67 = null;
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = spyAnnotationEngine0.createMockFor(annotation67, field68);
        java.lang.annotation.Annotation annotation70 = null;
        java.lang.reflect.Field field71 = null;
        java.lang.Object obj72 = spyAnnotationEngine0.createMockFor(annotation70, field71);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
    }
}

