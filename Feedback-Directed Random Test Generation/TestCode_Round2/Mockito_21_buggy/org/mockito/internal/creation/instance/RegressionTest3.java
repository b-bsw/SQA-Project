package org.mockito.internal.creation.instance;

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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        java.lang.Class<?> wildcardClass17 = constructorInstantiator16.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator18 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator16);
        java.lang.Class<?> wildcardClass19 = constructorInstantiator18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass17 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        java.lang.Class<?> wildcardClass17 = constructorInstantiator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator16);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) '4');
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) '4');
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass17 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator18 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

