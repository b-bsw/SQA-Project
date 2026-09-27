package org.jfree.chart.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
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
        java.awt.Shape shape14 = null;
        shapeList9.setShape(100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = null;
        shapeList0.setShape(100, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        java.awt.Shape shape14 = null;
        shapeList9.setShape(1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(8, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        java.awt.Shape shape30 = null;
        shapeList19.setShape(100, shape30);
        java.lang.Object obj32 = shapeList19.clone();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) 'a', shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(8, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) 'a', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) ' ', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = null;
        shapeList0.setShape(0, shape3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        java.awt.Shape shape12 = null;
        shapeList0.setShape(10, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = null;
        shapeList0.setShape((int) (byte) 100, shape3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape(33, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) 'a', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (short) 0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        java.awt.Shape shape30 = null;
        shapeList0.setShape(10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList3.setShape((int) (short) 10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        java.awt.Shape shape19 = null;
        shapeList14.setShape((int) ' ', shape19);
        int int21 = shapeList14.size();
        boolean boolean22 = shapeList6.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        java.awt.Shape shape14 = null;
        shapeList9.setShape((int) (short) 0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 0, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape(33, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        shapeList5.clear();
        java.lang.Object obj7 = shapeList5.clone();
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = shapeList0.getShape((-1));
        java.awt.Shape shape20 = null;
        shapeList0.setShape(100, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        int int13 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        int int17 = shapeList14.size();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean19 = shapeList11.equals((java.lang.Object) shapeList14);
        shapeList11.clear();
        java.lang.Object obj21 = shapeList11.clone();
        boolean boolean22 = shapeList0.equals(obj21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape(0);
        java.awt.Shape shape30 = null;
        shapeList19.setShape(100, shape30);
        java.lang.Object obj32 = shapeList19.clone();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = null;
        shapeList0.setShape(8, shape3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 100, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        java.awt.Shape shape34 = null;
        shapeList0.setShape(0, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(8, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        boolean boolean15 = shapeList7.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape17 = shapeList7.getShape((int) (short) 0);
        java.awt.Shape shape19 = shapeList7.getShape((int) (short) 10);
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = null;
        shapeList7.setShape((int) ' ', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(101, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.awt.Shape shape10 = null;
        shapeList0.setShape(101, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList3.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (short) 0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        java.awt.Shape shape22 = null;
        shapeList9.setShape(0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        shapeList5.clear();
        java.lang.Object obj7 = shapeList5.clone();
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape((int) '4');
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        java.awt.Shape shape25 = null;
        shapeList9.setShape((int) (byte) 0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(33, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        shapeList0.setShape(8, shape15);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        shapeList17.clear();
        java.awt.Shape shape25 = shapeList17.getShape((int) '4');
        shapeList17.clear();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        shapeList12.clear();
        java.awt.Shape shape20 = null;
        shapeList12.setShape(0, shape20);
        boolean boolean22 = shapeList3.equals((java.lang.Object) shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        java.awt.Shape shape38 = null;
        shapeList0.setShape(0, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(100, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 10, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        boolean boolean9 = shapeList4.equals((java.lang.Object) ' ');
        shapeList4.clear();
        int int11 = shapeList4.size();
        shapeList4.clear();
        java.awt.Shape shape14 = null;
        shapeList4.setShape((int) 'a', shape14);
        java.lang.Object obj16 = shapeList4.clone();
        java.lang.Object obj17 = shapeList4.clone();
        int int18 = shapeList4.size();
        boolean boolean19 = shapeList0.equals((java.lang.Object) int18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 1, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (short) 100, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        shapeList16.setShape(98, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList3.setShape((int) (short) 100, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        java.awt.Shape shape15 = null;
        shapeList3.setShape((int) (short) 1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        java.lang.Object obj11 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        shapeList12.clear();
        java.lang.Object obj14 = shapeList12.clone();
        int int15 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        int int20 = shapeList16.size();
        boolean boolean22 = shapeList16.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = shapeList16.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList12.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) '4', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        shapeList0.setShape(8, shape15);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        int int19 = shapeList17.size();
        java.lang.Object obj20 = shapeList17.clone();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) 'a', shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 0, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape(33, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) 'a', shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) 'a', shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 1, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        java.awt.Shape shape21 = null;
        shapeList16.setShape((int) ' ', shape21);
        int int23 = shapeList16.size();
        boolean boolean24 = shapeList0.equals((java.lang.Object) int23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        java.awt.Shape shape24 = shapeList21.getShape(0);
        boolean boolean26 = shapeList21.equals((java.lang.Object) ' ');
        shapeList21.clear();
        int int28 = shapeList21.size();
        shapeList21.clear();
        java.awt.Shape shape31 = shapeList21.getShape((-1));
        java.awt.Shape shape33 = shapeList21.getShape((-1));
        java.awt.Shape shape35 = null;
        shapeList21.setShape(0, shape35);
        int int37 = shapeList21.size();
        java.lang.Class<?> wildcardClass38 = shapeList21.getClass();
        boolean boolean39 = shapeList9.equals((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = shapeList5.equals((java.lang.Object) (short) 100);
        shapeList5.clear();
        java.awt.Shape shape15 = null;
        shapeList5.setShape(0, shape15);
        boolean boolean17 = shapeList0.equals((java.lang.Object) shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape(33);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (byte) 1, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.awt.Shape shape59 = null;
        shapeList25.setShape((int) (short) 10, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        java.awt.Shape shape12 = null;
        shapeList0.setShape(10, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(53, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        java.awt.Shape shape15 = null;
        shapeList10.setShape((int) ' ', shape15);
        int int17 = shapeList10.size();
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        boolean boolean20 = shapeList15.equals((java.lang.Object) ' ');
        shapeList15.clear();
        int int22 = shapeList15.size();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.awt.Shape shape40 = null;
        shapeList0.setShape(53, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(0, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape((int) (byte) 100);
        java.awt.Shape shape15 = shapeList10.getShape(33);
        shapeList10.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (byte) 10, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape(9, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(0, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) 'a', shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        shapeList0.clear();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(11, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        shapeList13.clear();
        int int20 = shapeList13.size();
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        boolean boolean29 = shapeList22.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape31 = shapeList22.getShape(0);
        shapeList22.clear();
        boolean boolean33 = shapeList13.equals((java.lang.Object) shapeList22);
        java.lang.Object obj34 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = shapeList13.equals((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = shapeList13.clone();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList13);
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        java.awt.Shape shape44 = shapeList41.getShape(0);
        java.awt.Shape shape46 = null;
        shapeList41.setShape((int) ' ', shape46);
        int int48 = shapeList41.size();
        boolean boolean49 = shapeList0.equals((java.lang.Object) int48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList41", shapeList0.equals(shapeList41) ? shapeList0.hashCode() == shapeList41.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        java.awt.Shape shape28 = null;
        shapeList23.setShape((int) ' ', shape28);
        boolean boolean30 = shapeList0.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        shapeList0.clear();
        java.awt.Shape shape25 = null;
        shapeList0.setShape(10, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        boolean boolean23 = shapeList13.equals((java.lang.Object) shapeList20);
        shapeList20.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        int int21 = shapeList19.size();
        java.awt.Shape shape23 = null;
        shapeList19.setShape(1, shape23);
        boolean boolean25 = shapeList0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) '#', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        java.awt.Shape shape5 = null;
        shapeList0.setShape(9, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        boolean boolean24 = shapeList19.equals((java.lang.Object) ' ');
        shapeList19.clear();
        int int26 = shapeList19.size();
        shapeList19.clear();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        int int31 = shapeList28.size();
        boolean boolean33 = shapeList28.equals((java.lang.Object) (byte) 0);
        boolean boolean35 = shapeList28.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape37 = shapeList28.getShape(0);
        shapeList28.clear();
        boolean boolean39 = shapeList19.equals((java.lang.Object) shapeList28);
        shapeList28.clear();
        boolean boolean41 = shapeList11.equals((java.lang.Object) shapeList28);
        java.lang.Class<?> wildcardClass42 = shapeList11.getClass();
        boolean boolean43 = shapeList0.equals((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(98, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList13.clone();
        int int22 = shapeList13.size();
        int int23 = shapeList13.size();
        java.lang.Object obj24 = shapeList13.clone();
        java.lang.Class<?> wildcardClass25 = shapeList13.getClass();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        java.awt.Shape shape24 = shapeList11.getShape(33);
        java.lang.Object obj25 = shapeList11.clone();
        java.awt.Shape shape27 = null;
        shapeList11.setShape(9, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.lang.Object obj13 = shapeList11.clone();
        java.awt.Shape shape15 = shapeList11.getShape((int) '4');
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape18 = null;
        shapeList0.setShape(100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (byte) 1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '4', shape2);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        boolean boolean9 = shapeList4.equals((java.lang.Object) ' ');
        shapeList4.clear();
        int int11 = shapeList4.size();
        int int12 = shapeList4.size();
        java.awt.Shape shape14 = null;
        shapeList4.setShape((int) (short) 0, shape14);
        java.awt.Shape shape17 = null;
        shapeList4.setShape((int) (short) 10, shape17);
        boolean boolean19 = shapeList0.equals((java.lang.Object) shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) '#', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.awt.Shape shape33 = shapeList30.getShape(0);
        boolean boolean35 = shapeList30.equals((java.lang.Object) ' ');
        shapeList30.clear();
        int int37 = shapeList30.size();
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) 100);
        int int42 = shapeList39.size();
        boolean boolean44 = shapeList39.equals((java.lang.Object) (byte) 0);
        boolean boolean46 = shapeList39.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape48 = shapeList39.getShape(0);
        shapeList39.clear();
        boolean boolean50 = shapeList30.equals((java.lang.Object) shapeList39);
        java.lang.Object obj51 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj53 = shapeList52.clone();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        boolean boolean55 = shapeList30.equals((java.lang.Object) wildcardClass54);
        java.lang.Object obj56 = shapeList30.clone();
        boolean boolean57 = shapeList23.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape59 = null;
        shapeList30.setShape(101, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (byte) 0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape16 = shapeList9.getShape(100);
        int int17 = shapeList9.size();
        java.awt.Shape shape19 = null;
        shapeList9.setShape((int) ' ', shape19);
        java.lang.Object obj21 = shapeList9.clone();
        boolean boolean22 = shapeList0.equals(obj21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(9, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        shapeList2.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        boolean boolean22 = shapeList15.equals((java.lang.Object) (short) 100);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape26 = null;
        shapeList15.setShape((int) (short) 10, shape26);
        int int28 = shapeList15.size();
        java.lang.Object obj29 = shapeList15.clone();
        java.lang.Class<?> wildcardClass30 = shapeList15.getClass();
        boolean boolean31 = shapeList2.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        boolean boolean14 = shapeList9.equals((java.lang.Object) ' ');
        java.awt.Shape shape16 = shapeList9.getShape((-1));
        int int17 = shapeList9.size();
        java.awt.Shape shape19 = shapeList9.getShape((-1));
        java.awt.Shape shape21 = null;
        shapeList9.setShape((int) (short) 1, shape21);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(8, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean29 = shapeList24.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = shapeList24.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape33 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        boolean boolean41 = shapeList34.equals((java.lang.Object) (short) 100);
        shapeList34.clear();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.lang.Object obj45 = shapeList43.clone();
        boolean boolean46 = shapeList34.equals((java.lang.Object) shapeList43);
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        int int48 = shapeList47.size();
        boolean boolean49 = shapeList34.equals((java.lang.Object) int48);
        java.lang.Object obj50 = shapeList34.clone();
        boolean boolean51 = shapeList0.equals(obj50);
        java.awt.Shape shape53 = null;
        shapeList0.setShape(8, shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        java.lang.Object obj8 = shapeList0.clone();
        boolean boolean10 = shapeList0.equals((java.lang.Object) 1.0f);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) 'a', shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape37 = null;
        shapeList0.setShape(8, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) ' ', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(33, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        java.awt.Shape shape39 = null;
        shapeList20.setShape((int) (byte) 10, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        java.awt.Shape shape14 = null;
        shapeList7.setShape((int) (byte) 1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        shapeList13.clear();
        int int20 = shapeList13.size();
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        boolean boolean29 = shapeList22.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape31 = shapeList22.getShape(0);
        shapeList22.clear();
        boolean boolean33 = shapeList13.equals((java.lang.Object) shapeList22);
        java.lang.Object obj34 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = shapeList13.equals((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = shapeList13.clone();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape42 = null;
        shapeList0.setShape((int) ' ', shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(98, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        boolean boolean13 = shapeList8.equals((java.lang.Object) (byte) 0);
        boolean boolean15 = shapeList8.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape17 = shapeList8.getShape(0);
        java.awt.Shape shape19 = null;
        shapeList8.setShape(100, shape19);
        java.awt.Shape shape22 = null;
        shapeList8.setShape((int) (byte) 1, shape22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean22 = shapeList17.equals((java.lang.Object) (byte) 0);
        boolean boolean24 = shapeList17.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape26 = shapeList17.getShape(0);
        shapeList17.clear();
        boolean boolean28 = shapeList8.equals((java.lang.Object) shapeList17);
        shapeList17.clear();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape32 = null;
        shapeList0.setShape(53, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape((int) 'a', shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape37 = null;
        shapeList32.setShape(2, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList32", shapeList0.equals(shapeList32) ? shapeList0.hashCode() == shapeList32.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 100, shape5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean11 = shapeList7.equals((java.lang.Object) 1L);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        java.awt.Shape shape25 = null;
        shapeList10.setShape((int) (byte) 100, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        java.awt.Shape shape14 = shapeList0.getShape(1);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = null;
        shapeList15.setShape(0, shape22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        java.awt.Shape shape24 = shapeList21.getShape(0);
        shapeList21.clear();
        shapeList21.clear();
        shapeList21.clear();
        java.awt.Shape shape29 = null;
        shapeList21.setShape((int) (byte) 0, shape29);
        java.lang.Object obj31 = shapeList21.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (short) 10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        boolean boolean15 = shapeList10.equals((java.lang.Object) (byte) 0);
        boolean boolean17 = shapeList10.equals((java.lang.Object) (short) 100);
        int int18 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj21 = shapeList10.clone();
        shapeList10.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(8);
        java.awt.Shape shape12 = null;
        shapeList0.setShape(98, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        java.awt.Shape shape33 = null;
        shapeList0.setShape(10, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        java.lang.Object obj14 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape(9, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        java.awt.Shape shape12 = null;
        shapeList0.setShape(33, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        shapeList13.clear();
        shapeList13.clear();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        java.awt.Shape shape14 = null;
        shapeList3.setShape((int) 'a', shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        boolean boolean19 = shapeList14.equals((java.lang.Object) ' ');
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        java.awt.Shape shape24 = shapeList21.getShape(0);
        java.lang.Class<?> wildcardClass25 = shapeList21.getClass();
        boolean boolean26 = shapeList14.equals((java.lang.Object) wildcardClass25);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.lang.Object obj29 = shapeList27.clone();
        int int30 = shapeList27.size();
        java.lang.Object obj31 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape34 = shapeList27.getShape((int) (short) 100);
        java.lang.Class<?> wildcardClass35 = shapeList27.getClass();
        boolean boolean36 = shapeList14.equals((java.lang.Object) wildcardClass35);
        shapeList14.clear();
        java.lang.Object obj38 = shapeList14.clone();
        boolean boolean39 = shapeList0.equals(obj38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) (short) 100, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) -1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) 'a', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        shapeList8.clear();
        java.lang.Class<?> wildcardClass12 = shapeList8.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) wildcardClass12);
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        int int17 = shapeList15.size();
        int int18 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        shapeList19.clear();
        boolean boolean26 = shapeList15.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape28 = shapeList19.getShape((-1));
        shapeList19.clear();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape32 = null;
        shapeList0.setShape(1, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        java.awt.Shape shape12 = shapeList0.getShape((int) '4');
        java.awt.Shape shape14 = null;
        shapeList0.setShape(1, shape14);
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
        shapeList25.clear();
        shapeList25.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        boolean boolean42 = shapeList25.equals(obj41);
        java.lang.Class<?> wildcardClass43 = obj41.getClass();
        boolean boolean44 = shapeList0.equals(obj41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        java.awt.Shape shape15 = null;
        shapeList6.setShape(34, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        java.awt.Shape shape24 = shapeList9.getShape(0);
        java.awt.Shape shape26 = null;
        shapeList9.setShape(8, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        boolean boolean6 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape((int) (byte) 100);
        java.awt.Shape shape13 = shapeList8.getShape(33);
        java.awt.Shape shape15 = null;
        shapeList8.setShape((int) 'a', shape15);
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '4', shape2);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        shapeList4.clear();
        shapeList4.clear();
        java.awt.Shape shape11 = shapeList4.getShape((-1));
        shapeList4.clear();
        java.lang.Object obj13 = shapeList4.clone();
        java.awt.Shape shape15 = shapeList4.getShape(0);
        boolean boolean16 = shapeList0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(11, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(2, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '4', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        java.awt.Shape shape16 = null;
        shapeList6.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        java.awt.Shape shape25 = null;
        shapeList5.setShape(0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(0, shape12);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        boolean boolean19 = shapeList14.equals((java.lang.Object) ' ');
        shapeList14.clear();
        int int21 = shapeList14.size();
        int int22 = shapeList14.size();
        java.awt.Shape shape24 = null;
        shapeList14.setShape((int) (short) 0, shape24);
        java.awt.Shape shape27 = null;
        shapeList14.setShape((int) (short) 10, shape27);
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        java.awt.Shape shape13 = shapeList4.getShape((-1));
        java.awt.Shape shape15 = null;
        shapeList4.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        java.awt.Shape shape24 = shapeList9.getShape(0);
        java.awt.Shape shape26 = null;
        shapeList9.setShape(53, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = shapeList0.getShape((-1));
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 100, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.awt.Shape shape33 = shapeList30.getShape(0);
        boolean boolean35 = shapeList30.equals((java.lang.Object) ' ');
        shapeList30.clear();
        int int37 = shapeList30.size();
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) 100);
        int int42 = shapeList39.size();
        boolean boolean44 = shapeList39.equals((java.lang.Object) (byte) 0);
        boolean boolean46 = shapeList39.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape48 = shapeList39.getShape(0);
        shapeList39.clear();
        boolean boolean50 = shapeList30.equals((java.lang.Object) shapeList39);
        java.lang.Object obj51 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj53 = shapeList52.clone();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        boolean boolean55 = shapeList30.equals((java.lang.Object) wildcardClass54);
        java.lang.Object obj56 = shapeList30.clone();
        boolean boolean57 = shapeList23.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape59 = null;
        shapeList23.setShape(34, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        boolean boolean34 = shapeList29.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = shapeList29.equals((java.lang.Object) (short) 100);
        shapeList29.clear();
        int int38 = shapeList29.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.awt.Shape shape42 = shapeList39.getShape(0);
        shapeList39.clear();
        shapeList39.clear();
        java.awt.Shape shape46 = shapeList39.getShape((int) 'a');
        java.lang.Object obj47 = shapeList39.clone();
        java.awt.Shape shape49 = shapeList39.getShape((int) '4');
        shapeList39.clear();
        int int51 = shapeList39.size();
        boolean boolean52 = shapeList29.equals((java.lang.Object) shapeList39);
        boolean boolean53 = shapeList0.equals((java.lang.Object) shapeList29);
        java.lang.Object obj54 = shapeList29.clone();
        java.awt.Shape shape56 = shapeList29.getShape(0);
        java.awt.Shape shape58 = null;
        shapeList29.setShape((int) (short) 0, shape58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(101, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.lang.Object obj13 = shapeList11.clone();
        java.awt.Shape shape15 = shapeList11.getShape((int) '4');
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        boolean boolean22 = shapeList17.equals((java.lang.Object) ' ');
        shapeList17.clear();
        int int24 = shapeList17.size();
        int int25 = shapeList17.size();
        java.awt.Shape shape27 = null;
        shapeList17.setShape((int) (short) 0, shape27);
        boolean boolean29 = shapeList11.equals((java.lang.Object) shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        boolean boolean15 = shapeList10.equals((java.lang.Object) (byte) 0);
        boolean boolean17 = shapeList10.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        int int22 = shapeList18.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) int22);
        java.lang.Object obj24 = shapeList10.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) '4', shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        java.awt.Shape shape43 = null;
        shapeList0.setShape((int) (short) 100, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        java.awt.Shape shape15 = shapeList10.getShape(33);
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList10.clear();
        java.awt.Shape shape19 = null;
        shapeList10.setShape((int) (byte) 100, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) 'a', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        shapeList0.clear();
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (short) 100, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        java.awt.Shape shape23 = null;
        shapeList11.setShape((int) (short) 0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 100, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        int int27 = shapeList5.size();
        int int28 = shapeList5.size();
        java.awt.Shape shape30 = null;
        shapeList5.setShape(1, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        boolean boolean19 = shapeList14.equals((java.lang.Object) ' ');
        shapeList14.clear();
        int int21 = shapeList14.size();
        int int22 = shapeList14.size();
        java.awt.Shape shape24 = null;
        shapeList14.setShape((int) (short) 0, shape24);
        java.awt.Shape shape27 = null;
        shapeList14.setShape((int) (short) 10, shape27);
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        shapeList5.clear();
        java.lang.Object obj7 = shapeList5.clone();
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape((int) '4');
        java.awt.Shape shape13 = shapeList0.getShape(53);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = shapeList14.equals((java.lang.Object) (short) 100);
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.lang.Object obj25 = shapeList23.clone();
        boolean boolean26 = shapeList14.equals((java.lang.Object) shapeList23);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        boolean boolean29 = shapeList14.equals((java.lang.Object) int28);
        shapeList14.clear();
        int int31 = shapeList14.size();
        int int32 = shapeList14.size();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape35 = null;
        shapeList14.setShape(11, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        java.awt.Shape shape13 = shapeList0.getShape(11);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape(100);
        java.lang.Object obj20 = shapeList12.clone();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 10, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        shapeList13.clear();
        java.awt.Shape shape23 = null;
        shapeList13.setShape(0, shape23);
        java.lang.Object obj25 = shapeList13.clone();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 1, shape12);
        java.awt.Shape shape15 = shapeList0.getShape((-1));
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(53, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj16", shapeList0.equals(obj16) ? shapeList0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.awt.Shape shape21 = null;
        shapeList4.setShape(53, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        java.awt.Shape shape38 = null;
        shapeList27.setShape(101, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((-1));
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 1, shape12);
        java.awt.Shape shape15 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = shapeList16.clone();
        java.lang.Object obj23 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        shapeList24.clear();
        java.lang.Class<?> wildcardClass28 = shapeList24.getClass();
        boolean boolean29 = shapeList16.equals((java.lang.Object) wildcardClass28);
        boolean boolean30 = shapeList0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        int int30 = shapeList27.size();
        boolean boolean32 = shapeList27.equals((java.lang.Object) (byte) 0);
        boolean boolean34 = shapeList27.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape36 = shapeList27.getShape((int) '4');
        java.lang.Object obj37 = shapeList27.clone();
        boolean boolean38 = shapeList5.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape40 = shapeList5.getShape(101);
        java.awt.Shape shape42 = null;
        shapeList5.setShape(10, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList7.clear();
        java.awt.Shape shape13 = null;
        shapeList7.setShape((int) (byte) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.awt.Shape shape6 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        java.awt.Shape shape11 = shapeList7.getShape((int) '#');
        java.awt.Shape shape13 = shapeList7.getShape((int) '4');
        int int14 = shapeList7.size();
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
        int int39 = shapeList16.size();
        shapeList16.clear();
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.awt.Shape shape45 = shapeList42.getShape(0);
        shapeList42.clear();
        shapeList42.clear();
        java.awt.Shape shape49 = shapeList42.getShape((-1));
        java.awt.Shape shape51 = null;
        shapeList42.setShape((int) 'a', shape51);
        java.lang.Object obj53 = shapeList42.clone();
        boolean boolean54 = shapeList16.equals((java.lang.Object) shapeList42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList42", shapeList0.equals(shapeList42) ? shapeList0.hashCode() == shapeList42.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        java.awt.Shape shape27 = null;
        shapeList16.setShape(11, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (short) 100, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        int int28 = shapeList25.size();
        boolean boolean30 = shapeList25.equals((java.lang.Object) (byte) 0);
        boolean boolean32 = shapeList25.equals((java.lang.Object) (short) 100);
        shapeList25.clear();
        shapeList25.clear();
        java.awt.Shape shape36 = null;
        shapeList25.setShape((int) (short) 10, shape36);
        java.awt.Shape shape39 = shapeList25.getShape((int) (byte) 10);
        boolean boolean40 = shapeList5.equals((java.lang.Object) shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) '4', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        java.awt.Shape shape18 = shapeList0.getShape(53);
        java.awt.Shape shape20 = null;
        shapeList0.setShape(11, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.awt.Shape shape39 = null;
        shapeList0.setShape((int) ' ', shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) '4', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(1, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        shapeList0.setShape(1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 100);
        int int16 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        java.awt.Shape shape24 = shapeList17.getShape((-1));
        java.awt.Shape shape26 = null;
        shapeList17.setShape((int) 'a', shape26);
        shapeList17.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape31 = null;
        shapeList0.setShape((int) (short) 1, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(101, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        java.awt.Shape shape11 = shapeList0.getShape(9);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(98, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(10);
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) '#', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        java.awt.Shape shape34 = shapeList0.getShape((int) '#');
        java.awt.Shape shape36 = null;
        shapeList0.setShape(98, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        java.awt.Shape shape28 = null;
        shapeList5.setShape(2, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        shapeList0.clear();
        java.awt.Shape shape31 = null;
        shapeList0.setShape((int) (short) 10, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (short) 1, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(9, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        int int14 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 100, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        shapeList37.setShape(1, shape51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList37", shapeList0.equals(shapeList37) ? shapeList0.hashCode() == shapeList37.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.lang.Object obj13 = shapeList11.clone();
        java.awt.Shape shape15 = shapeList11.getShape((int) '4');
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        java.awt.Shape shape30 = null;
        shapeList0.setShape(34, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        java.awt.Shape shape12 = null;
        shapeList7.setShape((int) ' ', shape12);
        int int14 = shapeList7.size();
        java.lang.Object obj15 = shapeList7.clone();
        java.awt.Shape shape17 = shapeList7.getShape((int) '4');
        int int18 = shapeList7.size();
        boolean boolean19 = shapeList0.equals((java.lang.Object) int18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 0);
        int int28 = shapeList25.size();
        java.awt.Shape shape30 = shapeList25.getShape((int) (byte) 1);
        java.awt.Shape shape32 = null;
        shapeList25.setShape((int) (short) 10, shape32);
        java.lang.Object obj34 = shapeList25.clone();
        boolean boolean35 = shapeList9.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (byte) 0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(34, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((-1));
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(2, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) 'a', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        shapeList6.clear();
        java.awt.Shape shape14 = null;
        shapeList6.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        boolean boolean34 = shapeList29.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = shapeList29.equals((java.lang.Object) (short) 100);
        shapeList29.clear();
        int int38 = shapeList29.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.awt.Shape shape42 = shapeList39.getShape(0);
        shapeList39.clear();
        shapeList39.clear();
        java.awt.Shape shape46 = shapeList39.getShape((int) 'a');
        java.lang.Object obj47 = shapeList39.clone();
        java.awt.Shape shape49 = shapeList39.getShape((int) '4');
        shapeList39.clear();
        int int51 = shapeList39.size();
        boolean boolean52 = shapeList29.equals((java.lang.Object) shapeList39);
        boolean boolean53 = shapeList0.equals((java.lang.Object) shapeList29);
        java.lang.Object obj54 = shapeList29.clone();
        java.awt.Shape shape56 = shapeList29.getShape(0);
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        int int58 = shapeList57.size();
        java.awt.Shape shape60 = shapeList57.getShape((int) (byte) 100);
        shapeList57.clear();
        org.jfree.chart.util.ShapeList shapeList62 = new org.jfree.chart.util.ShapeList();
        int int63 = shapeList62.size();
        int int64 = shapeList62.size();
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        int int66 = shapeList65.size();
        java.lang.Object obj67 = shapeList65.clone();
        int int68 = shapeList65.size();
        java.lang.Object obj69 = shapeList65.clone();
        boolean boolean70 = shapeList62.equals((java.lang.Object) shapeList65);
        shapeList62.clear();
        org.jfree.chart.util.ShapeList shapeList72 = new org.jfree.chart.util.ShapeList();
        int int73 = shapeList72.size();
        java.lang.Object obj74 = shapeList72.clone();
        int int75 = shapeList72.size();
        java.lang.Object obj76 = shapeList72.clone();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        boolean boolean78 = shapeList62.equals(obj76);
        java.awt.Shape shape80 = shapeList62.getShape(100);
        shapeList62.clear();
        int int82 = shapeList62.size();
        boolean boolean83 = shapeList57.equals((java.lang.Object) shapeList62);
        int int84 = shapeList62.size();
        int int85 = shapeList62.size();
        java.lang.Object obj86 = shapeList62.clone();
        boolean boolean87 = shapeList29.equals((java.lang.Object) shapeList62);
        java.awt.Shape shape89 = null;
        shapeList29.setShape((int) (short) 1, shape89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(33, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 100);
        int int16 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        java.awt.Shape shape24 = shapeList17.getShape((-1));
        java.awt.Shape shape26 = null;
        shapeList17.setShape((int) 'a', shape26);
        shapeList17.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape31 = null;
        shapeList17.setShape((int) (short) 100, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape(0);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) '4', shape19);
        java.lang.Object obj21 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        int int29 = shapeList22.size();
        int int30 = shapeList22.size();
        shapeList22.clear();
        java.awt.Shape shape33 = shapeList22.getShape(0);
        boolean boolean34 = shapeList0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '#', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        shapeList37.setShape((int) (short) 1, shape51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList37", shapeList0.equals(shapeList37) ? shapeList0.hashCode() == shapeList37.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(53, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        java.awt.Shape shape15 = shapeList11.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean20 = shapeList11.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = shapeList11.getShape(0);
        java.lang.Object obj23 = shapeList11.clone();
        java.lang.Object obj24 = shapeList11.clone();
        java.lang.Object obj25 = shapeList11.clone();
        java.lang.Class<?> wildcardClass26 = shapeList11.getClass();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        boolean boolean34 = shapeList29.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = shapeList29.equals((java.lang.Object) (short) 100);
        shapeList29.clear();
        shapeList29.clear();
        java.awt.Shape shape40 = shapeList29.getShape((int) '#');
        boolean boolean41 = shapeList12.equals((java.lang.Object) '#');
        java.awt.Shape shape43 = null;
        shapeList12.setShape(53, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        int int37 = shapeList27.size();
        java.awt.Shape shape39 = null;
        shapeList27.setShape(1, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        int int4 = shapeList0.size();
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) ' ', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        int int28 = shapeList25.size();
        boolean boolean30 = shapeList25.equals((java.lang.Object) (byte) 0);
        boolean boolean32 = shapeList25.equals((java.lang.Object) (short) 100);
        shapeList25.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        java.lang.Object obj36 = shapeList34.clone();
        boolean boolean37 = shapeList25.equals((java.lang.Object) shapeList34);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        boolean boolean40 = shapeList25.equals((java.lang.Object) int39);
        java.lang.Object obj41 = shapeList25.clone();
        java.awt.Shape shape43 = shapeList25.getShape((-1));
        boolean boolean44 = shapeList0.equals((java.lang.Object) shape43);
        int int45 = shapeList0.size();
        java.awt.Shape shape47 = null;
        shapeList0.setShape((int) (short) 100, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        shapeList13.clear();
        int int20 = shapeList13.size();
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        boolean boolean29 = shapeList22.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape31 = shapeList22.getShape(0);
        shapeList22.clear();
        boolean boolean33 = shapeList13.equals((java.lang.Object) shapeList22);
        java.lang.Object obj34 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = shapeList13.equals((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = shapeList13.clone();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape42 = null;
        shapeList13.setShape(34, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 100);
        int int16 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        java.awt.Shape shape24 = shapeList17.getShape((-1));
        java.awt.Shape shape26 = null;
        shapeList17.setShape((int) 'a', shape26);
        shapeList17.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape31 = null;
        shapeList0.setShape((int) (short) 100, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(8, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        int int42 = shapeList0.size();
        java.awt.Shape shape44 = null;
        shapeList0.setShape((int) (short) 100, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList3.getShape(0);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape(100);
        boolean boolean27 = shapeList11.equals((java.lang.Object) shape26);
        boolean boolean28 = shapeList3.equals((java.lang.Object) shape26);
        java.awt.Shape shape30 = null;
        shapeList3.setShape((int) '4', shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.awt.Shape shape42 = null;
        shapeList0.setShape(101, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(100);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(101, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape21 = shapeList14.getShape((-1));
        shapeList14.clear();
        java.lang.Object obj23 = shapeList14.clone();
        java.awt.Shape shape25 = shapeList14.getShape(0);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        int int4 = shapeList0.size();
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(101, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        boolean boolean53 = shapeList51.equals((java.lang.Object) 100);
        java.awt.Shape shape55 = shapeList51.getShape((int) '#');
        java.awt.Shape shape57 = shapeList51.getShape((int) '4');
        java.awt.Shape shape59 = null;
        shapeList51.setShape((int) (byte) 0, shape59);
        java.awt.Shape shape62 = shapeList51.getShape((int) (byte) 100);
        boolean boolean63 = shapeList0.equals((java.lang.Object) shapeList51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList51", shapeList0.equals(shapeList51) ? shapeList0.hashCode() == shapeList51.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape(53, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(101, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        shapeList4.clear();
        java.awt.Shape shape14 = null;
        shapeList4.setShape(8, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        int int14 = shapeList3.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        boolean boolean22 = shapeList15.equals((java.lang.Object) (short) 100);
        shapeList15.clear();
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape27 = null;
        shapeList15.setShape(2, shape27);
        boolean boolean29 = shapeList3.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        java.awt.Shape shape21 = shapeList0.getShape(98);
        java.awt.Shape shape23 = null;
        shapeList0.setShape(2, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        java.lang.Object obj14 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape((int) (byte) 100);
        shapeList15.clear();
        int int20 = shapeList15.size();
        int int21 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        int int29 = shapeList22.size();
        shapeList22.clear();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        boolean boolean33 = shapeList31.equals((java.lang.Object) 100);
        int int34 = shapeList31.size();
        boolean boolean36 = shapeList31.equals((java.lang.Object) (byte) 0);
        boolean boolean38 = shapeList31.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape40 = shapeList31.getShape(0);
        shapeList31.clear();
        boolean boolean42 = shapeList22.equals((java.lang.Object) shapeList31);
        shapeList31.clear();
        shapeList31.clear();
        boolean boolean45 = shapeList15.equals((java.lang.Object) shapeList31);
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        shapeList0.clear();
        java.awt.Shape shape35 = null;
        shapeList0.setShape((int) (short) 1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
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
        java.lang.Object obj38 = shapeList13.clone();
        shapeList13.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape42 = null;
        shapeList13.setShape(34, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (byte) 100, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        java.awt.Shape shape12 = shapeList5.getShape((-1));
        shapeList5.clear();
        java.awt.Shape shape15 = shapeList5.getShape((int) (byte) 100);
        java.awt.Shape shape17 = shapeList5.getShape(8);
        java.awt.Shape shape19 = null;
        shapeList5.setShape(0, shape19);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '4', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        int int25 = shapeList19.size();
        int int26 = shapeList19.size();
        int int27 = shapeList19.size();
        java.lang.Object obj28 = shapeList19.clone();
        boolean boolean29 = shapeList0.equals(obj28);
        java.awt.Shape shape31 = null;
        shapeList0.setShape(9, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        java.lang.Object obj38 = shapeList0.clone();
        java.awt.Shape shape40 = null;
        shapeList0.setShape(34, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        java.awt.Shape shape12 = shapeList0.getShape(2);
        java.awt.Shape shape14 = null;
        shapeList0.setShape(53, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(1, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 1, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        java.awt.Shape shape21 = shapeList0.getShape(98);
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(8, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.lang.Object obj13 = shapeList11.clone();
        java.awt.Shape shape15 = shapeList11.getShape((int) '4');
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) '4', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) ' ', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (byte) 100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.awt.Shape shape6 = shapeList3.getShape(0);
        boolean boolean8 = shapeList3.equals((java.lang.Object) ' ');
        shapeList3.clear();
        int int10 = shapeList3.size();
        shapeList3.clear();
        java.awt.Shape shape13 = shapeList3.getShape((-1));
        java.awt.Shape shape15 = shapeList3.getShape((-1));
        shapeList3.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape19 = shapeList3.getShape((int) (byte) 1);
        java.awt.Shape shape21 = null;
        shapeList3.setShape((int) '4', shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) ' ', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        shapeList0.setShape(101, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(34, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        java.awt.Shape shape29 = null;
        shapeList12.setShape((int) (byte) 100, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) 100);
        boolean boolean19 = shapeList10.equals((java.lang.Object) 10L);
        java.awt.Shape shape21 = shapeList10.getShape((int) (byte) 1);
        boolean boolean22 = shapeList0.equals((java.lang.Object) (byte) 1);
        shapeList0.clear();
        java.awt.Shape shape25 = null;
        shapeList0.setShape(0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        java.lang.Object obj12 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        shapeList13.clear();
        int int20 = shapeList13.size();
        java.awt.Shape shape22 = shapeList13.getShape(101);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape((int) (byte) 100);
        java.awt.Shape shape28 = shapeList23.getShape(33);
        shapeList23.clear();
        java.lang.Object obj30 = shapeList23.clone();
        int int31 = shapeList23.size();
        java.awt.Shape shape33 = shapeList23.getShape((int) (short) 100);
        int int34 = shapeList23.size();
        shapeList23.clear();
        boolean boolean36 = shapeList13.equals((java.lang.Object) shapeList23);
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        int int11 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        java.lang.Object obj13 = shapeList0.clone();
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        boolean boolean22 = shapeList15.equals((java.lang.Object) (short) 100);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape26 = null;
        shapeList15.setShape((int) (short) 10, shape26);
        java.awt.Shape shape29 = shapeList15.getShape((int) (byte) 10);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        boolean boolean22 = shapeList17.equals((java.lang.Object) ' ');
        java.awt.Shape shape24 = shapeList17.getShape((-1));
        shapeList17.clear();
        java.awt.Shape shape27 = shapeList17.getShape((int) (byte) 100);
        int int28 = shapeList17.size();
        java.lang.Object obj29 = shapeList17.clone();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(11, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) ' ', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
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
        java.lang.Object obj37 = shapeList12.clone();
        int int38 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        int int41 = shapeList39.size();
        boolean boolean42 = shapeList12.equals((java.lang.Object) int41);
        java.awt.Shape shape44 = shapeList12.getShape(10);
        boolean boolean45 = shapeList0.equals((java.lang.Object) shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        shapeList17.clear();
        java.lang.Object obj20 = shapeList17.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList17);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        java.awt.Shape shape27 = shapeList22.getShape((int) '#');
        java.awt.Shape shape29 = shapeList22.getShape((int) (short) 1);
        boolean boolean30 = shapeList17.equals((java.lang.Object) (short) 1);
        int int31 = shapeList17.size();
        boolean boolean32 = shapeList0.equals((java.lang.Object) int31);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        boolean boolean41 = shapeList34.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape43 = shapeList34.getShape((int) '4');
        int int44 = shapeList34.size();
        java.lang.Object obj45 = shapeList34.clone();
        int int46 = shapeList34.size();
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList34);
        java.awt.Shape shape49 = null;
        shapeList34.setShape(53, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape(1);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 100, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (byte) 1, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        int int14 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        boolean boolean20 = shapeList12.equals((java.lang.Object) shapeList15);
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.lang.Object obj24 = shapeList22.clone();
        int int25 = shapeList22.size();
        java.lang.Object obj26 = shapeList22.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = shapeList12.equals(obj26);
        java.awt.Shape shape30 = shapeList12.getShape(100);
        shapeList12.clear();
        java.lang.Class<?> wildcardClass32 = shapeList12.getClass();
        boolean boolean33 = shapeList0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(9);
        java.awt.Shape shape14 = shapeList0.getShape(100);
        java.lang.Object obj15 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        int int24 = shapeList16.size();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        int int29 = shapeList26.size();
        java.awt.Shape shape31 = shapeList26.getShape(33);
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList26);
        java.lang.Object obj33 = shapeList16.clone();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) 100);
        int int38 = shapeList35.size();
        java.awt.Shape shape40 = shapeList35.getShape((int) '#');
        java.awt.Shape shape42 = shapeList35.getShape((int) (byte) 100);
        java.awt.Shape shape44 = shapeList35.getShape((int) ' ');
        java.awt.Shape shape46 = shapeList35.getShape((int) ' ');
        shapeList35.clear();
        java.awt.Shape shape49 = null;
        shapeList35.setShape(9, shape49);
        boolean boolean51 = shapeList0.equals((java.lang.Object) shapeList35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        shapeList17.clear();
        java.lang.Object obj20 = shapeList17.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList17);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        java.awt.Shape shape27 = shapeList22.getShape((int) '#');
        java.awt.Shape shape29 = shapeList22.getShape((int) (short) 1);
        boolean boolean30 = shapeList17.equals((java.lang.Object) (short) 1);
        int int31 = shapeList17.size();
        boolean boolean32 = shapeList0.equals((java.lang.Object) int31);
        java.awt.Shape shape34 = null;
        shapeList0.setShape(101, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape(0, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        int int10 = shapeList7.size();
        boolean boolean12 = shapeList7.equals((java.lang.Object) (byte) 0);
        boolean boolean14 = shapeList7.equals((java.lang.Object) (short) 100);
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape18 = shapeList7.getShape((int) '#');
        java.awt.Shape shape20 = null;
        shapeList7.setShape(1, shape20);
        java.awt.Shape shape23 = shapeList7.getShape((int) (byte) 10);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        boolean boolean9 = shapeList4.equals((java.lang.Object) ' ');
        java.lang.Object obj10 = shapeList4.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = null;
        shapeList4.setShape((int) (short) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        shapeList22.clear();
        boolean boolean30 = shapeList15.equals((java.lang.Object) shapeList22);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.lang.Object obj32 = shapeList15.clone();
        java.awt.Shape shape34 = null;
        shapeList15.setShape(2, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList13.clone();
        java.awt.Shape shape23 = shapeList13.getShape(0);
        java.awt.Shape shape25 = shapeList13.getShape((int) (byte) 1);
        boolean boolean26 = shapeList0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
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
        java.lang.Object obj38 = shapeList13.clone();
        shapeList13.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape42 = null;
        shapeList0.setShape(101, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) ' ', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape37 = null;
        shapeList32.setShape((int) (short) 100, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList32", shapeList0.equals(shapeList32) ? shapeList0.hashCode() == shapeList32.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        int int19 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape22 = null;
        shapeList0.setShape(34, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) 100);
        int int6 = shapeList3.size();
        boolean boolean8 = shapeList3.equals((java.lang.Object) (byte) 0);
        boolean boolean10 = shapeList3.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape12 = shapeList3.getShape(0);
        java.awt.Shape shape14 = null;
        shapeList3.setShape(100, shape14);
        java.awt.Shape shape17 = shapeList3.getShape(1);
        java.lang.Class<?> wildcardClass18 = shapeList3.getClass();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        java.awt.Shape shape21 = shapeList0.getShape(98);
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) (short) 10, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(10);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(53, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) '#', shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        java.awt.Shape shape32 = shapeList0.getShape((int) '4');
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) (short) 0, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(100);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(11, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        java.awt.Shape shape37 = null;
        shapeList22.setShape((int) (byte) 1, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        java.awt.Shape shape17 = null;
        shapeList7.setShape(10, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        boolean boolean22 = shapeList17.equals((java.lang.Object) (byte) 0);
        boolean boolean24 = shapeList17.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape26 = shapeList17.getShape(0);
        shapeList17.clear();
        boolean boolean28 = shapeList8.equals((java.lang.Object) shapeList17);
        shapeList17.clear();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList17);
        int int31 = shapeList0.size();
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) '#', shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) (byte) 10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        int int14 = shapeList8.size();
        java.awt.Shape shape16 = null;
        shapeList8.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(11, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        java.awt.Shape shape38 = null;
        shapeList0.setShape((int) '#', shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape((int) (byte) 100);
        java.awt.Shape shape14 = shapeList9.getShape(33);
        shapeList9.clear();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) '4', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean10 = shapeList5.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape12 = shapeList5.getShape((int) (short) 1);
        java.lang.Object obj13 = shapeList5.clone();
        int int14 = shapeList5.size();
        int int15 = shapeList5.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape18 = null;
        shapeList5.setShape(53, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        java.awt.Shape shape17 = shapeList0.getShape((int) '4');
        java.awt.Shape shape19 = null;
        shapeList0.setShape(1, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        java.awt.Shape shape35 = null;
        shapeList22.setShape((int) (short) 10, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        java.awt.Shape shape40 = shapeList37.getShape((int) (byte) 100);
        java.awt.Shape shape42 = shapeList37.getShape(33);
        shapeList37.clear();
        java.lang.Object obj44 = shapeList37.clone();
        int int45 = shapeList37.size();
        java.awt.Shape shape47 = shapeList37.getShape((int) (short) 100);
        boolean boolean48 = shapeList21.equals((java.lang.Object) (short) 100);
        shapeList21.clear();
        java.awt.Shape shape51 = shapeList21.getShape(98);
        java.awt.Shape shape53 = null;
        shapeList21.setShape((int) (short) 1, shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(33, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape((int) (byte) 100);
        java.awt.Shape shape15 = shapeList10.getShape(33);
        shapeList10.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape19 = null;
        shapeList10.setShape((int) '#', shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(53, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        shapeList0.clear();
        java.awt.Shape shape14 = shapeList0.getShape(98);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(34, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(8);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 1, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape(33);
        java.awt.Shape shape17 = shapeList0.getShape(0);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) '#', shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '4', shape5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        java.lang.Class<?> wildcardClass18 = shapeList14.getClass();
        boolean boolean19 = shapeList7.equals((java.lang.Object) wildcardClass18);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        int int22 = shapeList20.size();
        int int23 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        shapeList24.clear();
        java.lang.Object obj27 = shapeList24.clone();
        boolean boolean28 = shapeList20.equals((java.lang.Object) shapeList24);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        java.awt.Shape shape34 = shapeList29.getShape((int) '#');
        java.awt.Shape shape36 = shapeList29.getShape((int) (short) 1);
        boolean boolean37 = shapeList24.equals((java.lang.Object) (short) 1);
        int int38 = shapeList24.size();
        boolean boolean39 = shapeList7.equals((java.lang.Object) int38);
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        boolean boolean43 = shapeList41.equals((java.lang.Object) 100);
        int int44 = shapeList41.size();
        boolean boolean46 = shapeList41.equals((java.lang.Object) (byte) 0);
        boolean boolean48 = shapeList41.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape50 = shapeList41.getShape((int) '4');
        int int51 = shapeList41.size();
        java.lang.Object obj52 = shapeList41.clone();
        int int53 = shapeList41.size();
        boolean boolean54 = shapeList7.equals((java.lang.Object) shapeList41);
        boolean boolean55 = shapeList0.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape(1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(101, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) ' ', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        int int19 = shapeList15.size();
        boolean boolean20 = shapeList0.equals((java.lang.Object) int19);
        java.lang.Object obj21 = shapeList0.clone();
        java.awt.Shape shape23 = null;
        shapeList0.setShape(53, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        shapeList30.clear();
        shapeList30.clear();
        java.awt.Shape shape37 = shapeList30.getShape(100);
        int int38 = shapeList30.size();
        java.awt.Shape shape40 = null;
        shapeList30.setShape((int) ' ', shape40);
        java.awt.Shape shape43 = shapeList30.getShape((int) (short) 100);
        java.awt.Shape shape45 = shapeList30.getShape((int) (short) 1);
        boolean boolean46 = shapeList12.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        java.awt.Shape shape33 = null;
        shapeList12.setShape(11, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) ' ', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(2, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.awt.Shape shape33 = shapeList30.getShape((int) (byte) 100);
        java.awt.Shape shape35 = shapeList30.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        shapeList36.clear();
        java.lang.Class<?> wildcardClass43 = shapeList36.getClass();
        boolean boolean44 = shapeList30.equals((java.lang.Object) shapeList36);
        java.lang.Object obj45 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        boolean boolean48 = shapeList46.equals((java.lang.Object) 100);
        int int49 = shapeList46.size();
        boolean boolean51 = shapeList46.equals((java.lang.Object) (byte) 0);
        boolean boolean53 = shapeList46.equals((java.lang.Object) (short) 100);
        shapeList46.clear();
        shapeList46.clear();
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        int int57 = shapeList56.size();
        java.lang.Object obj58 = shapeList56.clone();
        int int59 = shapeList56.size();
        java.lang.Object obj60 = shapeList56.clone();
        shapeList56.clear();
        java.awt.Shape shape63 = shapeList56.getShape((int) (short) 100);
        boolean boolean65 = shapeList56.equals((java.lang.Object) 10L);
        java.awt.Shape shape67 = shapeList56.getShape((int) (byte) 1);
        boolean boolean68 = shapeList46.equals((java.lang.Object) (byte) 1);
        shapeList46.clear();
        boolean boolean70 = shapeList30.equals((java.lang.Object) shapeList46);
        boolean boolean71 = shapeList0.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape73 = null;
        shapeList0.setShape(0, shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        java.lang.Object obj15 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        java.awt.Shape shape21 = shapeList16.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        java.awt.Shape shape26 = shapeList22.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        int int30 = shapeList27.size();
        boolean boolean31 = shapeList22.equals((java.lang.Object) int30);
        java.awt.Shape shape33 = shapeList22.getShape(0);
        boolean boolean34 = shapeList16.equals((java.lang.Object) 0);
        java.lang.Object obj35 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = shapeList36.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape45 = shapeList36.getShape(0);
        java.awt.Shape shape47 = null;
        shapeList36.setShape(100, shape47);
        java.awt.Shape shape50 = shapeList36.getShape(1);
        shapeList36.clear();
        boolean boolean52 = shapeList16.equals((java.lang.Object) shapeList36);
        boolean boolean53 = shapeList0.equals((java.lang.Object) boolean52);
        java.awt.Shape shape55 = null;
        shapeList0.setShape(0, shape55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        java.lang.Object obj11 = shapeList5.clone();
        shapeList5.clear();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape15 = null;
        shapeList5.setShape(53, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(34, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (short) 100, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = null;
        boolean boolean13 = shapeList0.equals(obj12);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(36, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
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
        shapeList0.clear();
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) (byte) 10, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        java.lang.Object obj13 = shapeList7.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape26 = shapeList19.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList19.clone();
        int int28 = shapeList19.size();
        int int29 = shapeList19.size();
        boolean boolean30 = shapeList14.equals((java.lang.Object) shapeList19);
        shapeList14.clear();
        shapeList14.clear();
        boolean boolean33 = shapeList7.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape35 = null;
        shapeList14.setShape(11, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape(1, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        java.awt.Shape shape20 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        int int23 = shapeList21.size();
        int int24 = shapeList21.size();
        java.awt.Shape shape26 = shapeList21.getShape(0);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        int int33 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) (short) 0);
        java.lang.Object obj37 = shapeList34.clone();
        boolean boolean38 = shapeList27.equals(obj37);
        int int39 = shapeList27.size();
        shapeList27.clear();
        boolean boolean41 = shapeList21.equals((java.lang.Object) shapeList27);
        boolean boolean42 = shapeList0.equals((java.lang.Object) boolean41);
        java.awt.Shape shape44 = null;
        shapeList0.setShape(101, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList3.getShape(0);
        int int11 = shapeList3.size();
        java.lang.Object obj12 = shapeList3.clone();
        java.awt.Shape shape14 = null;
        shapeList3.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) (-1));
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (short) 10, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape14 = shapeList0.getShape(11);
        shapeList0.clear();
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        java.awt.Shape shape25 = null;
        shapeList9.setShape((int) '4', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape(10, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        int int24 = shapeList9.size();
        java.awt.Shape shape26 = null;
        shapeList9.setShape((int) '4', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(8, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape((int) (byte) 100);
        shapeList16.clear();
        int int21 = shapeList16.size();
        int int22 = shapeList16.size();
        int int23 = shapeList16.size();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape26 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) (byte) 0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        int int12 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.awt.Shape shape6 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        java.awt.Shape shape11 = shapeList7.getShape((int) '#');
        java.awt.Shape shape13 = shapeList7.getShape((int) '4');
        int int14 = shapeList7.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        boolean boolean21 = shapeList16.equals((java.lang.Object) ' ');
        java.awt.Shape shape23 = shapeList16.getShape((-1));
        shapeList16.clear();
        java.awt.Shape shape26 = shapeList16.getShape((int) (byte) 100);
        java.awt.Shape shape28 = shapeList16.getShape(8);
        java.awt.Shape shape30 = null;
        shapeList16.setShape(0, shape30);
        boolean boolean32 = shapeList0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape(100);
        java.lang.Object obj20 = shapeList12.clone();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        shapeList0.clear();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(2, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(2, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        shapeList0.clear();
        java.awt.Shape shape35 = null;
        shapeList0.setShape(98, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.awt.Shape shape25 = null;
        shapeList11.setShape(98, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        shapeList5.clear();
        int int12 = shapeList5.size();
        shapeList5.clear();
        java.awt.Shape shape15 = null;
        shapeList5.setShape((int) 'a', shape15);
        boolean boolean18 = shapeList5.equals((java.lang.Object) (-1L));
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        java.lang.Object obj19 = shapeList6.clone();
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList6.equals(obj20);
        java.awt.Shape shape23 = null;
        shapeList6.setShape((int) (byte) 0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        java.awt.Shape shape29 = null;
        shapeList0.setShape(10, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.lang.Object obj14 = shapeList12.clone();
        shapeList12.clear();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        shapeList0.clear();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        boolean boolean15 = shapeList10.equals((java.lang.Object) ' ');
        shapeList10.clear();
        int int17 = shapeList10.size();
        int int18 = shapeList10.size();
        shapeList10.clear();
        int int20 = shapeList10.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = null;
        shapeList0.setShape(11, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape10 = null;
        shapeList4.setShape((int) '#', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        java.lang.Object obj24 = shapeList0.clone();
        java.lang.Object obj25 = shapeList0.clone();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        java.awt.Shape shape28 = null;
        shapeList5.setShape(0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        boolean boolean34 = shapeList29.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = shapeList29.equals((java.lang.Object) (short) 100);
        shapeList29.clear();
        shapeList29.clear();
        java.awt.Shape shape40 = shapeList29.getShape((int) '#');
        boolean boolean41 = shapeList12.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.awt.Shape shape45 = shapeList42.getShape(0);
        boolean boolean47 = shapeList42.equals((java.lang.Object) ' ');
        shapeList42.clear();
        int int49 = shapeList42.size();
        shapeList42.clear();
        java.awt.Shape shape52 = shapeList42.getShape((-1));
        java.lang.Object obj53 = shapeList42.clone();
        int int54 = shapeList42.size();
        java.lang.Class<?> wildcardClass55 = shapeList42.getClass();
        boolean boolean56 = shapeList12.equals((java.lang.Object) wildcardClass55);
        java.awt.Shape shape58 = null;
        shapeList12.setShape((int) (byte) 0, shape58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        shapeList23.clear();
        shapeList23.clear();
        java.awt.Shape shape30 = shapeList23.getShape((int) 'a');
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape33 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(33, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape28 = null;
        shapeList0.setShape(11, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape(100);
        boolean boolean21 = shapeList7.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape23 = null;
        shapeList7.setShape(0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        java.lang.Object obj38 = shapeList0.clone();
        java.awt.Shape shape40 = null;
        shapeList0.setShape((int) (byte) 0, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        int int19 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape22 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        boolean boolean28 = shapeList23.equals((java.lang.Object) ' ');
        shapeList23.clear();
        int int30 = shapeList23.size();
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        int int35 = shapeList32.size();
        boolean boolean37 = shapeList32.equals((java.lang.Object) (byte) 0);
        boolean boolean39 = shapeList32.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape41 = shapeList32.getShape(0);
        shapeList32.clear();
        boolean boolean43 = shapeList23.equals((java.lang.Object) shapeList32);
        shapeList23.clear();
        java.lang.Object obj45 = shapeList23.clone();
        java.lang.Object obj46 = shapeList23.clone();
        java.lang.Object obj47 = shapeList23.clone();
        java.lang.Object obj48 = shapeList23.clone();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape51 = null;
        shapeList23.setShape(101, shape51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        boolean boolean33 = shapeList31.equals((java.lang.Object) 100);
        int int34 = shapeList31.size();
        boolean boolean36 = shapeList31.equals((java.lang.Object) (byte) 0);
        boolean boolean38 = shapeList31.equals((java.lang.Object) (short) 100);
        shapeList31.clear();
        shapeList31.clear();
        java.awt.Shape shape42 = null;
        shapeList31.setShape((int) (short) 10, shape42);
        java.awt.Shape shape45 = shapeList31.getShape((int) (byte) 10);
        java.awt.Shape shape47 = shapeList31.getShape((-1));
        boolean boolean48 = shapeList0.equals((java.lang.Object) shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList31", shapeList0.equals(shapeList31) ? shapeList0.hashCode() == shapeList31.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        int int6 = shapeList4.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        int int10 = shapeList7.size();
        boolean boolean12 = shapeList7.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape14 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj15 = shapeList7.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((int) 'a');
        java.lang.Object obj27 = shapeList19.clone();
        boolean boolean28 = shapeList16.equals(obj27);
        shapeList16.clear();
        boolean boolean30 = shapeList7.equals((java.lang.Object) shapeList16);
        boolean boolean31 = shapeList4.equals((java.lang.Object) shapeList16);
        shapeList16.clear();
        java.lang.Object obj33 = shapeList16.clone();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape36 = null;
        shapeList0.setShape((int) (byte) 100, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        java.awt.Shape shape52 = shapeList49.getShape(0);
        shapeList49.clear();
        shapeList49.clear();
        shapeList49.clear();
        java.awt.Shape shape57 = null;
        shapeList49.setShape((int) (byte) 0, shape57);
        int int59 = shapeList49.size();
        java.awt.Shape shape61 = null;
        shapeList49.setShape(0, shape61);
        boolean boolean63 = shapeList0.equals((java.lang.Object) shapeList49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList49", shapeList0.equals(shapeList49) ? shapeList0.hashCode() == shapeList49.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        java.lang.Object obj16 = shapeList15.clone();
        java.lang.Object obj17 = shapeList15.clone();
        shapeList15.clear();
        java.lang.Class<?> wildcardClass19 = shapeList15.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape22 = null;
        shapeList15.setShape(34, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        boolean boolean9 = shapeList0.equals((java.lang.Object) 10L);
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        shapeList12.clear();
        int int19 = shapeList12.size();
        shapeList12.clear();
        java.awt.Shape shape22 = null;
        shapeList12.setShape((int) 'a', shape22);
        boolean boolean25 = shapeList12.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass26 = shapeList12.getClass();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        shapeList5.clear();
        int int12 = shapeList5.size();
        shapeList5.clear();
        java.lang.Object obj14 = shapeList5.clone();
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
        boolean boolean37 = shapeList5.equals(obj36);
        int int38 = shapeList5.size();
        java.awt.Shape shape40 = shapeList5.getShape(0);
        java.lang.Object obj41 = shapeList5.clone();
        int int42 = shapeList5.size();
        java.lang.Object obj43 = shapeList5.clone();
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape46 = null;
        shapeList5.setShape(33, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        shapeList6.setShape(10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        java.awt.Shape shape8 = shapeList4.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean13 = shapeList4.equals((java.lang.Object) int12);
        boolean boolean14 = shapeList0.equals((java.lang.Object) boolean13);
        java.lang.Object obj15 = shapeList0.clone();
        int int16 = shapeList0.size();
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape(0);
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) '#', shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        java.awt.Shape shape19 = shapeList4.getShape((int) (short) 10);
        java.awt.Shape shape21 = null;
        shapeList4.setShape(2, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        int int40 = shapeList13.size();
        java.awt.Shape shape42 = null;
        shapeList13.setShape(34, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1L);
        java.awt.Shape shape6 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        java.awt.Shape shape11 = shapeList7.getShape((int) '#');
        java.awt.Shape shape13 = shapeList7.getShape((int) '4');
        int int14 = shapeList7.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape19 = null;
        shapeList7.setShape((int) (byte) 0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(9, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        java.awt.Shape shape21 = shapeList0.getShape(98);
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) '#', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        shapeList17.clear();
        java.lang.Object obj20 = shapeList17.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList17);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        java.awt.Shape shape27 = shapeList22.getShape((int) '#');
        java.awt.Shape shape29 = shapeList22.getShape((int) (short) 1);
        boolean boolean30 = shapeList17.equals((java.lang.Object) (short) 1);
        int int31 = shapeList17.size();
        boolean boolean32 = shapeList0.equals((java.lang.Object) int31);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        boolean boolean41 = shapeList34.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape43 = shapeList34.getShape((int) '4');
        int int44 = shapeList34.size();
        java.lang.Object obj45 = shapeList34.clone();
        int int46 = shapeList34.size();
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList34);
        java.awt.Shape shape49 = null;
        shapeList0.setShape(10, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        java.awt.Shape shape17 = shapeList0.getShape(0);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(33, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 100);
        int int16 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        shapeList17.clear();
        shapeList17.clear();
        java.awt.Shape shape24 = shapeList17.getShape((-1));
        java.awt.Shape shape26 = null;
        shapeList17.setShape((int) 'a', shape26);
        shapeList17.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList17);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.awt.Shape shape33 = shapeList30.getShape(0);
        boolean boolean35 = shapeList30.equals((java.lang.Object) ' ');
        java.lang.Object obj36 = shapeList30.clone();
        java.awt.Shape shape38 = shapeList30.getShape((int) 'a');
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList30);
        shapeList30.clear();
        shapeList30.clear();
        java.awt.Shape shape43 = null;
        shapeList30.setShape(9, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        java.awt.Shape shape59 = null;
        shapeList0.setShape(34, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        java.awt.Shape shape34 = shapeList0.getShape((int) '#');
        java.awt.Shape shape36 = null;
        shapeList0.setShape(9, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (short) 10, shape7);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 0, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        java.lang.Object obj18 = shapeList13.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) ' ', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        shapeList0.clear();
        int int13 = shapeList0.size();
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(98, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        java.awt.Shape shape25 = shapeList22.getShape((int) (byte) 100);
        shapeList22.clear();
        int int27 = shapeList22.size();
        int int28 = shapeList22.size();
        java.lang.Object obj29 = shapeList22.clone();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape32 = null;
        shapeList0.setShape(98, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        java.awt.Shape shape15 = shapeList10.getShape(33);
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        java.awt.Shape shape21 = shapeList18.getShape(0);
        shapeList18.clear();
        shapeList18.clear();
        int int24 = shapeList18.size();
        java.awt.Shape shape26 = shapeList18.getShape((-1));
        shapeList18.clear();
        int int28 = shapeList18.size();
        java.awt.Shape shape30 = null;
        shapeList18.setShape((int) (byte) 1, shape30);
        boolean boolean32 = shapeList10.equals((java.lang.Object) shapeList18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        java.lang.Object obj23 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        int int26 = shapeList24.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.lang.Object obj29 = shapeList27.clone();
        int int30 = shapeList27.size();
        java.lang.Object obj31 = shapeList27.clone();
        boolean boolean32 = shapeList24.equals((java.lang.Object) shapeList27);
        shapeList24.clear();
        java.lang.Object obj34 = shapeList24.clone();
        boolean boolean35 = shapeList0.equals(obj34);
        java.awt.Shape shape37 = null;
        shapeList0.setShape(0, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        int int27 = shapeList25.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        java.lang.Object obj30 = shapeList28.clone();
        int int31 = shapeList28.size();
        java.lang.Object obj32 = shapeList28.clone();
        boolean boolean33 = shapeList25.equals((java.lang.Object) shapeList28);
        java.awt.Shape shape35 = shapeList25.getShape((int) (short) 0);
        java.awt.Shape shape37 = shapeList25.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        java.awt.Shape shape41 = shapeList38.getShape(0);
        boolean boolean43 = shapeList38.equals((java.lang.Object) ' ');
        java.awt.Shape shape45 = shapeList38.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        int int47 = shapeList46.size();
        java.awt.Shape shape49 = shapeList46.getShape(0);
        shapeList46.clear();
        int int51 = shapeList46.size();
        java.lang.Class<?> wildcardClass52 = shapeList46.getClass();
        boolean boolean53 = shapeList38.equals((java.lang.Object) wildcardClass52);
        java.lang.Object obj54 = shapeList38.clone();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        int int56 = shapeList55.size();
        java.awt.Shape shape58 = shapeList55.getShape(0);
        boolean boolean60 = shapeList55.equals((java.lang.Object) ' ');
        shapeList55.clear();
        int int62 = shapeList55.size();
        shapeList55.clear();
        org.jfree.chart.util.ShapeList shapeList64 = new org.jfree.chart.util.ShapeList();
        boolean boolean66 = shapeList64.equals((java.lang.Object) 100);
        int int67 = shapeList64.size();
        boolean boolean69 = shapeList64.equals((java.lang.Object) (byte) 0);
        boolean boolean71 = shapeList64.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape73 = shapeList64.getShape(0);
        shapeList64.clear();
        boolean boolean75 = shapeList55.equals((java.lang.Object) shapeList64);
        shapeList55.clear();
        java.lang.Object obj77 = shapeList55.clone();
        boolean boolean78 = shapeList38.equals((java.lang.Object) shapeList55);
        boolean boolean79 = shapeList25.equals((java.lang.Object) boolean78);
        boolean boolean80 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape82 = null;
        shapeList0.setShape((int) '4', shape82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (short) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        java.awt.Shape shape40 = shapeList0.getShape(34);
        java.awt.Shape shape42 = null;
        shapeList0.setShape(2, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        java.awt.Shape shape59 = shapeList0.getShape(8);
        java.lang.Object obj60 = shapeList0.clone();
        java.awt.Shape shape62 = null;
        shapeList0.setShape((int) (byte) 10, shape62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        java.awt.Shape shape50 = null;
        shapeList43.setShape((int) (short) 1, shape50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList43", shapeList0.equals(shapeList43) ? shapeList0.hashCode() == shapeList43.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        int int44 = shapeList15.size();
        java.awt.Shape shape46 = null;
        shapeList15.setShape((int) (byte) 10, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (short) 10, shape7);
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        int int13 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.lang.Object obj16 = shapeList14.clone();
        int int17 = shapeList14.size();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean19 = shapeList11.equals((java.lang.Object) shapeList14);
        java.lang.Object obj20 = shapeList14.clone();
        java.awt.Shape shape22 = shapeList14.getShape(10);
        java.awt.Shape shape24 = shapeList14.getShape((int) (byte) 1);
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        boolean boolean31 = shapeList26.equals((java.lang.Object) ' ');
        shapeList26.clear();
        int int33 = shapeList26.size();
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) 100);
        int int38 = shapeList35.size();
        boolean boolean40 = shapeList35.equals((java.lang.Object) (byte) 0);
        boolean boolean42 = shapeList35.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape44 = shapeList35.getShape(0);
        shapeList35.clear();
        boolean boolean46 = shapeList26.equals((java.lang.Object) shapeList35);
        java.lang.Object obj47 = shapeList26.clone();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj49 = shapeList48.clone();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        boolean boolean51 = shapeList26.equals((java.lang.Object) wildcardClass50);
        int int52 = shapeList26.size();
        java.lang.Object obj53 = shapeList26.clone();
        boolean boolean54 = shapeList14.equals((java.lang.Object) shapeList26);
        shapeList26.clear();
        boolean boolean56 = shapeList0.equals((java.lang.Object) shapeList26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        int int16 = shapeList0.size();
        int int17 = shapeList0.size();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(11, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        java.awt.Shape shape26 = null;
        shapeList10.setShape(34, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        shapeList22.clear();
        boolean boolean30 = shapeList15.equals((java.lang.Object) shapeList22);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.lang.Object obj32 = shapeList0.clone();
        int int33 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        int int36 = shapeList34.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        java.lang.Object obj39 = shapeList37.clone();
        int int40 = shapeList37.size();
        java.lang.Object obj41 = shapeList37.clone();
        boolean boolean42 = shapeList34.equals((java.lang.Object) shapeList37);
        java.awt.Shape shape44 = shapeList34.getShape((int) (short) 0);
        shapeList34.clear();
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList34);
        shapeList34.clear();
        int int48 = shapeList34.size();
        java.awt.Shape shape50 = null;
        shapeList34.setShape(53, shape50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        boolean boolean22 = shapeList15.equals((java.lang.Object) (short) 100);
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        java.lang.Object obj26 = shapeList24.clone();
        boolean boolean27 = shapeList15.equals((java.lang.Object) shapeList24);
        java.lang.Object obj28 = shapeList15.clone();
        java.lang.Object obj29 = shapeList15.clone();
        int int30 = shapeList15.size();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        int int16 = shapeList12.size();
        java.awt.Shape shape18 = shapeList12.getShape((int) 'a');
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        boolean boolean25 = shapeList20.equals((java.lang.Object) ' ');
        shapeList20.clear();
        int int27 = shapeList20.size();
        shapeList20.clear();
        java.awt.Shape shape30 = shapeList20.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        int int32 = shapeList31.size();
        java.awt.Shape shape34 = shapeList31.getShape(0);
        shapeList31.clear();
        shapeList31.clear();
        java.awt.Shape shape38 = shapeList31.getShape((-1));
        java.awt.Shape shape40 = shapeList31.getShape((int) (short) 100);
        boolean boolean41 = shapeList20.equals((java.lang.Object) shapeList31);
        boolean boolean42 = shapeList12.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape44 = shapeList12.getShape((int) ' ');
        boolean boolean45 = shapeList0.equals((java.lang.Object) shape44);
        java.awt.Shape shape47 = null;
        shapeList0.setShape(0, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(98, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        shapeList10.clear();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape((-1));
        shapeList10.clear();
        shapeList10.clear();
        shapeList10.clear();
        boolean boolean21 = shapeList8.equals((java.lang.Object) shapeList10);
        java.lang.Class<?> wildcardClass22 = shapeList10.getClass();
        boolean boolean23 = shapeList0.equals((java.lang.Object) wildcardClass22);
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) (byte) 10, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape23 = shapeList16.getShape((int) 'a');
        java.lang.Object obj24 = shapeList16.clone();
        java.awt.Shape shape26 = shapeList16.getShape(8);
        java.awt.Shape shape28 = shapeList16.getShape(2);
        boolean boolean29 = shapeList0.equals((java.lang.Object) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape21 = shapeList14.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList14.getShape((-1));
        shapeList14.clear();
        shapeList14.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(33, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList12);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        int int29 = shapeList27.size();
        int int30 = shapeList27.size();
        java.lang.Object obj31 = shapeList27.clone();
        java.lang.Object obj32 = shapeList27.clone();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        shapeList33.clear();
        int int35 = shapeList33.size();
        boolean boolean36 = shapeList27.equals((java.lang.Object) shapeList33);
        boolean boolean37 = shapeList0.equals((java.lang.Object) boolean36);
        java.lang.Object obj38 = shapeList0.clone();
        java.awt.Shape shape40 = null;
        shapeList0.setShape((int) (byte) 10, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(53, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(98);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        shapeList7.clear();
        java.awt.Shape shape18 = null;
        shapeList7.setShape((int) '4', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(34, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        java.awt.Shape shape33 = shapeList22.getShape((int) '#');
        java.lang.Object obj34 = shapeList22.clone();
        int int35 = shapeList22.size();
        boolean boolean36 = shapeList9.equals((java.lang.Object) int35);
        java.awt.Shape shape38 = null;
        shapeList9.setShape((int) (byte) 10, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj10 = shapeList7.clone();
        int int11 = shapeList7.size();
        int int12 = shapeList7.size();
        boolean boolean13 = shapeList0.equals((java.lang.Object) int12);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(9, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        boolean boolean32 = shapeList27.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.lang.Object obj35 = shapeList33.clone();
        int int36 = shapeList33.size();
        java.lang.Object obj37 = shapeList33.clone();
        boolean boolean38 = shapeList27.equals((java.lang.Object) shapeList33);
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape41 = shapeList0.getShape(9);
        int int42 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.awt.Shape shape46 = shapeList43.getShape(0);
        boolean boolean48 = shapeList43.equals((java.lang.Object) ' ');
        shapeList43.clear();
        int int50 = shapeList43.size();
        shapeList43.clear();
        java.awt.Shape shape53 = null;
        shapeList43.setShape((int) 'a', shape53);
        java.lang.Object obj55 = shapeList43.clone();
        java.lang.Object obj56 = shapeList43.clone();
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList43", shapeList0.equals(shapeList43) ? shapeList0.hashCode() == shapeList43.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        boolean boolean20 = shapeList15.equals((java.lang.Object) (byte) 0);
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        boolean boolean27 = shapeList22.equals((java.lang.Object) ' ');
        shapeList22.clear();
        shapeList22.clear();
        boolean boolean30 = shapeList15.equals((java.lang.Object) shapeList22);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.lang.Object obj32 = shapeList0.clone();
        int int33 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        int int36 = shapeList34.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        java.lang.Object obj39 = shapeList37.clone();
        int int40 = shapeList37.size();
        java.lang.Object obj41 = shapeList37.clone();
        boolean boolean42 = shapeList34.equals((java.lang.Object) shapeList37);
        java.awt.Shape shape44 = shapeList34.getShape((int) (short) 0);
        shapeList34.clear();
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList34);
        java.awt.Shape shape48 = null;
        shapeList34.setShape(101, shape48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) 100);
        java.awt.Shape shape8 = shapeList4.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean13 = shapeList4.equals((java.lang.Object) int12);
        boolean boolean14 = shapeList0.equals((java.lang.Object) boolean13);
        java.lang.Object obj15 = shapeList0.clone();
        int int16 = shapeList0.size();
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape(0);
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) (byte) 10, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.awt.Shape shape39 = shapeList36.getShape(0);
        boolean boolean41 = shapeList36.equals((java.lang.Object) ' ');
        java.awt.Shape shape43 = shapeList36.getShape((-1));
        int int44 = shapeList36.size();
        java.awt.Shape shape46 = shapeList36.getShape((-1));
        java.awt.Shape shape48 = null;
        shapeList36.setShape((int) (short) 1, shape48);
        java.awt.Shape shape51 = shapeList36.getShape((-1));
        java.lang.Object obj52 = shapeList36.clone();
        boolean boolean53 = shapeList6.equals((java.lang.Object) shapeList36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        java.awt.Shape shape42 = null;
        shapeList0.setShape((int) (short) 10, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        int int27 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape30 = null;
        shapeList0.setShape(98, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        java.lang.Object obj15 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape27 = shapeList16.getShape((int) '#');
        java.awt.Shape shape29 = null;
        shapeList16.setShape(1, shape29);
        java.awt.Shape shape32 = null;
        shapeList16.setShape(34, shape32);
        java.lang.Object obj34 = shapeList16.clone();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        boolean boolean17 = shapeList12.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) 1);
        java.lang.Object obj20 = shapeList12.clone();
        boolean boolean21 = shapeList0.equals(obj20);
        java.awt.Shape shape23 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(34, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(9, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        java.awt.Shape shape59 = shapeList0.getShape(8);
        java.lang.Object obj60 = shapeList0.clone();
        java.awt.Shape shape62 = null;
        shapeList0.setShape(53, shape62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        int int14 = shapeList8.size();
        java.awt.Shape shape16 = null;
        shapeList8.setShape((int) (byte) 10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        int int11 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((int) 'a');
        java.lang.Object obj21 = shapeList13.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape24 = null;
        shapeList13.setShape((int) (byte) 1, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.awt.Shape shape6 = shapeList3.getShape(0);
        boolean boolean8 = shapeList3.equals((java.lang.Object) ' ');
        shapeList3.clear();
        int int10 = shapeList3.size();
        shapeList3.clear();
        java.awt.Shape shape13 = shapeList3.getShape((-1));
        java.awt.Shape shape15 = shapeList3.getShape((-1));
        shapeList3.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape19 = shapeList3.getShape((int) (byte) 1);
        int int20 = shapeList3.size();
        java.awt.Shape shape22 = shapeList3.getShape(1);
        java.awt.Shape shape24 = null;
        shapeList3.setShape(34, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
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
        shapeList6.clear();
        java.awt.Shape shape14 = null;
        shapeList6.setShape((int) '#', shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape(100);
        boolean boolean21 = shapeList7.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape23 = null;
        shapeList7.setShape(101, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        shapeList6.clear();
        int int11 = shapeList6.size();
        java.awt.Shape shape13 = null;
        shapeList6.setShape(33, shape13);
        int int15 = shapeList6.size();
        int int16 = shapeList6.size();
        boolean boolean17 = shapeList0.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        boolean boolean5 = shapeList0.equals((java.lang.Object) '#');
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(34, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        shapeList23.clear();
        shapeList23.clear();
        java.awt.Shape shape30 = shapeList23.getShape((int) 'a');
        java.lang.Object obj31 = shapeList23.clone();
        shapeList23.clear();
        java.lang.Object obj33 = shapeList23.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = shapeList34.clone();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        boolean boolean43 = shapeList41.equals((java.lang.Object) 100);
        boolean boolean44 = shapeList34.equals((java.lang.Object) shapeList41);
        java.awt.Shape shape46 = shapeList41.getShape((int) (short) -1);
        boolean boolean47 = shapeList23.equals((java.lang.Object) shape46);
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        int int49 = shapeList48.size();
        int int50 = shapeList48.size();
        int int51 = shapeList48.size();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        shapeList52.clear();
        java.lang.Object obj55 = shapeList52.clone();
        boolean boolean56 = shapeList48.equals((java.lang.Object) shapeList52);
        java.lang.Object obj57 = shapeList48.clone();
        boolean boolean58 = shapeList23.equals(obj57);
        shapeList23.clear();
        boolean boolean60 = shapeList0.equals((java.lang.Object) shapeList23);
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList62 = new org.jfree.chart.util.ShapeList();
        boolean boolean64 = shapeList62.equals((java.lang.Object) 100);
        int int65 = shapeList62.size();
        boolean boolean67 = shapeList62.equals((java.lang.Object) (byte) 0);
        boolean boolean69 = shapeList62.equals((java.lang.Object) (short) 100);
        shapeList62.clear();
        org.jfree.chart.util.ShapeList shapeList71 = new org.jfree.chart.util.ShapeList();
        int int72 = shapeList71.size();
        java.lang.Object obj73 = shapeList71.clone();
        boolean boolean74 = shapeList62.equals((java.lang.Object) shapeList71);
        org.jfree.chart.util.ShapeList shapeList75 = new org.jfree.chart.util.ShapeList();
        int int76 = shapeList75.size();
        boolean boolean77 = shapeList62.equals((java.lang.Object) int76);
        int int78 = shapeList62.size();
        java.awt.Shape shape80 = shapeList62.getShape((int) '#');
        java.awt.Shape shape82 = shapeList62.getShape(33);
        java.lang.Object obj83 = shapeList62.clone();
        boolean boolean84 = shapeList23.equals(obj83);
        java.lang.Object obj85 = shapeList23.clone();
        java.awt.Shape shape87 = null;
        shapeList23.setShape(9, shape87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(53, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape(100);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape((int) (byte) 100);
        shapeList22.clear();
        int int27 = shapeList22.size();
        int int28 = shapeList22.size();
        int int29 = shapeList22.size();
        shapeList22.clear();
        int int31 = shapeList22.size();
        shapeList22.clear();
        int int33 = shapeList22.size();
        java.lang.Class<?> wildcardClass34 = shapeList22.getClass();
        boolean boolean35 = shapeList12.equals((java.lang.Object) shapeList22);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape38 = null;
        shapeList12.setShape((int) (short) 0, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        int int27 = shapeList25.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        java.lang.Object obj30 = shapeList28.clone();
        int int31 = shapeList28.size();
        java.lang.Object obj32 = shapeList28.clone();
        boolean boolean33 = shapeList25.equals((java.lang.Object) shapeList28);
        java.awt.Shape shape35 = shapeList25.getShape((int) (short) 0);
        java.awt.Shape shape37 = shapeList25.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        java.awt.Shape shape41 = shapeList38.getShape(0);
        boolean boolean43 = shapeList38.equals((java.lang.Object) ' ');
        java.awt.Shape shape45 = shapeList38.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        int int47 = shapeList46.size();
        java.awt.Shape shape49 = shapeList46.getShape(0);
        shapeList46.clear();
        int int51 = shapeList46.size();
        java.lang.Class<?> wildcardClass52 = shapeList46.getClass();
        boolean boolean53 = shapeList38.equals((java.lang.Object) wildcardClass52);
        java.lang.Object obj54 = shapeList38.clone();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        int int56 = shapeList55.size();
        java.awt.Shape shape58 = shapeList55.getShape(0);
        boolean boolean60 = shapeList55.equals((java.lang.Object) ' ');
        shapeList55.clear();
        int int62 = shapeList55.size();
        shapeList55.clear();
        org.jfree.chart.util.ShapeList shapeList64 = new org.jfree.chart.util.ShapeList();
        boolean boolean66 = shapeList64.equals((java.lang.Object) 100);
        int int67 = shapeList64.size();
        boolean boolean69 = shapeList64.equals((java.lang.Object) (byte) 0);
        boolean boolean71 = shapeList64.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape73 = shapeList64.getShape(0);
        shapeList64.clear();
        boolean boolean75 = shapeList55.equals((java.lang.Object) shapeList64);
        shapeList55.clear();
        java.lang.Object obj77 = shapeList55.clone();
        boolean boolean78 = shapeList38.equals((java.lang.Object) shapeList55);
        boolean boolean79 = shapeList25.equals((java.lang.Object) boolean78);
        boolean boolean80 = shapeList0.equals((java.lang.Object) shapeList25);
        java.lang.Object obj81 = shapeList25.clone();
        java.awt.Shape shape83 = null;
        shapeList25.setShape(1, shape83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        java.awt.Shape shape24 = shapeList0.getShape(9);
        java.awt.Shape shape26 = null;
        shapeList0.setShape(36, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        shapeList7.clear();
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape17 = null;
        shapeList7.setShape((int) ' ', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        java.lang.Object obj18 = shapeList16.clone();
        java.awt.Shape shape20 = shapeList16.getShape(0);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        java.awt.Shape shape25 = null;
        shapeList11.setShape((int) (short) 0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = null;
        boolean boolean13 = shapeList0.equals(obj12);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        shapeList23.clear();
        shapeList23.clear();
        java.awt.Shape shape30 = shapeList23.getShape((int) 'a');
        java.lang.Object obj31 = shapeList23.clone();
        shapeList23.clear();
        java.lang.Object obj33 = shapeList23.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean39 = shapeList34.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = shapeList34.clone();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        boolean boolean43 = shapeList41.equals((java.lang.Object) 100);
        boolean boolean44 = shapeList34.equals((java.lang.Object) shapeList41);
        java.awt.Shape shape46 = shapeList41.getShape((int) (short) -1);
        boolean boolean47 = shapeList23.equals((java.lang.Object) shape46);
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        int int49 = shapeList48.size();
        int int50 = shapeList48.size();
        int int51 = shapeList48.size();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        shapeList52.clear();
        java.lang.Object obj55 = shapeList52.clone();
        boolean boolean56 = shapeList48.equals((java.lang.Object) shapeList52);
        java.lang.Object obj57 = shapeList48.clone();
        boolean boolean58 = shapeList23.equals(obj57);
        shapeList23.clear();
        boolean boolean60 = shapeList0.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape62 = null;
        shapeList23.setShape(98, shape62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape6 = shapeList0.getShape(8);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape(100);
        int int18 = shapeList10.size();
        int int19 = shapeList10.size();
        java.awt.Shape shape21 = shapeList10.getShape(53);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = shapeList22.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        boolean boolean32 = shapeList22.equals((java.lang.Object) shapeList29);
        java.awt.Shape shape34 = shapeList29.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) 100);
        int int38 = shapeList35.size();
        boolean boolean40 = shapeList35.equals((java.lang.Object) (byte) 0);
        boolean boolean42 = shapeList35.equals((java.lang.Object) (short) 100);
        shapeList35.clear();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.lang.Object obj46 = shapeList44.clone();
        boolean boolean47 = shapeList35.equals((java.lang.Object) shapeList44);
        java.awt.Shape shape49 = shapeList35.getShape(1);
        java.lang.Object obj50 = shapeList35.clone();
        boolean boolean51 = shapeList29.equals(obj50);
        java.lang.Object obj52 = shapeList29.clone();
        boolean boolean53 = shapeList10.equals(obj52);
        boolean boolean54 = shapeList0.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        java.awt.Shape shape43 = null;
        shapeList0.setShape(53, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        java.awt.Shape shape17 = shapeList13.getShape((int) '#');
        java.awt.Shape shape19 = shapeList13.getShape((int) '4');
        java.awt.Shape shape21 = null;
        shapeList13.setShape((int) (byte) 0, shape21);
        java.lang.Object obj23 = shapeList13.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(101, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(34, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        java.lang.Object obj13 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape16 = null;
        shapeList7.setShape((int) (short) 0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }
}

