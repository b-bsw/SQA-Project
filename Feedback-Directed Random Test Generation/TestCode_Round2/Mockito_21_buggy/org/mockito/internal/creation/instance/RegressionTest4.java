package org.mockito.internal.creation.instance;

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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator13.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator16);
        java.lang.Class<?> wildcardClass18 = constructorInstantiator17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        java.lang.Class<?> wildcardClass14 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator15);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        java.lang.Class<?> wildcardClass16 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = constructorInstantiator17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
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
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) ' ');
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass16 = constructorInstantiator14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.Class<?> wildcardClass11 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator14.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator15 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.Class<?> wildcardClass14 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator17 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator14);
        java.lang.Class<?> wildcardClass18 = constructorInstantiator17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        java.lang.Class<?> wildcardClass15 = constructorInstantiator13.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator16 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        java.lang.Class<?> wildcardClass14 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        java.lang.Class<?> wildcardClass13 = constructorInstantiator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator11.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0f));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator12);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        java.lang.Class<?> wildcardClass8 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        java.lang.Class<?> wildcardClass12 = constructorInstantiator9.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator13 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass12);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator14 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator13);
        java.lang.Class<?> wildcardClass15 = constructorInstantiator13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        java.lang.Class<?> wildcardClass10 = constructorInstantiator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator7.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator11 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator10);
        java.lang.Class<?> wildcardClass12 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = constructorInstantiator8.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass11 = constructorInstantiator10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator12 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator11);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass6);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator7);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator9 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator10 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = constructorInstantiator6.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator8 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator6);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

