package org.jfree.chart.util;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Class<?> wildcardClass2 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Class<?> wildcardClass2 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.awt.Shape shape4 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '4', shape2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 0);
        java.lang.Object obj18 = shapeList15.clone();
        boolean boolean19 = shapeList8.equals(obj18);
        boolean boolean20 = shapeList0.equals((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.lang.Class<?> wildcardClass11 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        java.awt.Shape shape11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.lang.Class<?> wildcardClass11 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape24 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        java.lang.Class<?> wildcardClass22 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        int int10 = shapeList8.size();
        java.lang.Object obj11 = shapeList8.clone();
        boolean boolean12 = shapeList0.equals(obj11);
        java.lang.Class<?> wildcardClass13 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.lang.Class<?> wildcardClass10 = shapeList3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        java.lang.Class<?> wildcardClass20 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = shapeList0.getShape(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        int int8 = shapeList4.size();
        boolean boolean10 = shapeList4.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = shapeList4.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList9.clear();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        boolean boolean26 = shapeList9.equals(obj25);
        java.lang.Class<?> wildcardClass27 = shapeList9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList7.setShape((int) (short) -1, shape12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Class<?> wildcardClass13 = shapeList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass26 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = shape6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Class<?> wildcardClass3 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) (-1L));
        java.awt.Shape shape15 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = shape4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass2 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.awt.Shape shape4 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape24 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList13.setShape((int) (byte) -1, shape24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = shapeList0.getShape((-1));
        int int13 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = shape35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 100, shape13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        boolean boolean11 = shapeList0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList9.clear();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        boolean boolean26 = shapeList9.equals(obj25);
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass11 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape15 = shapeList8.getShape(100);
        boolean boolean16 = shapeList0.equals((java.lang.Object) shape15);
        java.awt.Shape shape18 = shapeList0.getShape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = shapeList0.getShape((int) '#');
        java.awt.Shape shape20 = shapeList0.getShape(33);
        java.lang.Object obj21 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        int int24 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        java.lang.Object obj29 = shapeList25.clone();
        boolean boolean30 = shapeList22.equals((java.lang.Object) shapeList25);
        java.lang.Object obj31 = shapeList22.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList22);
        java.lang.Class<?> wildcardClass33 = shapeList22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Class<?> wildcardClass24 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        java.awt.Shape shape11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        java.awt.Shape shape5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '4', shape5);
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        int int14 = shapeList7.size();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape25 = shapeList16.getShape(0);
        shapeList16.clear();
        boolean boolean27 = shapeList7.equals((java.lang.Object) shapeList16);
        shapeList16.clear();
        shapeList16.clear();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape32 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape((int) '4');
        boolean boolean23 = shapeList0.equals((java.lang.Object) '4');
        java.awt.Shape shape25 = shapeList0.getShape((int) (short) -1);
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        int int14 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        boolean boolean20 = shapeList12.equals((java.lang.Object) shapeList15);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList15);
        java.lang.Class<?> wildcardClass22 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 100, shape5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = shapeList3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = shapeList0.equals(obj14);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        java.lang.Class<?> wildcardClass19 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        java.awt.Shape shape13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape((int) (byte) 100);
        java.awt.Shape shape13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList3.setShape((int) (byte) -1, shape13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape12 = shapeList0.getShape(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = shape12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        java.awt.Shape shape14 = shapeList0.getShape(1);
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        java.lang.Class<?> wildcardClass15 = shapeList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Class<?> wildcardClass27 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape14 = shapeList0.getShape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = shape14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        shapeList0.clear();
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((-1));
        java.awt.Shape shape28 = shapeList19.getShape((int) (short) 100);
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList19);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList8);
        int int31 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = shapeList0.getShape((-1));
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        int int16 = shapeList0.size();
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) 100);
        int int24 = shapeList21.size();
        boolean boolean26 = shapeList21.equals((java.lang.Object) (byte) 0);
        boolean boolean28 = shapeList21.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        int int33 = shapeList29.size();
        boolean boolean34 = shapeList21.equals((java.lang.Object) int33);
        java.lang.Object obj35 = shapeList21.clone();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList21);
        java.lang.Class<?> wildcardClass37 = shapeList21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean17 = shapeList5.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        boolean boolean20 = shapeList5.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList5.getShape((int) (short) 100);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList5);
        shapeList5.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        int int12 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        int int26 = shapeList0.size();
        java.lang.Class<?> wildcardClass27 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        int int15 = shapeList0.size();
        java.lang.Object obj16 = null;
        boolean boolean17 = shapeList0.equals(obj16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(33);
        java.awt.Shape shape14 = shapeList0.getShape((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        shapeList9.clear();
        java.lang.Class<?> wildcardClass13 = shapeList9.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Class<?> wildcardClass26 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(9, shape9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) (-1L));
        int int14 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        shapeList0.clear();
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Class<?> wildcardClass9 = shapeList4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.awt.Shape shape6 = shapeList3.getShape(0);
        shapeList3.clear();
        shapeList3.clear();
        java.awt.Shape shape10 = shapeList3.getShape((int) 'a');
        java.lang.Object obj11 = shapeList3.clone();
        boolean boolean12 = shapeList0.equals(obj11);
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape(10);
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        shapeList0.clear();
        int int8 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList11.getShape(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = shape23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        int int12 = shapeList8.size();
        boolean boolean13 = shapeList0.equals((java.lang.Object) int12);
        int int14 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape((int) (byte) 100);
        java.lang.Object obj18 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape((int) '4');
        boolean boolean23 = shapeList0.equals((java.lang.Object) '4');
        java.awt.Shape shape25 = shapeList0.getShape((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = shape25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) 'a', shape7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        java.lang.Class<?> wildcardClass11 = shapeList7.getClass();
        boolean boolean12 = shapeList0.equals((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = shapeList0.getShape((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = shape12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(0);
        java.lang.Object obj36 = shapeList0.clone();
        int int37 = shapeList0.size();
        java.awt.Shape shape39 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        int int15 = shapeList0.size();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList7.clear();
        int int12 = shapeList7.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 100, shape9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        java.lang.Class<?> wildcardClass14 = shapeList10.getClass();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList10.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(0);
        java.lang.Object obj36 = shapeList0.clone();
        java.lang.Class<?> wildcardClass37 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 0, shape10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        java.lang.Class<?> wildcardClass37 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList3.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        boolean boolean24 = shapeList12.equals(obj23);
        shapeList12.clear();
        boolean boolean26 = shapeList3.equals((java.lang.Object) shapeList12);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        java.lang.Class<?> wildcardClass28 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.lang.Object obj24 = shapeList22.clone();
        boolean boolean25 = shapeList13.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape27 = shapeList13.getShape(1);
        java.lang.Object obj28 = shapeList13.clone();
        boolean boolean29 = shapeList7.equals(obj28);
        java.lang.Object obj30 = shapeList7.clone();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = shapeList0.getShape(9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = shape13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape(1, shape4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.lang.Object obj10 = shapeList8.clone();
        int int11 = shapeList8.size();
        java.lang.Object obj12 = shapeList8.clone();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList8);
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Object obj24 = shapeList22.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = shapeList0.equals(obj24);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape37 = shapeList27.getShape((int) (short) 0);
        int int38 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        int int41 = shapeList39.size();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.lang.Object obj44 = shapeList42.clone();
        int int45 = shapeList42.size();
        java.lang.Object obj46 = shapeList42.clone();
        boolean boolean47 = shapeList39.equals((java.lang.Object) shapeList42);
        boolean boolean48 = shapeList27.equals((java.lang.Object) shapeList42);
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape51 = shapeList27.getShape((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass52 = shape51.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(shape51);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        java.lang.Object obj14 = shapeList0.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '4', shape5);
        int int7 = shapeList0.size();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        boolean boolean9 = shapeList4.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = shapeList4.equals((java.lang.Object) (short) 100);
        shapeList4.clear();
        int int13 = shapeList4.size();
        shapeList4.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList0.clear();
        java.awt.Shape shape18 = shapeList0.getShape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        java.lang.Class<?> wildcardClass14 = shapeList10.getClass();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape17 = shapeList10.getShape((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        int int7 = shapeList3.size();
        java.awt.Shape shape9 = shapeList3.getShape((int) 'a');
        shapeList3.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        shapeList11.clear();
        int int18 = shapeList11.size();
        shapeList11.clear();
        java.awt.Shape shape21 = shapeList11.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        shapeList22.clear();
        shapeList22.clear();
        java.awt.Shape shape29 = shapeList22.getShape((-1));
        java.awt.Shape shape31 = shapeList22.getShape((int) (short) 100);
        boolean boolean32 = shapeList11.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList3.equals((java.lang.Object) shapeList11);
        java.lang.Object obj34 = shapeList3.clone();
        boolean boolean35 = shapeList0.equals(obj34);
        java.lang.Object obj36 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        int int13 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass27 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape((int) '4');
        int int5 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        int int26 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        boolean boolean30 = shapeList0.equals((java.lang.Object) int29);
        java.lang.Object obj31 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = shape8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape38 = shapeList0.getShape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = shape38.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(shape38);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape(10);
        java.awt.Shape shape13 = shapeList3.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = shapeList14.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape23 = shapeList14.getShape(0);
        java.awt.Shape shape25 = shapeList14.getShape((int) (byte) 1);
        boolean boolean26 = shapeList3.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 1);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        java.lang.Object obj33 = shapeList0.clone();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(1);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        java.lang.Object obj14 = shapeList12.clone();
        java.awt.Shape shape16 = shapeList12.getShape(33);
        int int17 = shapeList12.size();
        int int18 = shapeList12.size();
        java.lang.Class<?> wildcardClass19 = shapeList12.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(8, shape12);
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj12 = shapeList6.clone();
        java.awt.Shape shape14 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList6.setShape((int) (byte) -1, shape14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        int int26 = shapeList0.size();
        java.lang.Object obj27 = shapeList0.clone();
        java.lang.Class<?> wildcardClass28 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape15 = shapeList0.getShape(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape24 = shapeList0.getShape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        boolean boolean9 = shapeList4.equals((java.lang.Object) ' ');
        java.lang.Object obj10 = shapeList4.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Class<?> wildcardClass12 = shapeList4.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.lang.Class<?> wildcardClass7 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = shape13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = shape11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        int int9 = shapeList0.size();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = shapeList0.getShape(100);
        java.awt.Shape shape17 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(0);
        java.awt.Shape shape37 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean17 = shapeList5.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        boolean boolean20 = shapeList5.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList5.getShape((int) (short) 100);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape25 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        boolean boolean31 = shapeList26.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        int int35 = shapeList32.size();
        java.lang.Object obj36 = shapeList32.clone();
        boolean boolean37 = shapeList26.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape39 = shapeList32.getShape((int) (short) 1);
        shapeList32.clear();
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape43 = shapeList32.getShape((int) (short) 0);
        java.awt.Shape shape45 = shapeList32.getShape((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertNull(shape45);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((int) 'a');
        java.awt.Shape shape28 = shapeList19.getShape((-1));
        shapeList19.clear();
        java.awt.Shape shape31 = shapeList19.getShape((int) (short) 0);
        java.lang.Object obj32 = shapeList19.clone();
        java.lang.Object obj33 = shapeList19.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        int int36 = shapeList34.size();
        int int37 = shapeList34.size();
        int int38 = shapeList34.size();
        shapeList34.clear();
        int int40 = shapeList34.size();
        boolean boolean41 = shapeList19.equals((java.lang.Object) int40);
        boolean boolean42 = shapeList0.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        int int12 = shapeList0.size();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass23 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape24 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        int int10 = shapeList7.size();
        boolean boolean12 = shapeList7.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = shapeList7.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        boolean boolean17 = shapeList7.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape19 = shapeList14.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        shapeList20.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.lang.Object obj31 = shapeList29.clone();
        boolean boolean32 = shapeList20.equals((java.lang.Object) shapeList29);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        java.lang.Object obj35 = shapeList20.clone();
        boolean boolean36 = shapeList14.equals(obj35);
        java.lang.Object obj37 = shapeList14.clone();
        boolean boolean38 = shapeList0.equals(obj37);
        java.lang.Class<?> wildcardClass39 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape21 = shapeList14.getShape((int) 'a');
        java.lang.Object obj22 = shapeList14.clone();
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        boolean boolean26 = shapeList14.equals((java.lang.Object) int25);
        boolean boolean27 = shapeList0.equals((java.lang.Object) int25);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.awt.Shape shape6 = shapeList3.getShape(0);
        shapeList3.clear();
        shapeList3.clear();
        java.awt.Shape shape10 = shapeList3.getShape((int) 'a');
        java.lang.Object obj11 = shapeList3.clone();
        boolean boolean12 = shapeList0.equals(obj11);
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape14 = shapeList7.getShape(100);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        int int26 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        boolean boolean30 = shapeList0.equals((java.lang.Object) int29);
        int int31 = shapeList0.size();
        java.awt.Shape shape33 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        int int11 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        shapeList7.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        java.lang.Class<?> wildcardClass16 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 0);
        java.lang.Object obj15 = shapeList12.clone();
        boolean boolean16 = shapeList5.equals(obj15);
        boolean boolean17 = shapeList0.equals((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape9 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        int int8 = shapeList6.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList6.equals(obj10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape(10);
        java.awt.Shape shape13 = shapeList3.getShape((int) (short) 0);
        java.awt.Shape shape15 = shapeList3.getShape(98);
        java.awt.Shape shape17 = shapeList3.getShape((int) (short) 10);
        java.awt.Shape shape19 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList3.setShape((int) (short) -1, shape19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 1, shape6);
        int int8 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        boolean boolean37 = shapeList30.equals((java.lang.Object) (short) 100);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList30.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        boolean boolean45 = shapeList30.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList30.getShape((int) (short) 100);
        boolean boolean48 = shapeList25.equals((java.lang.Object) shapeList30);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        int int52 = shapeList49.size();
        boolean boolean54 = shapeList49.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList49);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Object obj58 = shapeList0.clone();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(8);
        java.awt.Shape shape13 = shapeList0.getShape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = shape13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        int int10 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        int int4 = shapeList0.size();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        int int4 = shapeList0.size();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = shape17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        java.lang.Object obj15 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((int) 'a');
        java.lang.Object obj20 = shapeList12.clone();
        boolean boolean21 = shapeList9.equals(obj20);
        shapeList9.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        int int25 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList11.getShape(8);
        java.awt.Shape shape25 = shapeList11.getShape((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList0.clear();
        java.awt.Shape shape14 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((-1), shape14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList7);
        java.lang.Class<?> wildcardClass12 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape16 = shapeList0.getShape(101);
        java.awt.Shape shape18 = shapeList0.getShape((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = shape18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        int int8 = shapeList4.size();
        boolean boolean10 = shapeList4.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = shapeList4.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) wildcardClass12);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj6 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        java.awt.Shape shape18 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        java.awt.Shape shape23 = shapeList19.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean28 = shapeList19.equals((java.lang.Object) int27);
        java.awt.Shape shape30 = shapeList19.getShape(0);
        boolean boolean31 = shapeList13.equals((java.lang.Object) 0);
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        int int35 = shapeList33.size();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.lang.Object obj38 = shapeList36.clone();
        int int39 = shapeList36.size();
        java.lang.Object obj40 = shapeList36.clone();
        boolean boolean41 = shapeList33.equals((java.lang.Object) shapeList36);
        boolean boolean42 = shapeList13.equals((java.lang.Object) shapeList36);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.awt.Shape shape46 = shapeList43.getShape(0);
        boolean boolean48 = shapeList43.equals((java.lang.Object) ' ');
        shapeList43.clear();
        int int50 = shapeList43.size();
        shapeList43.clear();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        boolean boolean54 = shapeList52.equals((java.lang.Object) 100);
        int int55 = shapeList52.size();
        boolean boolean57 = shapeList52.equals((java.lang.Object) (byte) 0);
        boolean boolean59 = shapeList52.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape61 = shapeList52.getShape(0);
        shapeList52.clear();
        boolean boolean63 = shapeList43.equals((java.lang.Object) shapeList52);
        java.lang.Object obj64 = shapeList43.clone();
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj66 = shapeList65.clone();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        boolean boolean68 = shapeList43.equals((java.lang.Object) wildcardClass67);
        java.lang.Object obj69 = shapeList43.clone();
        boolean boolean70 = shapeList36.equals((java.lang.Object) shapeList43);
        java.lang.Object obj71 = shapeList43.clone();
        boolean boolean72 = shapeList0.equals((java.lang.Object) shapeList43);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        shapeList12.clear();
        int int19 = shapeList12.size();
        shapeList12.clear();
        java.lang.Object obj21 = shapeList12.clone();
        shapeList12.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList12);
        java.lang.Class<?> wildcardClass24 = shapeList12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Object obj24 = shapeList22.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = shapeList0.equals(obj24);
        java.awt.Shape shape28 = shapeList0.getShape((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList7);
        int int12 = shapeList7.size();
        java.awt.Shape shape14 = shapeList7.getShape(33);
        java.lang.Class<?> wildcardClass15 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        boolean boolean37 = shapeList30.equals((java.lang.Object) (short) 100);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList30.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        boolean boolean45 = shapeList30.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList30.getShape((int) (short) 100);
        boolean boolean48 = shapeList25.equals((java.lang.Object) shapeList30);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        int int52 = shapeList49.size();
        boolean boolean54 = shapeList49.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList49);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Object obj58 = shapeList25.clone();
        java.lang.Class<?> wildcardClass59 = shapeList25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = shape17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        java.lang.Object obj42 = shapeList40.clone();
        int int43 = shapeList40.size();
        java.lang.Object obj44 = shapeList40.clone();
        boolean boolean45 = shapeList37.equals((java.lang.Object) shapeList40);
        shapeList37.clear();
        java.lang.Object obj47 = shapeList37.clone();
        shapeList37.clear();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList37);
        java.awt.Shape shape51 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList37.setShape((int) (byte) -1, shape51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        boolean boolean37 = shapeList30.equals((java.lang.Object) (short) 100);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList30.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        boolean boolean45 = shapeList30.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList30.getShape((int) (short) 100);
        boolean boolean48 = shapeList25.equals((java.lang.Object) shapeList30);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        int int52 = shapeList49.size();
        boolean boolean54 = shapeList49.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList49);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Object obj58 = shapeList25.clone();
        int int59 = shapeList25.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList9.clear();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        boolean boolean26 = shapeList9.equals(obj25);
        java.awt.Shape shape28 = shapeList9.getShape((int) '4');
        java.lang.Class<?> wildcardClass29 = shapeList9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        int int16 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList13.getShape(0);
        java.awt.Shape shape26 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.lang.Object obj36 = shapeList30.clone();
        boolean boolean37 = shapeList13.equals(obj36);
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape41 = shapeList0.getShape((int) '#');
        java.awt.Shape shape43 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(shape41);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        java.awt.Shape shape16 = shapeList12.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean22 = shapeList17.equals((java.lang.Object) (byte) 0);
        boolean boolean24 = shapeList17.equals((java.lang.Object) (short) 100);
        shapeList17.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.lang.Object obj28 = shapeList26.clone();
        boolean boolean29 = shapeList17.equals((java.lang.Object) shapeList26);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        boolean boolean32 = shapeList17.equals((java.lang.Object) int31);
        java.awt.Shape shape34 = shapeList17.getShape((int) (short) 100);
        boolean boolean35 = shapeList12.equals((java.lang.Object) shapeList17);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = shapeList36.clone();
        boolean boolean43 = shapeList12.equals((java.lang.Object) shapeList36);
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        int int13 = shapeList0.size();
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((int) 'a');
        java.lang.Object obj20 = shapeList12.clone();
        java.awt.Shape shape22 = shapeList12.getShape((int) '4');
        int int23 = shapeList12.size();
        shapeList12.clear();
        int int25 = shapeList12.size();
        java.awt.Shape shape27 = shapeList12.getShape((int) '4');
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList12);
        int int29 = shapeList12.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = shape22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = shape6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        boolean boolean10 = shapeList0.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        shapeList11.clear();
        int int18 = shapeList11.size();
        java.lang.Class<?> wildcardClass19 = shapeList11.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList11);
        int int21 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        int int29 = shapeList22.size();
        shapeList22.clear();
        java.awt.Shape shape32 = shapeList22.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.awt.Shape shape36 = shapeList33.getShape(0);
        shapeList33.clear();
        shapeList33.clear();
        java.awt.Shape shape40 = shapeList33.getShape((-1));
        java.awt.Shape shape42 = shapeList33.getShape((int) (short) 100);
        boolean boolean43 = shapeList22.equals((java.lang.Object) shapeList33);
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape46 = shapeList0.getShape((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(shape46);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = shape12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        shapeList10.clear();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape((int) 'a');
        java.lang.Object obj18 = shapeList10.clone();
        java.awt.Shape shape20 = shapeList10.getShape((int) '4');
        shapeList10.clear();
        int int22 = shapeList10.size();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList10.clear();
        java.lang.Class<?> wildcardClass25 = shapeList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        java.lang.Object obj11 = shapeList0.clone();
        int int12 = shapeList0.size();
        java.lang.Object obj13 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.awt.Shape shape12 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        boolean boolean13 = shapeList8.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        boolean boolean18 = shapeList8.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape20 = shapeList15.getShape((int) (short) -1);
        java.lang.Object obj21 = shapeList15.clone();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = shapeList0.equals(obj21);
        java.lang.Class<?> wildcardClass24 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 1, shape14);
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = shapeList0.getShape((int) '#');
        java.awt.Shape shape20 = shapeList0.getShape(33);
        java.lang.Object obj21 = shapeList0.clone();
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        boolean boolean9 = shapeList4.equals((java.lang.Object) (byte) 0);
        shapeList4.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((int) 'a');
        java.lang.Object obj19 = shapeList11.clone();
        boolean boolean20 = shapeList8.equals(obj19);
        boolean boolean21 = shapeList0.equals(obj19);
        int int22 = shapeList0.size();
        java.lang.Class<?> wildcardClass23 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        int int24 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        java.lang.Object obj29 = shapeList25.clone();
        boolean boolean30 = shapeList22.equals((java.lang.Object) shapeList25);
        java.lang.Object obj31 = shapeList22.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList22);
        java.lang.Class<?> wildcardClass33 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        int int12 = shapeList9.size();
        shapeList9.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 0, shape5);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        java.awt.Shape shape16 = shapeList12.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean21 = shapeList12.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = shapeList12.getShape(0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        java.lang.Object obj25 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape14 = shapeList0.getShape(1);
        java.lang.Object obj15 = shapeList0.clone();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList0.clear();
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) 1);
        java.lang.Object obj14 = shapeList6.clone();
        java.lang.Object obj15 = shapeList6.clone();
        java.lang.Class<?> wildcardClass16 = shapeList6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 1);
        java.lang.Object obj12 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        int int19 = shapeList13.size();
        java.awt.Shape shape21 = shapeList13.getShape((-1));
        shapeList13.clear();
        int int23 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        int int26 = shapeList24.size();
        int int27 = shapeList24.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        int int31 = shapeList28.size();
        boolean boolean33 = shapeList28.equals((java.lang.Object) (byte) 0);
        shapeList28.clear();
        boolean boolean35 = shapeList24.equals((java.lang.Object) shapeList28);
        boolean boolean36 = shapeList13.equals((java.lang.Object) shapeList24);
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList24);
        java.lang.Object obj38 = shapeList24.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        int int9 = shapeList6.size();
        boolean boolean11 = shapeList6.equals((java.lang.Object) (byte) 0);
        shapeList6.clear();
        java.lang.Class<?> wildcardClass13 = shapeList6.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        int int10 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.lang.Object obj13 = shapeList11.clone();
        int int14 = shapeList11.size();
        java.lang.Object obj15 = shapeList11.clone();
        boolean boolean16 = shapeList8.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape18 = shapeList11.getShape(0);
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList11.equals(obj19);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.lang.Class<?> wildcardClass22 = shapeList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Object obj24 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        java.lang.Object obj42 = shapeList40.clone();
        int int43 = shapeList40.size();
        java.lang.Object obj44 = shapeList40.clone();
        boolean boolean45 = shapeList37.equals((java.lang.Object) shapeList40);
        shapeList37.clear();
        java.lang.Object obj47 = shapeList37.clone();
        shapeList37.clear();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList37);
        java.lang.Class<?> wildcardClass50 = shapeList37.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 0, shape10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 10, shape13);
        java.lang.Object obj15 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        int int12 = shapeList9.size();
        shapeList9.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape16 = shapeList0.getShape(0);
        java.lang.Object obj17 = shapeList0.clone();
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        int int9 = shapeList6.size();
        boolean boolean11 = shapeList6.equals((java.lang.Object) (byte) 0);
        shapeList6.clear();
        java.lang.Class<?> wildcardClass13 = shapeList6.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj15 = shapeList6.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        int int10 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(34, shape16);
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int7 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape6 = shapeList0.getShape((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        boolean boolean9 = shapeList4.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = shapeList4.equals((java.lang.Object) (short) 100);
        shapeList4.clear();
        int int13 = shapeList4.size();
        shapeList4.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        int int14 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        boolean boolean20 = shapeList12.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape22 = shapeList12.getShape((int) (short) 0);
        java.awt.Shape shape24 = shapeList12.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        int int28 = shapeList25.size();
        boolean boolean30 = shapeList25.equals((java.lang.Object) (byte) 0);
        boolean boolean32 = shapeList25.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape34 = shapeList25.getShape((int) '4');
        boolean boolean35 = shapeList12.equals((java.lang.Object) '4');
        java.awt.Shape shape37 = shapeList12.getShape((int) (short) -1);
        java.lang.Object obj38 = shapeList12.clone();
        int int39 = shapeList12.size();
        boolean boolean40 = shapeList0.equals((java.lang.Object) int39);
        int int41 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        boolean boolean44 = shapeList42.equals((java.lang.Object) 100);
        int int45 = shapeList42.size();
        boolean boolean47 = shapeList42.equals((java.lang.Object) (byte) 0);
        boolean boolean49 = shapeList42.equals((java.lang.Object) (short) 100);
        shapeList42.clear();
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        int int52 = shapeList51.size();
        java.lang.Object obj53 = shapeList51.clone();
        boolean boolean54 = shapeList42.equals((java.lang.Object) shapeList51);
        java.awt.Shape shape56 = shapeList42.getShape(1);
        java.lang.Object obj57 = shapeList42.clone();
        boolean boolean58 = shapeList0.equals((java.lang.Object) shapeList42);
        java.lang.Class<?> wildcardClass59 = shapeList42.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(shape56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape(8);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        boolean boolean25 = shapeList20.equals((java.lang.Object) ' ');
        shapeList20.clear();
        java.lang.Class<?> wildcardClass27 = shapeList20.getClass();
        boolean boolean28 = shapeList15.equals((java.lang.Object) shapeList20);
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass3 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = shape13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = shape12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape20 = shapeList0.getShape((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = shapeList11.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        boolean boolean21 = shapeList11.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape23 = shapeList18.getShape((int) (short) -1);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.awt.Shape shape6 = shapeList0.getShape(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = shape6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 10);
        int int15 = shapeList0.size();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.lang.Object obj10 = shapeList8.clone();
        int int11 = shapeList8.size();
        java.lang.Object obj12 = shapeList8.clone();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList8);
        shapeList8.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        java.lang.Object obj15 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        java.lang.Class<?> wildcardClass11 = shapeList7.getClass();
        boolean boolean12 = shapeList0.equals((java.lang.Object) wildcardClass11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = shapeList13.getClass();
        boolean boolean22 = shapeList0.equals((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList11.getShape(8);
        shapeList11.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = shapeList0.equals(obj14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        boolean boolean37 = shapeList30.equals((java.lang.Object) (short) 100);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList30.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        boolean boolean45 = shapeList30.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList30.getShape((int) (short) 100);
        boolean boolean48 = shapeList25.equals((java.lang.Object) shapeList30);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        int int52 = shapeList49.size();
        boolean boolean54 = shapeList49.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList49);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Object obj58 = shapeList0.clone();
        java.lang.Class<?> wildcardClass59 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape24 = shapeList0.getShape(11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = shape24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        int int7 = shapeList0.size();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape((int) '4');
        boolean boolean23 = shapeList0.equals((java.lang.Object) '4');
        java.awt.Shape shape25 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj14 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(8);
        java.awt.Shape shape12 = shapeList0.getShape(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = shapeList0.getShape((-1));
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = shapeList0.equals(obj14);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        shapeList0.clear();
        int int20 = shapeList0.size();
        java.lang.Class<?> wildcardClass21 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape((int) (byte) 100);
        int int12 = shapeList3.size();
        shapeList3.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        java.lang.Object obj16 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape19 = shapeList14.getShape((int) (byte) 100);
        shapeList14.clear();
        boolean boolean21 = shapeList3.equals((java.lang.Object) shapeList14);
        java.lang.Class<?> wildcardClass22 = shapeList3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        int int23 = shapeList21.size();
        int int24 = shapeList21.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        int int28 = shapeList25.size();
        boolean boolean30 = shapeList25.equals((java.lang.Object) (byte) 0);
        shapeList25.clear();
        boolean boolean32 = shapeList21.equals((java.lang.Object) shapeList25);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.awt.Shape shape36 = shapeList33.getShape(0);
        boolean boolean38 = shapeList33.equals((java.lang.Object) ' ');
        java.awt.Shape shape40 = shapeList33.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        java.awt.Shape shape44 = shapeList41.getShape(0);
        shapeList41.clear();
        shapeList41.clear();
        int int47 = shapeList41.size();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        boolean boolean50 = shapeList48.equals((java.lang.Object) (short) 0);
        java.lang.Object obj51 = shapeList48.clone();
        boolean boolean52 = shapeList41.equals(obj51);
        boolean boolean53 = shapeList33.equals((java.lang.Object) boolean52);
        java.awt.Shape shape55 = shapeList33.getShape(101);
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList33);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape59 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        shapeList12.clear();
        java.lang.Object obj14 = shapeList12.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        shapeList16.clear();
        shapeList16.clear();
        int int22 = shapeList16.size();
        int int23 = shapeList16.size();
        int int24 = shapeList16.size();
        java.lang.Object obj25 = shapeList16.clone();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        java.lang.Object obj30 = shapeList27.clone();
        java.lang.Object obj31 = shapeList27.clone();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = shapeList16.equals(obj31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        java.awt.Shape shape16 = shapeList10.getShape(1);
        boolean boolean17 = shapeList0.equals((java.lang.Object) shape16);
        shapeList0.clear();
        int int19 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 1, shape12);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(100, shape15);
        java.awt.Shape shape18 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = shapeList0.getShape((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        int int10 = shapeList7.size();
        boolean boolean11 = shapeList0.equals((java.lang.Object) int10);
        java.lang.Object obj12 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        boolean boolean9 = shapeList4.equals((java.lang.Object) (byte) 0);
        shapeList4.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        java.awt.Shape shape19 = shapeList12.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        shapeList20.clear();
        shapeList20.clear();
        int int26 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) (short) 0);
        java.lang.Object obj30 = shapeList27.clone();
        boolean boolean31 = shapeList20.equals(obj30);
        boolean boolean32 = shapeList12.equals((java.lang.Object) boolean31);
        java.awt.Shape shape34 = shapeList12.getShape(101);
        boolean boolean35 = shapeList4.equals((java.lang.Object) shapeList12);
        java.lang.Class<?> wildcardClass36 = shapeList4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        int int24 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        java.lang.Object obj29 = shapeList25.clone();
        boolean boolean30 = shapeList22.equals((java.lang.Object) shapeList25);
        java.lang.Object obj31 = shapeList22.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList22);
        int int33 = shapeList22.size();
        java.awt.Shape shape35 = shapeList22.getShape(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        shapeList0.clear();
        int int14 = shapeList0.size();
        int int15 = shapeList0.size();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        java.awt.Shape shape16 = shapeList12.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean21 = shapeList12.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = shapeList12.getShape(0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = shape23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape13 = shapeList0.getShape(8);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        java.awt.Shape shape19 = shapeList14.getShape((int) '#');
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        shapeList22.clear();
        shapeList22.clear();
        int int28 = shapeList22.size();
        java.awt.Shape shape30 = shapeList22.getShape((-1));
        java.lang.Object obj31 = shapeList22.clone();
        boolean boolean32 = shapeList14.equals(obj31);
        boolean boolean33 = shapeList0.equals(obj31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(33, shape7);
        int int9 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 0);
        java.lang.Object obj6 = shapeList3.clone();
        int int7 = shapeList3.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        int int15 = shapeList8.size();
        shapeList8.clear();
        boolean boolean17 = shapeList3.equals((java.lang.Object) shapeList8);
        shapeList3.clear();
        int int19 = shapeList3.size();
        int int20 = shapeList3.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) int20);
        int int22 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.awt.Shape shape28 = shapeList25.getShape(0);
        boolean boolean30 = shapeList25.equals((java.lang.Object) ' ');
        shapeList25.clear();
        int int32 = shapeList25.size();
        shapeList25.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        boolean boolean41 = shapeList34.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape43 = shapeList34.getShape(0);
        shapeList34.clear();
        boolean boolean45 = shapeList25.equals((java.lang.Object) shapeList34);
        java.lang.Object obj46 = shapeList25.clone();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj48 = shapeList47.clone();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        boolean boolean50 = shapeList25.equals((java.lang.Object) wildcardClass49);
        int int51 = shapeList25.size();
        java.awt.Shape shape53 = shapeList25.getShape((int) '4');
        boolean boolean54 = shapeList0.equals((java.lang.Object) '4');
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 0, shape10);
        int int12 = shapeList0.size();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape9 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) '#', shape14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList7);
        int int12 = shapeList7.size();
        java.awt.Shape shape14 = shapeList7.getShape(33);
        int int15 = shapeList7.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        int int17 = shapeList14.size();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean19 = shapeList8.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) 1);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shape21);
        int int23 = shapeList0.size();
        java.lang.Object obj24 = shapeList0.clone();
        int int25 = shapeList0.size();
        java.lang.Class<?> wildcardClass26 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = shape10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        int int8 = shapeList6.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape11 = shapeList0.getShape(11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape14 = shapeList7.getShape((int) '4');
        int int15 = shapeList7.size();
        java.awt.Shape shape17 = shapeList7.getShape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        shapeList6.clear();
        shapeList6.clear();
        java.awt.Shape shape13 = shapeList6.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList6.getShape((-1));
        shapeList6.clear();
        shapeList6.clear();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(8);
        java.awt.Shape shape37 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (byte) -1, shape37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 0);
        int int16 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        int int19 = shapeList17.size();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.lang.Object obj22 = shapeList20.clone();
        int int23 = shapeList20.size();
        java.lang.Object obj24 = shapeList20.clone();
        boolean boolean25 = shapeList17.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.lang.Object obj28 = shapeList26.clone();
        int int29 = shapeList26.size();
        shapeList26.clear();
        boolean boolean31 = shapeList17.equals((java.lang.Object) shapeList26);
        boolean boolean32 = shapeList13.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape34 = shapeList13.getShape(98);
        java.awt.Shape shape36 = shapeList13.getShape((int) (short) 0);
        boolean boolean37 = shapeList0.equals((java.lang.Object) shape36);
        java.awt.Shape shape39 = shapeList0.getShape((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape39);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList6.getShape(33);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 0);
        int int17 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        int int20 = shapeList18.size();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        java.lang.Object obj23 = shapeList21.clone();
        int int24 = shapeList21.size();
        java.lang.Object obj25 = shapeList21.clone();
        boolean boolean26 = shapeList18.equals((java.lang.Object) shapeList21);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.lang.Object obj29 = shapeList27.clone();
        int int30 = shapeList27.size();
        shapeList27.clear();
        boolean boolean32 = shapeList18.equals((java.lang.Object) shapeList27);
        boolean boolean33 = shapeList14.equals((java.lang.Object) shapeList18);
        java.lang.Class<?> wildcardClass34 = shapeList14.getClass();
        boolean boolean35 = shapeList6.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 0);
        java.lang.Object obj18 = shapeList15.clone();
        boolean boolean19 = shapeList8.equals(obj18);
        boolean boolean20 = shapeList0.equals((java.lang.Object) boolean19);
        java.awt.Shape shape22 = shapeList0.getShape(101);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = shape22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        int int24 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        java.lang.Object obj29 = shapeList25.clone();
        boolean boolean30 = shapeList22.equals((java.lang.Object) shapeList25);
        java.lang.Object obj31 = shapeList22.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList22);
        int int33 = shapeList22.size();
        java.lang.Class<?> wildcardClass34 = shapeList22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        shapeList7.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 0);
        java.lang.Object obj18 = shapeList15.clone();
        boolean boolean19 = shapeList8.equals(obj18);
        boolean boolean20 = shapeList0.equals((java.lang.Object) boolean19);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 0);
        shapeList0.clear();
        java.lang.Object obj24 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape9 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 0);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        int int17 = shapeList15.size();
        int int18 = shapeList15.size();
        int int19 = shapeList15.size();
        shapeList15.clear();
        int int21 = shapeList15.size();
        boolean boolean22 = shapeList0.equals((java.lang.Object) int21);
        java.lang.Class<?> wildcardClass23 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (byte) 1, shape12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        int int23 = shapeList17.size();
        java.awt.Shape shape25 = shapeList17.getShape((-1));
        shapeList17.clear();
        int int27 = shapeList17.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        int int30 = shapeList28.size();
        int int31 = shapeList28.size();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        int int35 = shapeList32.size();
        boolean boolean37 = shapeList32.equals((java.lang.Object) (byte) 0);
        shapeList32.clear();
        boolean boolean39 = shapeList28.equals((java.lang.Object) shapeList32);
        boolean boolean40 = shapeList17.equals((java.lang.Object) shapeList28);
        shapeList17.clear();
        boolean boolean42 = shapeList0.equals((java.lang.Object) shapeList17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        java.lang.Object obj42 = shapeList40.clone();
        int int43 = shapeList40.size();
        java.lang.Object obj44 = shapeList40.clone();
        boolean boolean45 = shapeList37.equals((java.lang.Object) shapeList40);
        shapeList37.clear();
        java.lang.Object obj47 = shapeList37.clone();
        shapeList37.clear();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList37);
        int int50 = shapeList37.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape9 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) 100);
        boolean boolean22 = shapeList13.equals((java.lang.Object) 10L);
        java.awt.Shape shape24 = shapeList13.getShape((int) (byte) 1);
        boolean boolean25 = shapeList0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.lang.Object obj21 = shapeList19.clone();
        int int22 = shapeList19.size();
        java.lang.Object obj23 = shapeList19.clone();
        boolean boolean24 = shapeList13.equals((java.lang.Object) shapeList19);
        shapeList13.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape28 = shapeList0.getShape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = shape28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(shape28);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape((int) '4');
        boolean boolean23 = shapeList0.equals((java.lang.Object) '4');
        java.awt.Shape shape25 = shapeList0.getShape((int) (short) -1);
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Class<?> wildcardClass27 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        int int12 = shapeList8.size();
        boolean boolean13 = shapeList0.equals((java.lang.Object) int12);
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape((-1));
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        int int22 = shapeList11.size();
        java.lang.Object obj23 = shapeList11.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        int int10 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj18 = shapeList0.clone();
        java.lang.Class<?> wildcardClass19 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape(8);
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape(33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = shape14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        int int14 = shapeList0.size();
        java.lang.Object obj15 = shapeList0.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        int int7 = shapeList3.size();
        java.awt.Shape shape9 = shapeList3.getShape((int) 'a');
        shapeList3.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        shapeList11.clear();
        int int18 = shapeList11.size();
        shapeList11.clear();
        java.awt.Shape shape21 = shapeList11.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        shapeList22.clear();
        shapeList22.clear();
        java.awt.Shape shape29 = shapeList22.getShape((-1));
        java.awt.Shape shape31 = shapeList22.getShape((int) (short) 100);
        boolean boolean32 = shapeList11.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList3.equals((java.lang.Object) shapeList11);
        java.lang.Object obj34 = shapeList3.clone();
        boolean boolean35 = shapeList0.equals(obj34);
        java.lang.Class<?> wildcardClass36 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        int int6 = shapeList4.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        boolean boolean12 = shapeList4.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        shapeList13.clear();
        boolean boolean18 = shapeList4.equals((java.lang.Object) shapeList13);
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj20 = shapeList4.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = shapeList0.getShape((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        java.awt.Shape shape16 = shapeList0.getShape(11);
        java.lang.Class<?> wildcardClass17 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.lang.Object obj23 = shapeList0.clone();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        boolean boolean37 = shapeList30.equals((java.lang.Object) (short) 100);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList30.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        boolean boolean45 = shapeList30.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList30.getShape((int) (short) 100);
        boolean boolean48 = shapeList25.equals((java.lang.Object) shapeList30);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        int int52 = shapeList49.size();
        boolean boolean54 = shapeList49.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList25.equals((java.lang.Object) shapeList49);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Class<?> wildcardClass58 = shapeList25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList3.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        boolean boolean24 = shapeList12.equals(obj23);
        shapeList12.clear();
        boolean boolean26 = shapeList3.equals((java.lang.Object) shapeList12);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape29 = shapeList0.getShape(1);
        java.lang.Class<?> wildcardClass30 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList13.getShape(0);
        java.awt.Shape shape26 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.lang.Object obj36 = shapeList30.clone();
        boolean boolean37 = shapeList13.equals(obj36);
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape41 = shapeList0.getShape((int) '#');
        java.lang.Object obj42 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean45 = shapeList43.equals((java.lang.Object) 100);
        java.awt.Shape shape47 = shapeList43.getShape((int) '#');
        boolean boolean48 = shapeList0.equals((java.lang.Object) shapeList43);
        java.lang.Object obj49 = shapeList0.clone();
        java.lang.Object obj50 = shapeList0.clone();
        java.lang.Object obj51 = shapeList0.clone();
        java.lang.Class<?> wildcardClass52 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        int int37 = shapeList20.size();
        java.lang.Class<?> wildcardClass38 = shapeList20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 10, shape12);
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        int int9 = shapeList3.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        int int18 = shapeList14.size();
        boolean boolean20 = shapeList14.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = shapeList14.clone();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = shapeList10.equals((java.lang.Object) wildcardClass22);
        boolean boolean24 = shapeList3.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        int int13 = shapeList11.size();
        int int14 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        shapeList15.clear();
        boolean boolean22 = shapeList11.equals((java.lang.Object) shapeList15);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList11);
        java.lang.Class<?> wildcardClass24 = shapeList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        int int26 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        boolean boolean32 = shapeList27.equals((java.lang.Object) ' ');
        shapeList27.clear();
        int int34 = shapeList27.size();
        shapeList27.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList27);
        java.lang.Class<?> wildcardClass37 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        shapeList0.clear();
        int int17 = shapeList0.size();
        java.lang.Object obj18 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(8);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList2 = new org.jfree.chart.util.ShapeList();
        int int3 = shapeList2.size();
        java.awt.Shape shape5 = shapeList2.getShape(0);
        shapeList2.clear();
        shapeList2.clear();
        java.awt.Shape shape9 = shapeList2.getShape((-1));
        shapeList2.clear();
        shapeList2.clear();
        shapeList2.clear();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList2);
        java.lang.Object obj14 = shapeList2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        int int26 = shapeList0.size();
        java.awt.Shape shape28 = shapeList0.getShape((int) '4');
        java.awt.Shape shape30 = shapeList0.getShape(101);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = shape30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNull(shape30);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) true);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((int) 'a');
        java.lang.Object obj20 = shapeList12.clone();
        java.awt.Shape shape22 = shapeList12.getShape((int) '4');
        shapeList12.clear();
        int int24 = shapeList12.size();
        java.lang.Object obj25 = shapeList12.clone();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape28 = shapeList12.getShape(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(shape28);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList11.getShape(8);
        java.awt.Shape shape25 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList11.setShape((-1), shape25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = shapeList17.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        java.lang.Object obj25 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj27 = shapeList0.clone();
        java.lang.Class<?> wildcardClass28 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape14 = shapeList7.getShape((int) '4');
        int int15 = shapeList7.size();
        java.awt.Shape shape17 = shapeList7.getShape((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        java.lang.Class<?> wildcardClass12 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        int int6 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape12 = shapeList0.getShape(8);
        java.lang.Object obj13 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(8);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList0.equals((java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Object obj27 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = shape6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape14 = shapeList7.getShape(100);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        boolean boolean21 = shapeList16.equals((java.lang.Object) ' ');
        shapeList16.clear();
        int int23 = shapeList16.size();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        int int28 = shapeList25.size();
        boolean boolean30 = shapeList25.equals((java.lang.Object) (byte) 0);
        boolean boolean32 = shapeList25.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape34 = shapeList25.getShape(0);
        shapeList25.clear();
        boolean boolean36 = shapeList16.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape38 = shapeList16.getShape((int) (byte) 1);
        java.awt.Shape shape40 = shapeList16.getShape(11);
        boolean boolean41 = shapeList0.equals((java.lang.Object) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList13.getShape(0);
        java.awt.Shape shape26 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.lang.Object obj36 = shapeList30.clone();
        boolean boolean37 = shapeList13.equals(obj36);
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape41 = shapeList0.getShape((int) '#');
        java.lang.Object obj42 = shapeList0.clone();
        int int43 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        java.awt.Shape shape18 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        java.awt.Shape shape23 = shapeList19.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean28 = shapeList19.equals((java.lang.Object) int27);
        java.awt.Shape shape30 = shapeList19.getShape(0);
        boolean boolean31 = shapeList13.equals((java.lang.Object) 0);
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        int int35 = shapeList33.size();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.lang.Object obj38 = shapeList36.clone();
        int int39 = shapeList36.size();
        java.lang.Object obj40 = shapeList36.clone();
        boolean boolean41 = shapeList33.equals((java.lang.Object) shapeList36);
        boolean boolean42 = shapeList13.equals((java.lang.Object) shapeList36);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.awt.Shape shape46 = shapeList43.getShape(0);
        boolean boolean48 = shapeList43.equals((java.lang.Object) ' ');
        shapeList43.clear();
        int int50 = shapeList43.size();
        shapeList43.clear();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        boolean boolean54 = shapeList52.equals((java.lang.Object) 100);
        int int55 = shapeList52.size();
        boolean boolean57 = shapeList52.equals((java.lang.Object) (byte) 0);
        boolean boolean59 = shapeList52.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape61 = shapeList52.getShape(0);
        shapeList52.clear();
        boolean boolean63 = shapeList43.equals((java.lang.Object) shapeList52);
        java.lang.Object obj64 = shapeList43.clone();
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj66 = shapeList65.clone();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        boolean boolean68 = shapeList43.equals((java.lang.Object) wildcardClass67);
        java.lang.Object obj69 = shapeList43.clone();
        boolean boolean70 = shapeList36.equals((java.lang.Object) shapeList43);
        java.lang.Object obj71 = shapeList43.clone();
        boolean boolean72 = shapeList0.equals((java.lang.Object) shapeList43);
        java.lang.Object obj73 = shapeList43.clone();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        int int22 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        int int26 = shapeList23.size();
        java.lang.Object obj27 = shapeList23.clone();
        boolean boolean28 = shapeList20.equals((java.lang.Object) shapeList23);
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList23);
        shapeList0.clear();
        java.awt.Shape shape32 = shapeList0.getShape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(shape32);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(34, shape16);
        java.lang.Object obj18 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        int int9 = shapeList6.size();
        boolean boolean11 = shapeList6.equals((java.lang.Object) (byte) 0);
        shapeList6.clear();
        java.lang.Class<?> wildcardClass13 = shapeList6.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((-1));
        java.awt.Shape shape28 = shapeList19.getShape((int) (short) 100);
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList19);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape32 = shapeList0.getShape((int) ' ');
        int int33 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.awt.Shape shape6 = shapeList3.getShape(0);
        shapeList3.clear();
        shapeList3.clear();
        java.awt.Shape shape10 = shapeList3.getShape((int) 'a');
        java.lang.Object obj11 = shapeList3.clone();
        boolean boolean12 = shapeList0.equals(obj11);
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        int int29 = shapeList26.size();
        int int30 = shapeList26.size();
        boolean boolean32 = shapeList26.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass33 = shapeList26.getClass();
        boolean boolean34 = shapeList16.equals((java.lang.Object) shapeList26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList9.clear();
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape25 = shapeList9.getShape((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = shape25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(8);
        int int36 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        int int40 = shapeList37.size();
        int int41 = shapeList37.size();
        shapeList37.clear();
        boolean boolean43 = shapeList0.equals((java.lang.Object) shapeList37);
        java.lang.Class<?> wildcardClass44 = shapeList37.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        shapeList5.clear();
        shapeList5.clear();
        int int11 = shapeList5.size();
        int int12 = shapeList5.size();
        shapeList5.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        int int15 = shapeList0.size();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((-1));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList3.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        boolean boolean24 = shapeList12.equals(obj23);
        shapeList12.clear();
        boolean boolean26 = shapeList3.equals((java.lang.Object) shapeList12);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape29 = shapeList12.getShape((int) (byte) 100);
        java.awt.Shape shape31 = shapeList12.getShape(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape31);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        java.awt.Shape shape19 = shapeList6.getShape(0);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        int int22 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        int int26 = shapeList23.size();
        java.lang.Object obj27 = shapeList23.clone();
        boolean boolean28 = shapeList20.equals((java.lang.Object) shapeList23);
        java.lang.Object obj29 = shapeList23.clone();
        boolean boolean30 = shapeList6.equals(obj29);
        java.lang.Object obj31 = shapeList6.clone();
        shapeList6.clear();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj34 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        int int10 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 100, shape13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList13.getShape(0);
        java.awt.Shape shape26 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.lang.Object obj36 = shapeList30.clone();
        boolean boolean37 = shapeList13.equals(obj36);
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        int int42 = shapeList40.size();
        int int43 = shapeList40.size();
        int int44 = shapeList40.size();
        shapeList40.clear();
        int int46 = shapeList40.size();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        int int48 = shapeList47.size();
        java.lang.Object obj49 = shapeList47.clone();
        int int50 = shapeList47.size();
        java.lang.Object obj51 = shapeList47.clone();
        shapeList47.clear();
        java.awt.Shape shape54 = shapeList47.getShape(100);
        boolean boolean55 = shapeList40.equals((java.lang.Object) shapeList47);
        boolean boolean56 = shapeList0.equals((java.lang.Object) boolean55);
        java.lang.Object obj57 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        int int59 = shapeList58.size();
        java.awt.Shape shape61 = shapeList58.getShape(0);
        boolean boolean63 = shapeList58.equals((java.lang.Object) ' ');
        shapeList58.clear();
        int int65 = shapeList58.size();
        shapeList58.clear();
        org.jfree.chart.util.ShapeList shapeList67 = new org.jfree.chart.util.ShapeList();
        boolean boolean69 = shapeList67.equals((java.lang.Object) 100);
        int int70 = shapeList67.size();
        boolean boolean72 = shapeList67.equals((java.lang.Object) (byte) 0);
        boolean boolean74 = shapeList67.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape76 = shapeList67.getShape(0);
        shapeList67.clear();
        boolean boolean78 = shapeList58.equals((java.lang.Object) shapeList67);
        java.lang.Object obj79 = shapeList58.clone();
        org.jfree.chart.util.ShapeList shapeList80 = new org.jfree.chart.util.ShapeList();
        int int81 = shapeList80.size();
        int int82 = shapeList80.size();
        org.jfree.chart.util.ShapeList shapeList83 = new org.jfree.chart.util.ShapeList();
        int int84 = shapeList83.size();
        java.lang.Object obj85 = shapeList83.clone();
        int int86 = shapeList83.size();
        java.lang.Object obj87 = shapeList83.clone();
        boolean boolean88 = shapeList80.equals((java.lang.Object) shapeList83);
        java.lang.Object obj89 = shapeList80.clone();
        boolean boolean90 = shapeList58.equals((java.lang.Object) shapeList80);
        int int91 = shapeList80.size();
        java.lang.Object obj92 = shapeList80.clone();
        boolean boolean93 = shapeList0.equals((java.lang.Object) shapeList80);
        java.lang.Class<?> wildcardClass94 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(shape54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(shape76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(2, shape6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(8);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = shape14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        shapeList0.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = shapeList0.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        int int7 = shapeList4.size();
        boolean boolean9 = shapeList4.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = shapeList4.equals((java.lang.Object) (short) 100);
        shapeList4.clear();
        int int13 = shapeList4.size();
        shapeList4.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape17 = shapeList4.getShape((int) (short) 1);
        java.awt.Shape shape19 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList4.setShape((int) (short) -1, shape19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Class<?> wildcardClass6 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        shapeList7.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(53);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape25 = shapeList0.getShape(0);
        java.lang.Object obj26 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((-1));
        java.awt.Shape shape28 = shapeList19.getShape((int) (short) 100);
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList19);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList8);
        java.lang.Object obj31 = shapeList0.clone();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) 1);
        shapeList6.clear();
        java.lang.Object obj15 = shapeList6.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList3.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        boolean boolean24 = shapeList12.equals(obj23);
        shapeList12.clear();
        boolean boolean26 = shapeList3.equals((java.lang.Object) shapeList12);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape29 = shapeList0.getShape(1);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass31 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        int int7 = shapeList5.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.lang.Object obj10 = shapeList8.clone();
        int int11 = shapeList8.size();
        java.lang.Object obj12 = shapeList8.clone();
        boolean boolean13 = shapeList5.equals((java.lang.Object) shapeList8);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = shapeList5.equals(obj19);
        java.awt.Shape shape23 = shapeList5.getShape(100);
        shapeList5.clear();
        int int25 = shapeList5.size();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList5);
        int int27 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean17 = shapeList5.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        boolean boolean20 = shapeList5.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList5.getShape((int) (short) 100);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape25 = shapeList0.getShape((int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.lang.Object obj8 = shapeList6.clone();
        int int9 = shapeList6.size();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = shape13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 100);
        int int11 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape14 = shapeList0.getShape(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList13.getShape(0);
        java.awt.Shape shape26 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        int int29 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.lang.Object obj32 = shapeList30.clone();
        int int33 = shapeList30.size();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean35 = shapeList27.equals((java.lang.Object) shapeList30);
        java.lang.Object obj36 = shapeList30.clone();
        boolean boolean37 = shapeList13.equals(obj36);
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        boolean boolean42 = shapeList40.equals((java.lang.Object) 100);
        int int43 = shapeList40.size();
        boolean boolean45 = shapeList40.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape47 = shapeList40.getShape((int) (short) 1);
        java.lang.Object obj48 = shapeList40.clone();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        java.awt.Shape shape55 = shapeList52.getShape(0);
        shapeList52.clear();
        shapeList52.clear();
        java.awt.Shape shape59 = shapeList52.getShape((int) 'a');
        java.lang.Object obj60 = shapeList52.clone();
        boolean boolean61 = shapeList49.equals(obj60);
        shapeList49.clear();
        boolean boolean63 = shapeList40.equals((java.lang.Object) shapeList49);
        boolean boolean64 = shapeList0.equals((java.lang.Object) shapeList40);
        int int65 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNull(shape59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        int int14 = shapeList0.size();
        int int15 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        shapeList0.clear();
        int int9 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) 1);
        java.lang.Object obj19 = shapeList11.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        shapeList23.clear();
        shapeList23.clear();
        java.awt.Shape shape30 = shapeList23.getShape((int) 'a');
        java.lang.Object obj31 = shapeList23.clone();
        boolean boolean32 = shapeList20.equals(obj31);
        shapeList20.clear();
        boolean boolean34 = shapeList11.equals((java.lang.Object) shapeList20);
        java.lang.Object obj35 = shapeList11.clone();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = shapeList36.equals((java.lang.Object) (short) 100);
        shapeList36.clear();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        int int46 = shapeList45.size();
        java.lang.Object obj47 = shapeList45.clone();
        boolean boolean48 = shapeList36.equals((java.lang.Object) shapeList45);
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        boolean boolean51 = shapeList36.equals((java.lang.Object) int50);
        java.lang.Object obj52 = shapeList36.clone();
        java.awt.Shape shape54 = shapeList36.getShape((-1));
        boolean boolean55 = shapeList11.equals((java.lang.Object) shape54);
        java.lang.Class<?> wildcardClass56 = shapeList11.getClass();
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList11);
        int int58 = shapeList11.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNull(shape54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass11 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        int int9 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        shapeList12.clear();
        int int19 = shapeList12.size();
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) 100);
        int int24 = shapeList21.size();
        boolean boolean26 = shapeList21.equals((java.lang.Object) (byte) 0);
        boolean boolean28 = shapeList21.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape30 = shapeList21.getShape(0);
        shapeList21.clear();
        boolean boolean32 = shapeList12.equals((java.lang.Object) shapeList21);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        int int35 = shapeList33.size();
        int int36 = shapeList33.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) 100);
        int int40 = shapeList37.size();
        boolean boolean42 = shapeList37.equals((java.lang.Object) (byte) 0);
        shapeList37.clear();
        boolean boolean44 = shapeList33.equals((java.lang.Object) shapeList37);
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        int int46 = shapeList45.size();
        java.awt.Shape shape48 = shapeList45.getShape(0);
        boolean boolean50 = shapeList45.equals((java.lang.Object) ' ');
        java.awt.Shape shape52 = shapeList45.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        java.awt.Shape shape56 = shapeList53.getShape(0);
        shapeList53.clear();
        shapeList53.clear();
        int int59 = shapeList53.size();
        org.jfree.chart.util.ShapeList shapeList60 = new org.jfree.chart.util.ShapeList();
        boolean boolean62 = shapeList60.equals((java.lang.Object) (short) 0);
        java.lang.Object obj63 = shapeList60.clone();
        boolean boolean64 = shapeList53.equals(obj63);
        boolean boolean65 = shapeList45.equals((java.lang.Object) boolean64);
        java.awt.Shape shape67 = shapeList45.getShape(101);
        boolean boolean68 = shapeList37.equals((java.lang.Object) shapeList45);
        boolean boolean69 = shapeList12.equals((java.lang.Object) shapeList37);
        boolean boolean70 = shapeList0.equals((java.lang.Object) shapeList37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(shape56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(shape67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) 100);
        java.awt.Shape shape10 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList6.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList6.getShape(0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        boolean boolean27 = shapeList20.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape(0);
        java.awt.Shape shape31 = null;
        shapeList20.setShape(100, shape31);
        java.awt.Shape shape34 = shapeList20.getShape(1);
        shapeList20.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        java.lang.Object obj42 = shapeList40.clone();
        int int43 = shapeList40.size();
        java.lang.Object obj44 = shapeList40.clone();
        boolean boolean45 = shapeList37.equals((java.lang.Object) shapeList40);
        shapeList37.clear();
        java.lang.Object obj47 = shapeList37.clone();
        shapeList37.clear();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList37);
        java.lang.Class<?> wildcardClass50 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(1);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 0);
        int int15 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        int int18 = shapeList16.size();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.lang.Object obj21 = shapeList19.clone();
        int int22 = shapeList19.size();
        java.lang.Object obj23 = shapeList19.clone();
        boolean boolean24 = shapeList16.equals((java.lang.Object) shapeList19);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        shapeList25.clear();
        boolean boolean30 = shapeList16.equals((java.lang.Object) shapeList25);
        boolean boolean31 = shapeList12.equals((java.lang.Object) shapeList16);
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList16);
        java.lang.Object obj33 = shapeList16.clone();
        shapeList16.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape24 = shapeList0.getShape(11);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        shapeList25.clear();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        java.lang.Class<?> wildcardClass29 = shapeList25.getClass();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = shapeList0.getShape((int) '#');
        java.lang.Object obj19 = shapeList0.clone();
        int int20 = shapeList0.size();
        java.lang.Class<?> wildcardClass21 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        java.awt.Shape shape16 = shapeList12.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean21 = shapeList12.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = shapeList12.getShape(0);
        java.awt.Shape shape25 = shapeList12.getShape(0);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        int int28 = shapeList26.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.lang.Object obj31 = shapeList29.clone();
        int int32 = shapeList29.size();
        java.lang.Object obj33 = shapeList29.clone();
        boolean boolean34 = shapeList26.equals((java.lang.Object) shapeList29);
        java.lang.Object obj35 = shapeList29.clone();
        boolean boolean36 = shapeList12.equals(obj35);
        shapeList12.clear();
        java.lang.Object obj38 = shapeList12.clone();
        shapeList12.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList12);
        shapeList12.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 0);
        java.lang.Object obj18 = shapeList15.clone();
        boolean boolean19 = shapeList8.equals(obj18);
        boolean boolean20 = shapeList0.equals((java.lang.Object) boolean19);
        java.lang.Object obj21 = shapeList0.clone();
        java.lang.Class<?> wildcardClass22 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean17 = shapeList5.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        boolean boolean20 = shapeList5.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList5.getShape((int) (short) 100);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape25 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        boolean boolean31 = shapeList26.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        int int35 = shapeList32.size();
        java.lang.Object obj36 = shapeList32.clone();
        boolean boolean37 = shapeList26.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape39 = shapeList32.getShape((int) (short) 1);
        shapeList32.clear();
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList32);
        java.lang.Class<?> wildcardClass42 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj37 = shapeList0.clone();
        java.lang.Class<?> wildcardClass38 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        java.lang.Object obj11 = shapeList0.clone();
        int int12 = shapeList0.size();
        java.lang.Class<?> wildcardClass13 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean17 = shapeList5.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        boolean boolean20 = shapeList5.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList5.getShape((int) (short) 100);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape25 = shapeList0.getShape((int) (byte) -1);
        boolean boolean27 = shapeList0.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList3.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        boolean boolean24 = shapeList12.equals(obj23);
        shapeList12.clear();
        boolean boolean26 = shapeList3.equals((java.lang.Object) shapeList12);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        shapeList12.clear();
        java.lang.Class<?> wildcardClass29 = shapeList12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        shapeList19.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList19);
        java.lang.Object obj31 = shapeList10.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.awt.Shape shape35 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj37 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj39 = shapeList0.clone();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.lang.Object obj9 = shapeList3.clone();
        java.awt.Shape shape11 = shapeList3.getShape(10);
        java.awt.Shape shape13 = shapeList3.getShape((int) (byte) 1);
        shapeList3.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        boolean boolean20 = shapeList15.equals((java.lang.Object) ' ');
        shapeList15.clear();
        int int22 = shapeList15.size();
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean29 = shapeList24.equals((java.lang.Object) (byte) 0);
        boolean boolean31 = shapeList24.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape33 = shapeList24.getShape(0);
        shapeList24.clear();
        boolean boolean35 = shapeList15.equals((java.lang.Object) shapeList24);
        java.lang.Object obj36 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        boolean boolean40 = shapeList15.equals((java.lang.Object) wildcardClass39);
        int int41 = shapeList15.size();
        java.lang.Object obj42 = shapeList15.clone();
        boolean boolean43 = shapeList3.equals((java.lang.Object) shapeList15);
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.awt.Shape shape47 = shapeList44.getShape(0);
        boolean boolean49 = shapeList44.equals((java.lang.Object) ' ');
        shapeList44.clear();
        int int51 = shapeList44.size();
        shapeList44.clear();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        boolean boolean55 = shapeList53.equals((java.lang.Object) 100);
        int int56 = shapeList53.size();
        boolean boolean58 = shapeList53.equals((java.lang.Object) (byte) 0);
        boolean boolean60 = shapeList53.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape62 = shapeList53.getShape(0);
        shapeList53.clear();
        boolean boolean64 = shapeList44.equals((java.lang.Object) shapeList53);
        shapeList44.clear();
        java.lang.Object obj66 = shapeList44.clone();
        java.lang.Object obj67 = shapeList44.clone();
        boolean boolean68 = shapeList15.equals(obj67);
        java.lang.Class<?> wildcardClass69 = obj67.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(shape62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.lang.Object obj9 = shapeList7.clone();
        int int10 = shapeList7.size();
        java.lang.Object obj11 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape14 = shapeList7.getShape(100);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        int int16 = shapeList7.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList0.clear();
        java.lang.Object obj22 = shapeList0.clone();
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(8);
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape(0);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shape22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = shape22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        int int17 = shapeList14.size();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean19 = shapeList8.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) 1);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shape21);
        int int23 = shapeList0.size();
        java.lang.Object obj24 = shapeList0.clone();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = shapeList0.getShape(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape27);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        shapeList11.clear();
        java.awt.Shape shape21 = shapeList11.getShape(1);
        java.awt.Shape shape23 = shapeList11.getShape((int) ' ');
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape14 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        boolean boolean17 = shapeList0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        int int20 = shapeList18.size();
        int int21 = shapeList18.size();
        java.lang.Object obj22 = shapeList18.clone();
        java.lang.Object obj23 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        shapeList24.clear();
        int int26 = shapeList24.size();
        boolean boolean27 = shapeList18.equals((java.lang.Object) shapeList24);
        java.lang.Object obj28 = shapeList24.clone();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList24);
        java.lang.Class<?> wildcardClass30 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.lang.Object obj24 = shapeList22.clone();
        boolean boolean25 = shapeList13.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape27 = shapeList13.getShape(1);
        java.lang.Object obj28 = shapeList13.clone();
        boolean boolean29 = shapeList7.equals(obj28);
        java.lang.Class<?> wildcardClass30 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Class<?> wildcardClass5 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.awt.Shape shape24 = shapeList15.getShape((-1));
        shapeList15.clear();
        java.awt.Shape shape27 = shapeList15.getShape((int) (short) 0);
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList15);
        java.lang.Object obj29 = shapeList15.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = shapeList0.equals(obj14);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        shapeList0.clear();
        java.lang.Object obj20 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        int int23 = shapeList21.size();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        int int28 = shapeList24.size();
        java.awt.Shape shape30 = shapeList24.getShape((int) 'a');
        shapeList24.clear();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.awt.Shape shape35 = shapeList32.getShape(0);
        boolean boolean37 = shapeList32.equals((java.lang.Object) ' ');
        shapeList32.clear();
        int int39 = shapeList32.size();
        shapeList32.clear();
        java.awt.Shape shape42 = shapeList32.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.awt.Shape shape46 = shapeList43.getShape(0);
        shapeList43.clear();
        shapeList43.clear();
        java.awt.Shape shape50 = shapeList43.getShape((-1));
        java.awt.Shape shape52 = shapeList43.getShape((int) (short) 100);
        boolean boolean53 = shapeList32.equals((java.lang.Object) shapeList43);
        boolean boolean54 = shapeList24.equals((java.lang.Object) shapeList32);
        java.lang.Object obj55 = shapeList24.clone();
        boolean boolean56 = shapeList21.equals(obj55);
        boolean boolean57 = shapeList0.equals(obj55);
        int int58 = shapeList0.size();
        int int59 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        int int4 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList11.getShape((int) (byte) 100);
        java.awt.Shape shape25 = shapeList11.getShape(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        int int5 = shapeList0.size();
        java.lang.Object obj6 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((int) 'a');
        java.lang.Object obj20 = shapeList12.clone();
        boolean boolean21 = shapeList9.equals(obj20);
        shapeList9.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList9);
        int int24 = shapeList9.size();
        int int25 = shapeList9.size();
        java.awt.Shape shape27 = shapeList9.getShape(34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape27);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList7);
        java.lang.Object obj12 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        boolean boolean10 = shapeList0.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        shapeList11.clear();
        int int18 = shapeList11.size();
        java.lang.Class<?> wildcardClass19 = shapeList11.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList11);
        int int21 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        int int29 = shapeList22.size();
        shapeList22.clear();
        java.awt.Shape shape32 = shapeList22.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.awt.Shape shape36 = shapeList33.getShape(0);
        shapeList33.clear();
        shapeList33.clear();
        java.awt.Shape shape40 = shapeList33.getShape((-1));
        java.awt.Shape shape42 = shapeList33.getShape((int) (short) 100);
        boolean boolean43 = shapeList22.equals((java.lang.Object) shapeList33);
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList22);
        int int45 = shapeList22.size();
        java.awt.Shape shape47 = shapeList22.getShape(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = shapeList0.getShape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = shape2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(shape2);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape6 = shapeList0.getShape(8);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = shapeList9.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape18 = shapeList9.getShape(0);
        shapeList9.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        int int23 = shapeList0.size();
        java.lang.Class<?> wildcardClass24 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) '4', shape16);
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.awt.Shape shape12 = shapeList0.getShape(33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = shape12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }
}

