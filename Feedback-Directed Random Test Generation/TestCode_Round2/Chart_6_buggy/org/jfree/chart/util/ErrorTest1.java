package org.jfree.chart.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape(2, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape((int) (byte) 100);
        shapeList10.clear();
        int int15 = shapeList10.size();
        int int16 = shapeList10.size();
        int int17 = shapeList10.size();
        shapeList10.clear();
        int int19 = shapeList10.size();
        shapeList10.clear();
        int int21 = shapeList10.size();
        java.lang.Class<?> wildcardClass22 = shapeList10.getClass();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape25 = shapeList0.getShape(98);
        java.awt.Shape shape27 = null;
        shapeList0.setShape(0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        java.awt.Shape shape13 = shapeList0.getShape(2);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        boolean boolean19 = shapeList14.equals((java.lang.Object) ' ');
        java.awt.Shape shape21 = shapeList14.getShape((-1));
        shapeList14.clear();
        shapeList14.clear();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        int int27 = shapeList25.size();
        int int28 = shapeList25.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        shapeList29.clear();
        java.lang.Object obj32 = shapeList29.clone();
        boolean boolean33 = shapeList25.equals((java.lang.Object) shapeList29);
        int int34 = shapeList25.size();
        java.awt.Shape shape36 = shapeList25.getShape(9);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) 100);
        int int40 = shapeList37.size();
        boolean boolean42 = shapeList37.equals((java.lang.Object) (byte) 0);
        boolean boolean44 = shapeList37.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape46 = shapeList37.getShape(0);
        java.lang.Object obj47 = shapeList37.clone();
        shapeList37.clear();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        java.awt.Shape shape52 = shapeList49.getShape(0);
        shapeList49.clear();
        shapeList49.clear();
        java.awt.Shape shape56 = shapeList49.getShape((-1));
        shapeList49.clear();
        shapeList49.clear();
        java.awt.Shape shape60 = shapeList49.getShape(8);
        java.lang.Object obj61 = shapeList49.clone();
        boolean boolean62 = shapeList37.equals((java.lang.Object) shapeList49);
        boolean boolean63 = shapeList25.equals((java.lang.Object) shapeList49);
        int int64 = shapeList25.size();
        boolean boolean65 = shapeList14.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape67 = null;
        shapeList25.setShape(11, shape67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        int int10 = shapeList7.size();
        boolean boolean12 = shapeList7.equals((java.lang.Object) (byte) 0);
        boolean boolean14 = shapeList7.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape16 = shapeList7.getShape(0);
        java.awt.Shape shape18 = null;
        shapeList7.setShape(100, shape18);
        java.awt.Shape shape21 = shapeList7.getShape(1);
        boolean boolean22 = shapeList0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        java.awt.Shape shape29 = shapeList24.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        java.awt.Shape shape34 = shapeList30.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) 100);
        int int38 = shapeList35.size();
        boolean boolean39 = shapeList30.equals((java.lang.Object) int38);
        java.awt.Shape shape41 = shapeList30.getShape(0);
        boolean boolean42 = shapeList24.equals((java.lang.Object) 0);
        shapeList24.clear();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        int int46 = shapeList44.size();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        int int48 = shapeList47.size();
        java.lang.Object obj49 = shapeList47.clone();
        int int50 = shapeList47.size();
        java.lang.Object obj51 = shapeList47.clone();
        boolean boolean52 = shapeList44.equals((java.lang.Object) shapeList47);
        boolean boolean53 = shapeList24.equals((java.lang.Object) shapeList47);
        boolean boolean54 = shapeList0.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape56 = null;
        shapeList0.setShape((int) (byte) 10, shape56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape(53);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) '4', shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean34 = shapeList25.equals((java.lang.Object) int33);
        java.awt.Shape shape36 = shapeList25.getShape(0);
        java.awt.Shape shape38 = shapeList25.getShape(0);
        int int39 = shapeList25.size();
        int int40 = shapeList25.size();
        boolean boolean41 = shapeList0.equals((java.lang.Object) int40);
        java.awt.Shape shape43 = null;
        shapeList0.setShape((int) '#', shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        boolean boolean16 = shapeList11.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList11.equals((java.lang.Object) shapeList17);
        java.lang.Object obj23 = null;
        boolean boolean24 = shapeList17.equals(obj23);
        boolean boolean25 = shapeList0.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        java.lang.Object obj22 = shapeList0.clone();
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (short) 100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        java.lang.Object obj29 = shapeList12.clone();
        java.awt.Shape shape31 = shapeList12.getShape(101);
        java.awt.Shape shape33 = null;
        shapeList12.setShape(36, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) (short) 0);
        java.lang.Object obj8 = shapeList5.clone();
        int int9 = shapeList5.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape(0);
        shapeList10.clear();
        shapeList10.clear();
        int int16 = shapeList10.size();
        int int17 = shapeList10.size();
        shapeList10.clear();
        boolean boolean19 = shapeList5.equals((java.lang.Object) shapeList10);
        shapeList5.clear();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape23 = shapeList5.getShape(8);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        shapeList24.clear();
        shapeList24.clear();
        java.awt.Shape shape31 = shapeList24.getShape(100);
        int int32 = shapeList24.size();
        java.awt.Shape shape34 = null;
        shapeList24.setShape((int) ' ', shape34);
        java.lang.Object obj36 = shapeList24.clone();
        boolean boolean37 = shapeList5.equals(obj36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList24", shapeList0.equals(shapeList24) ? shapeList0.hashCode() == shapeList24.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(100, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        shapeList16.clear();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.lang.Object obj28 = shapeList26.clone();
        int int29 = shapeList26.size();
        java.lang.Object obj30 = shapeList26.clone();
        shapeList26.clear();
        java.awt.Shape shape33 = shapeList26.getShape((int) (short) 100);
        boolean boolean35 = shapeList26.equals((java.lang.Object) 10L);
        java.awt.Shape shape37 = shapeList26.getShape((int) (byte) 1);
        boolean boolean38 = shapeList16.equals((java.lang.Object) (byte) 1);
        shapeList16.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape42 = null;
        shapeList0.setShape((int) (byte) 1, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        java.lang.Object obj41 = shapeList15.clone();
        boolean boolean42 = shapeList0.equals(obj41);
        java.awt.Shape shape44 = null;
        shapeList0.setShape(33, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        shapeList0.setShape((int) ' ', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        java.lang.Object obj39 = shapeList0.clone();
        shapeList0.clear();
        int int41 = shapeList0.size();
        java.lang.Object obj42 = shapeList0.clone();
        java.awt.Shape shape44 = null;
        shapeList0.setShape((int) ' ', shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(98, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        shapeList29.setShape(53, shape89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.awt.Shape shape45 = shapeList42.getShape(0);
        shapeList42.clear();
        shapeList42.clear();
        java.awt.Shape shape49 = shapeList42.getShape((int) 'a');
        java.lang.Object obj50 = shapeList42.clone();
        java.awt.Shape shape52 = shapeList42.getShape((int) '4');
        shapeList42.clear();
        boolean boolean54 = shapeList32.equals((java.lang.Object) shapeList42);
        java.lang.Object obj55 = shapeList42.clone();
        java.awt.Shape shape57 = null;
        shapeList42.setShape(2, shape57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList42", shapeList0.equals(shapeList42) ? shapeList0.hashCode() == shapeList42.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        java.awt.Shape shape13 = shapeList10.getShape(0);
        shapeList10.clear();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape((-1));
        shapeList10.clear();
        java.awt.Shape shape20 = shapeList10.getShape(1);
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 0);
        int int25 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        int int28 = shapeList26.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.lang.Object obj31 = shapeList29.clone();
        int int32 = shapeList29.size();
        java.lang.Object obj33 = shapeList29.clone();
        boolean boolean34 = shapeList26.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        java.lang.Object obj37 = shapeList35.clone();
        int int38 = shapeList35.size();
        shapeList35.clear();
        boolean boolean40 = shapeList26.equals((java.lang.Object) shapeList35);
        boolean boolean41 = shapeList22.equals((java.lang.Object) shapeList26);
        boolean boolean42 = shapeList10.equals((java.lang.Object) shapeList26);
        boolean boolean43 = shapeList0.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape45 = shapeList0.getShape((-1));
        java.awt.Shape shape47 = null;
        shapeList0.setShape(33, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        shapeList9.clear();
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape17 = shapeList9.getShape((int) '4');
        shapeList9.clear();
        java.lang.Class<?> wildcardClass19 = shapeList9.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape22 = null;
        shapeList9.setShape(8, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        java.lang.Object obj12 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        boolean boolean23 = shapeList13.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape25 = shapeList13.getShape((int) (short) 1);
        java.awt.Shape shape27 = shapeList13.getShape(1);
        boolean boolean28 = shapeList0.equals((java.lang.Object) shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        int int40 = shapeList38.size();
        int int41 = shapeList38.size();
        int int42 = shapeList38.size();
        shapeList38.clear();
        shapeList38.clear();
        int int45 = shapeList38.size();
        java.awt.Shape shape47 = null;
        shapeList38.setShape((int) '#', shape47);
        boolean boolean49 = shapeList0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList38", shapeList0.equals(shapeList38) ? shapeList0.hashCode() == shapeList38.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        shapeList0.setShape(33, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        java.awt.Shape shape28 = null;
        shapeList12.setShape(2, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        shapeList0.clear();
        java.awt.Shape shape14 = shapeList0.getShape(11);
        java.awt.Shape shape16 = shapeList0.getShape(0);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (short) 100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        shapeList20.setShape((int) '#', shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (byte) 0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        shapeList0.setShape((int) '#', shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        java.awt.Shape shape18 = shapeList0.getShape(100);
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(34, shape21);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj19", shapeList0.equals(obj19) ? shapeList0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        shapeList0.setShape(10, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        java.lang.Object obj24 = shapeList0.clone();
        java.awt.Shape shape26 = shapeList0.getShape((int) (byte) 10);
        shapeList0.clear();
        java.awt.Shape shape29 = null;
        shapeList0.setShape(100, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        shapeList5.clear();
        java.lang.Class<?> wildcardClass12 = shapeList5.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape16 = shapeList9.getShape((-1));
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape20 = shapeList9.getShape(8);
        java.awt.Shape shape22 = shapeList9.getShape(1);
        java.awt.Shape shape24 = null;
        shapeList9.setShape((int) '4', shape24);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        shapeList16.clear();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.lang.Object obj28 = shapeList26.clone();
        int int29 = shapeList26.size();
        java.lang.Object obj30 = shapeList26.clone();
        shapeList26.clear();
        java.awt.Shape shape33 = shapeList26.getShape((int) (short) 100);
        boolean boolean35 = shapeList26.equals((java.lang.Object) 10L);
        java.awt.Shape shape37 = shapeList26.getShape((int) (byte) 1);
        boolean boolean38 = shapeList16.equals((java.lang.Object) (byte) 1);
        shapeList16.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape42 = null;
        shapeList16.setShape((int) (byte) 0, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        shapeList6.setShape(36, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(98, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        java.awt.Shape shape23 = shapeList14.getShape((int) '4');
        int int24 = shapeList14.size();
        int int25 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        int int28 = shapeList26.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.lang.Object obj31 = shapeList29.clone();
        int int32 = shapeList29.size();
        java.lang.Object obj33 = shapeList29.clone();
        boolean boolean34 = shapeList26.equals((java.lang.Object) shapeList29);
        java.awt.Shape shape36 = shapeList29.getShape(0);
        boolean boolean37 = shapeList14.equals((java.lang.Object) shapeList29);
        boolean boolean38 = shapeList3.equals((java.lang.Object) boolean37);
        shapeList3.clear();
        java.awt.Shape shape41 = null;
        shapeList3.setShape((int) (short) 0, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) '4', shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) 100);
        int int8 = shapeList5.size();
        boolean boolean9 = shapeList0.equals((java.lang.Object) int8);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
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
        java.awt.Shape shape13 = shapeList11.getShape((int) (short) 1);
        java.awt.Shape shape15 = null;
        shapeList11.setShape(33, shape15);
        boolean boolean17 = shapeList0.equals((java.lang.Object) 33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        java.awt.Shape shape17 = shapeList14.getShape((int) (byte) 100);
        boolean boolean19 = shapeList14.equals((java.lang.Object) '#');
        int int20 = shapeList14.size();
        java.awt.Shape shape22 = shapeList14.getShape(0);
        java.lang.Object obj23 = shapeList14.clone();
        java.awt.Shape shape25 = shapeList14.getShape((int) (byte) -1);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList14);
        java.lang.Object obj27 = shapeList14.clone();
        java.awt.Shape shape29 = null;
        shapeList14.setShape(10, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        java.lang.Object obj41 = shapeList15.clone();
        boolean boolean42 = shapeList0.equals(obj41);
        java.awt.Shape shape44 = null;
        shapeList0.setShape(0, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        java.awt.Shape shape16 = shapeList0.getShape((-1));
        java.lang.Object obj17 = shapeList0.clone();
        int int18 = shapeList0.size();
        java.awt.Shape shape20 = null;
        shapeList0.setShape(3, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        int int59 = shapeList0.size();
        java.lang.Object obj60 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList61 = new org.jfree.chart.util.ShapeList();
        boolean boolean63 = shapeList61.equals((java.lang.Object) 100);
        int int64 = shapeList61.size();
        boolean boolean66 = shapeList61.equals((java.lang.Object) (byte) 0);
        boolean boolean68 = shapeList61.equals((java.lang.Object) (short) 100);
        shapeList61.clear();
        shapeList61.clear();
        java.awt.Shape shape72 = shapeList61.getShape((int) '#');
        java.awt.Shape shape74 = null;
        shapeList61.setShape(1, shape74);
        java.awt.Shape shape77 = null;
        shapeList61.setShape(34, shape77);
        java.lang.Object obj79 = shapeList61.clone();
        boolean boolean80 = shapeList0.equals((java.lang.Object) shapeList61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList61", shapeList0.equals(shapeList61) ? shapeList0.hashCode() == shapeList61.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        java.awt.Shape shape40 = shapeList27.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        boolean boolean43 = shapeList41.equals((java.lang.Object) 100);
        int int44 = shapeList41.size();
        shapeList41.clear();
        shapeList41.clear();
        java.awt.Shape shape48 = shapeList41.getShape(100);
        int int49 = shapeList41.size();
        java.awt.Shape shape51 = null;
        shapeList41.setShape((int) ' ', shape51);
        java.lang.Object obj53 = shapeList41.clone();
        boolean boolean54 = shapeList27.equals(obj53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList41", shapeList0.equals(shapeList41) ? shapeList0.hashCode() == shapeList41.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((-1));
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape23 = shapeList12.getShape(8);
        java.lang.Object obj24 = shapeList12.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList12);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        int int29 = shapeList26.size();
        boolean boolean31 = shapeList26.equals((java.lang.Object) (byte) 0);
        boolean boolean33 = shapeList26.equals((java.lang.Object) (short) 100);
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        java.lang.Object obj37 = shapeList35.clone();
        boolean boolean38 = shapeList26.equals((java.lang.Object) shapeList35);
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        boolean boolean41 = shapeList26.equals((java.lang.Object) int40);
        shapeList26.clear();
        int int43 = shapeList26.size();
        shapeList26.clear();
        boolean boolean45 = shapeList12.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape47 = null;
        shapeList26.setShape(33, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        java.lang.Object obj39 = shapeList0.clone();
        java.awt.Shape shape41 = null;
        shapeList0.setShape(0, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        java.awt.Shape shape38 = null;
        shapeList0.setShape(36, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) 100);
        int int16 = shapeList13.size();
        boolean boolean18 = shapeList13.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = shapeList13.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape22 = shapeList13.getShape(0);
        java.awt.Shape shape24 = shapeList13.getShape((int) (byte) 1);
        java.awt.Shape shape26 = null;
        shapeList13.setShape((int) (byte) 100, shape26);
        boolean boolean28 = shapeList0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
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
        shapeList0.setShape((int) (short) 100, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        shapeList30.setShape(36, shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(36, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        shapeList7.setShape((int) (byte) 100, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) (short) 0, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape(53, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        int int13 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(33, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        boolean boolean22 = shapeList17.equals((java.lang.Object) ' ');
        shapeList17.clear();
        int int24 = shapeList17.size();
        shapeList17.clear();
        java.awt.Shape shape27 = shapeList17.getShape((-1));
        java.awt.Shape shape29 = shapeList17.getShape((-1));
        java.lang.Object obj30 = shapeList17.clone();
        boolean boolean31 = shapeList0.equals(obj30);
        shapeList0.clear();
        java.awt.Shape shape34 = null;
        shapeList0.setShape(36, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
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
        java.awt.Shape shape56 = shapeList29.getShape(1);
        java.lang.Object obj57 = shapeList29.clone();
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        int int59 = shapeList58.size();
        java.awt.Shape shape61 = shapeList58.getShape(0);
        shapeList58.clear();
        shapeList58.clear();
        java.awt.Shape shape65 = shapeList58.getShape((-1));
        java.awt.Shape shape67 = null;
        shapeList58.setShape(34, shape67);
        boolean boolean69 = shapeList29.equals((java.lang.Object) 34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList58", shapeList0.equals(shapeList58) ? shapeList0.hashCode() == shapeList58.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape(101, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        java.awt.Shape shape22 = null;
        shapeList4.setShape((int) 'a', shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (short) 100, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) '4', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape23 = shapeList16.getShape((int) 'a');
        java.lang.Object obj24 = shapeList16.clone();
        java.awt.Shape shape26 = shapeList16.getShape((int) '4');
        shapeList16.clear();
        int int28 = shapeList16.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        java.awt.Shape shape33 = shapeList29.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) 100);
        int int37 = shapeList34.size();
        boolean boolean38 = shapeList29.equals((java.lang.Object) int37);
        java.awt.Shape shape40 = shapeList29.getShape(0);
        java.awt.Shape shape42 = shapeList29.getShape(0);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        int int45 = shapeList43.size();
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        int int47 = shapeList46.size();
        java.lang.Object obj48 = shapeList46.clone();
        int int49 = shapeList46.size();
        java.lang.Object obj50 = shapeList46.clone();
        boolean boolean51 = shapeList43.equals((java.lang.Object) shapeList46);
        java.lang.Object obj52 = shapeList46.clone();
        boolean boolean53 = shapeList29.equals(obj52);
        shapeList29.clear();
        boolean boolean55 = shapeList16.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        int int57 = shapeList56.size();
        int int58 = shapeList56.size();
        int int59 = shapeList56.size();
        int int60 = shapeList56.size();
        shapeList56.clear();
        int int62 = shapeList56.size();
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        int int64 = shapeList63.size();
        java.lang.Object obj65 = shapeList63.clone();
        int int66 = shapeList63.size();
        java.lang.Object obj67 = shapeList63.clone();
        shapeList63.clear();
        java.awt.Shape shape70 = shapeList63.getShape(100);
        boolean boolean71 = shapeList56.equals((java.lang.Object) shapeList63);
        boolean boolean72 = shapeList16.equals((java.lang.Object) boolean71);
        java.lang.Object obj73 = shapeList16.clone();
        int int74 = shapeList16.size();
        boolean boolean75 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        shapeList5.clear();
        java.lang.Class<?> wildcardClass12 = shapeList5.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        java.awt.Shape shape43 = null;
        shapeList0.setShape((int) (byte) 100, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((-1));
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape23 = shapeList12.getShape(8);
        java.lang.Object obj24 = shapeList12.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) ' ', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 0, shape5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape14 = shapeList7.getShape((int) 'a');
        java.awt.Shape shape16 = shapeList7.getShape((-1));
        shapeList7.clear();
        java.awt.Shape shape19 = shapeList7.getShape((int) (short) 0);
        java.awt.Shape shape21 = null;
        shapeList7.setShape((int) '#', shape21);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        java.awt.Shape shape24 = shapeList0.getShape(0);
        java.awt.Shape shape26 = null;
        shapeList0.setShape(9, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = null;
        shapeList0.setShape(3, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(1, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        boolean boolean25 = shapeList20.equals((java.lang.Object) ' ');
        shapeList20.clear();
        int int27 = shapeList20.size();
        int int28 = shapeList20.size();
        shapeList20.clear();
        java.awt.Shape shape31 = shapeList20.getShape(0);
        int int32 = shapeList20.size();
        java.awt.Shape shape34 = null;
        shapeList20.setShape((int) (byte) 100, shape34);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        shapeList2.clear();
        java.awt.Shape shape17 = shapeList2.getShape((int) 'a');
        shapeList2.clear();
        java.awt.Shape shape20 = null;
        shapeList2.setShape((int) (byte) 1, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList2", shapeList0.equals(shapeList2) ? shapeList0.hashCode() == shapeList2.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
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
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(1, shape16);
        java.lang.Object obj18 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        java.awt.Shape shape17 = shapeList14.getShape((int) (byte) 100);
        boolean boolean19 = shapeList14.equals((java.lang.Object) '#');
        int int20 = shapeList14.size();
        java.awt.Shape shape22 = shapeList14.getShape(0);
        java.lang.Object obj23 = shapeList14.clone();
        java.awt.Shape shape25 = shapeList14.getShape((int) (byte) -1);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        boolean boolean32 = shapeList27.equals((java.lang.Object) ' ');
        shapeList27.clear();
        int int34 = shapeList27.size();
        int int35 = shapeList27.size();
        java.awt.Shape shape37 = shapeList27.getShape((int) '4');
        java.lang.Object obj38 = shapeList27.clone();
        boolean boolean39 = shapeList14.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape41 = null;
        shapeList14.setShape(8, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(34, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        shapeList5.clear();
        java.lang.Class<?> wildcardClass12 = shapeList5.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList5);
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        shapeList0.setShape((int) ' ', shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape23 = shapeList16.getShape(100);
        boolean boolean24 = shapeList8.equals((java.lang.Object) shape23);
        shapeList8.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape28 = null;
        shapeList8.setShape((int) (short) 0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (byte) 0, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(53, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((-1));
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape26 = shapeList15.getShape(8);
        java.awt.Shape shape28 = shapeList15.getShape((int) (short) -1);
        java.awt.Shape shape30 = null;
        shapeList15.setShape(100, shape30);
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
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
        java.lang.Object obj23 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape26 = shapeList0.getShape(2);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        int int33 = shapeList27.size();
        java.awt.Shape shape35 = shapeList27.getShape((-1));
        shapeList27.clear();
        int int37 = shapeList27.size();
        java.awt.Shape shape39 = null;
        shapeList27.setShape((int) (byte) 100, shape39);
        boolean boolean41 = shapeList0.equals((java.lang.Object) shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
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
        shapeList0.setShape((int) (byte) 100, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        java.lang.Object obj5 = shapeList3.clone();
        int int6 = shapeList3.size();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = shapeList3.getShape((int) (byte) 10);
        java.awt.Shape shape12 = null;
        shapeList3.setShape(53, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 10, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
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
        java.awt.Shape shape17 = shapeList7.getShape(100);
        java.awt.Shape shape19 = null;
        shapeList7.setShape((int) 'a', shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape61 = null;
        shapeList0.setShape(0, shape61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
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
        java.lang.Object obj13 = shapeList6.clone();
        java.awt.Shape shape15 = null;
        shapeList6.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
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
        int int24 = shapeList0.size();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) '4', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
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
        java.lang.Object obj27 = shapeList16.clone();
        java.lang.Object obj28 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.awt.Shape shape32 = shapeList29.getShape(0);
        boolean boolean34 = shapeList29.equals((java.lang.Object) ' ');
        shapeList29.clear();
        int int36 = shapeList29.size();
        shapeList29.clear();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        boolean boolean40 = shapeList38.equals((java.lang.Object) 100);
        int int41 = shapeList38.size();
        boolean boolean43 = shapeList38.equals((java.lang.Object) (byte) 0);
        boolean boolean45 = shapeList38.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape47 = shapeList38.getShape(0);
        shapeList38.clear();
        boolean boolean49 = shapeList29.equals((java.lang.Object) shapeList38);
        shapeList29.clear();
        java.lang.Object obj51 = shapeList29.clone();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        java.awt.Shape shape55 = shapeList52.getShape(0);
        shapeList52.clear();
        shapeList52.clear();
        java.awt.Shape shape59 = shapeList52.getShape((int) 'a');
        java.lang.Object obj60 = shapeList52.clone();
        shapeList52.clear();
        java.lang.Object obj62 = shapeList52.clone();
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        boolean boolean65 = shapeList63.equals((java.lang.Object) 100);
        int int66 = shapeList63.size();
        boolean boolean68 = shapeList63.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = shapeList63.clone();
        org.jfree.chart.util.ShapeList shapeList70 = new org.jfree.chart.util.ShapeList();
        boolean boolean72 = shapeList70.equals((java.lang.Object) 100);
        boolean boolean73 = shapeList63.equals((java.lang.Object) shapeList70);
        java.awt.Shape shape75 = shapeList70.getShape((int) (short) -1);
        boolean boolean76 = shapeList52.equals((java.lang.Object) shape75);
        org.jfree.chart.util.ShapeList shapeList77 = new org.jfree.chart.util.ShapeList();
        int int78 = shapeList77.size();
        int int79 = shapeList77.size();
        int int80 = shapeList77.size();
        org.jfree.chart.util.ShapeList shapeList81 = new org.jfree.chart.util.ShapeList();
        int int82 = shapeList81.size();
        shapeList81.clear();
        java.lang.Object obj84 = shapeList81.clone();
        boolean boolean85 = shapeList77.equals((java.lang.Object) shapeList81);
        java.lang.Object obj86 = shapeList77.clone();
        boolean boolean87 = shapeList52.equals(obj86);
        shapeList52.clear();
        boolean boolean89 = shapeList29.equals((java.lang.Object) shapeList52);
        shapeList52.clear();
        boolean boolean91 = shapeList16.equals((java.lang.Object) shapeList52);
        java.awt.Shape shape93 = null;
        shapeList16.setShape((int) (short) 0, shape93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
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
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(33, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(2, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape12 = shapeList7.getShape((int) (short) -1);
        java.awt.Shape shape14 = null;
        shapeList7.setShape(1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(98);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(9, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
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
        int int26 = shapeList25.size();
        java.lang.Object obj27 = shapeList25.clone();
        int int28 = shapeList25.size();
        shapeList25.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        java.awt.Shape shape33 = shapeList30.getShape(0);
        shapeList30.clear();
        shapeList30.clear();
        int int36 = shapeList30.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) (short) 0);
        java.lang.Object obj40 = shapeList37.clone();
        boolean boolean41 = shapeList30.equals(obj40);
        boolean boolean42 = shapeList25.equals((java.lang.Object) boolean41);
        boolean boolean43 = shapeList0.equals((java.lang.Object) boolean42);
        java.awt.Shape shape45 = null;
        shapeList0.setShape(98, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(35, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(53, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
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
        java.lang.Object obj24 = shapeList0.clone();
        java.awt.Shape shape26 = null;
        shapeList0.setShape(10, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
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
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
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
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape30 = null;
        shapeList13.setShape(8, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        int int11 = shapeList0.size();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) ' ', shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 0, shape10);
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = shapeList14.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) 100);
        boolean boolean24 = shapeList14.equals((java.lang.Object) shapeList21);
        int int25 = shapeList14.size();
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape34 = shapeList27.getShape((int) 'a');
        java.lang.Object obj35 = shapeList27.clone();
        boolean boolean36 = shapeList14.equals((java.lang.Object) shapeList27);
        int int37 = shapeList14.size();
        boolean boolean38 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
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
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(98, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
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
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.awt.Shape shape4 = shapeList0.getShape(0);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(34, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 0, shape5);
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
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
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        int int28 = shapeList26.size();
        int int29 = shapeList26.size();
        java.lang.Object obj30 = shapeList26.clone();
        java.lang.Object obj31 = shapeList26.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        int int33 = shapeList0.size();
        java.lang.Object obj34 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) 100);
        int int38 = shapeList35.size();
        java.awt.Shape shape40 = shapeList35.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        boolean boolean43 = shapeList41.equals((java.lang.Object) 100);
        java.awt.Shape shape45 = shapeList41.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        boolean boolean48 = shapeList46.equals((java.lang.Object) 100);
        int int49 = shapeList46.size();
        boolean boolean50 = shapeList41.equals((java.lang.Object) int49);
        java.awt.Shape shape52 = shapeList41.getShape(0);
        boolean boolean53 = shapeList35.equals((java.lang.Object) 0);
        shapeList35.clear();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        int int56 = shapeList55.size();
        int int57 = shapeList55.size();
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        int int59 = shapeList58.size();
        java.lang.Object obj60 = shapeList58.clone();
        int int61 = shapeList58.size();
        java.lang.Object obj62 = shapeList58.clone();
        boolean boolean63 = shapeList55.equals((java.lang.Object) shapeList58);
        boolean boolean64 = shapeList35.equals((java.lang.Object) shapeList58);
        shapeList35.clear();
        java.lang.Object obj66 = shapeList35.clone();
        boolean boolean67 = shapeList0.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape69 = null;
        shapeList35.setShape((int) (short) 1, shape69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape(34, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        int int13 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) 1);
        java.lang.Object obj22 = shapeList14.clone();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        boolean boolean25 = shapeList23.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        shapeList26.clear();
        shapeList26.clear();
        java.awt.Shape shape33 = shapeList26.getShape((int) 'a');
        java.lang.Object obj34 = shapeList26.clone();
        boolean boolean35 = shapeList23.equals(obj34);
        shapeList23.clear();
        boolean boolean37 = shapeList14.equals((java.lang.Object) shapeList23);
        boolean boolean38 = shapeList11.equals((java.lang.Object) shapeList23);
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        boolean boolean42 = shapeList40.equals((java.lang.Object) 100);
        int int43 = shapeList40.size();
        boolean boolean45 = shapeList40.equals((java.lang.Object) (byte) 0);
        boolean boolean47 = shapeList40.equals((java.lang.Object) (short) 100);
        shapeList40.clear();
        shapeList40.clear();
        java.awt.Shape shape51 = shapeList40.getShape((int) '#');
        boolean boolean52 = shapeList23.equals((java.lang.Object) '#');
        boolean boolean53 = shapeList0.equals((java.lang.Object) shapeList23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        shapeList17.clear();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        boolean boolean21 = shapeList12.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = shapeList12.getShape((int) '4');
        java.awt.Shape shape25 = shapeList12.getShape(53);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        int int29 = shapeList26.size();
        boolean boolean31 = shapeList26.equals((java.lang.Object) (byte) 0);
        boolean boolean33 = shapeList26.equals((java.lang.Object) (short) 100);
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        java.lang.Object obj37 = shapeList35.clone();
        boolean boolean38 = shapeList26.equals((java.lang.Object) shapeList35);
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        boolean boolean41 = shapeList26.equals((java.lang.Object) int40);
        shapeList26.clear();
        int int43 = shapeList26.size();
        int int44 = shapeList26.size();
        boolean boolean45 = shapeList12.equals((java.lang.Object) shapeList26);
        boolean boolean46 = shapeList0.equals((java.lang.Object) boolean45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(2, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(0);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 100, shape14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = shapeList16.equals((java.lang.Object) (short) 100);
        shapeList16.clear();
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape28 = null;
        shapeList16.setShape(2, shape28);
        int int30 = shapeList16.size();
        boolean boolean31 = shapeList0.equals((java.lang.Object) int30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 100, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
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
        int int23 = shapeList11.size();
        java.lang.Object obj24 = shapeList11.clone();
        java.awt.Shape shape26 = null;
        shapeList11.setShape(53, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        boolean boolean9 = shapeList4.equals((java.lang.Object) ' ');
        java.lang.Object obj10 = shapeList4.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (short) 10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (short) 100, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(53, shape18);
        java.lang.Object obj20 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj20", shapeList0.equals(obj20) ? shapeList0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
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
        shapeList13.setShape(53, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((int) 'a');
        java.lang.Object obj21 = shapeList13.clone();
        shapeList13.clear();
        java.lang.Object obj23 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean29 = shapeList24.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = shapeList24.clone();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        boolean boolean33 = shapeList31.equals((java.lang.Object) 100);
        boolean boolean34 = shapeList24.equals((java.lang.Object) shapeList31);
        java.awt.Shape shape36 = shapeList31.getShape((int) (short) -1);
        boolean boolean37 = shapeList13.equals((java.lang.Object) shape36);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        int int40 = shapeList38.size();
        int int41 = shapeList38.size();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        shapeList42.clear();
        java.lang.Object obj45 = shapeList42.clone();
        boolean boolean46 = shapeList38.equals((java.lang.Object) shapeList42);
        java.lang.Object obj47 = shapeList38.clone();
        boolean boolean48 = shapeList13.equals(obj47);
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList13);
        int int50 = shapeList13.size();
        java.awt.Shape shape52 = null;
        shapeList13.setShape(36, shape52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape((int) (byte) 100);
        java.awt.Shape shape16 = shapeList11.getShape(33);
        java.lang.Object obj17 = shapeList11.clone();
        java.lang.Object obj18 = shapeList11.clone();
        java.lang.Class<?> wildcardClass19 = shapeList11.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape22 = null;
        shapeList0.setShape(2, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
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
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape27 = shapeList20.getShape((int) (short) 1);
        java.lang.Object obj28 = shapeList20.clone();
        java.lang.Object obj29 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape32 = shapeList20.getShape((-1));
        boolean boolean33 = shapeList4.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape35 = null;
        shapeList20.setShape((int) (short) 10, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
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
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        int int26 = shapeList22.size();
        boolean boolean28 = shapeList22.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = shapeList22.clone();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape32 = null;
        shapeList22.setShape(0, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(98);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '4', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(1);
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
        java.lang.Object obj32 = shapeList12.clone();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape35 = shapeList12.getShape(2);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        java.awt.Shape shape41 = shapeList36.getShape((int) '#');
        java.awt.Shape shape43 = shapeList36.getShape((int) (byte) 100);
        int int44 = shapeList36.size();
        java.awt.Shape shape46 = null;
        shapeList36.setShape((int) '4', shape46);
        java.lang.Object obj48 = shapeList36.clone();
        boolean boolean49 = shapeList12.equals(obj48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(11);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((int) 'a');
        java.lang.Object obj19 = shapeList11.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = shapeList0.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
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
        shapeList0.setShape(53, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
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
        shapeList0.setShape(2, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
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
        int int33 = shapeList16.size();
        java.awt.Shape shape35 = null;
        shapeList16.setShape(8, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
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
        java.awt.Shape shape59 = null;
        shapeList0.setShape(36, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
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
        shapeList9.setShape((int) '#', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        java.lang.Object obj26 = shapeList24.clone();
        int int27 = shapeList24.size();
        java.lang.Object obj28 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) 100);
        boolean boolean33 = shapeList24.equals((java.lang.Object) 10L);
        java.awt.Shape shape35 = shapeList24.getShape((int) ' ');
        java.lang.Object obj36 = shapeList24.clone();
        boolean boolean37 = shapeList11.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape39 = null;
        shapeList11.setShape(35, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        int int12 = shapeList9.size();
        java.lang.Object obj13 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) 100);
        boolean boolean18 = shapeList9.equals((java.lang.Object) 10L);
        java.awt.Shape shape20 = shapeList9.getShape((int) (byte) 1);
        java.lang.Object obj21 = shapeList9.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.awt.Shape shape25 = shapeList22.getShape(0);
        shapeList22.clear();
        shapeList22.clear();
        int int28 = shapeList22.size();
        java.awt.Shape shape30 = shapeList22.getShape((-1));
        shapeList22.clear();
        int int32 = shapeList22.size();
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
        boolean boolean45 = shapeList22.equals((java.lang.Object) shapeList33);
        boolean boolean46 = shapeList9.equals((java.lang.Object) shapeList33);
        java.lang.Object obj47 = shapeList9.clone();
        java.lang.Object obj48 = shapeList9.clone();
        shapeList9.clear();
        int int50 = shapeList9.size();
        boolean boolean51 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape53 = null;
        shapeList9.setShape((int) (short) 10, shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
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
        shapeList11.setShape((int) ' ', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
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
        shapeList3.setShape((int) (byte) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(1, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
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
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = shapeList4.equals((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = shapeList4.clone();
        java.awt.Shape shape25 = null;
        shapeList4.setShape(100, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.lang.Object obj19 = shapeList17.clone();
        int int20 = shapeList17.size();
        java.lang.Object obj21 = shapeList17.clone();
        boolean boolean22 = shapeList14.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape24 = shapeList17.getShape(0);
        java.lang.Object obj25 = null;
        boolean boolean26 = shapeList17.equals(obj25);
        boolean boolean27 = shapeList0.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape(100);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shape20);
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) 'a', shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
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
        java.awt.Shape shape36 = null;
        shapeList26.setShape(33, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) '4', shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        java.awt.Shape shape13 = shapeList0.getShape(9);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        java.awt.Shape shape18 = shapeList14.getShape((int) '#');
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        boolean boolean25 = shapeList20.equals((java.lang.Object) ' ');
        shapeList20.clear();
        int int27 = shapeList20.size();
        shapeList20.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        boolean boolean34 = shapeList29.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = shapeList29.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape38 = shapeList29.getShape(0);
        shapeList29.clear();
        boolean boolean40 = shapeList20.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        int int43 = shapeList41.size();
        int int44 = shapeList41.size();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        boolean boolean47 = shapeList45.equals((java.lang.Object) 100);
        int int48 = shapeList45.size();
        boolean boolean50 = shapeList45.equals((java.lang.Object) (byte) 0);
        shapeList45.clear();
        boolean boolean52 = shapeList41.equals((java.lang.Object) shapeList45);
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        java.awt.Shape shape56 = shapeList53.getShape(0);
        boolean boolean58 = shapeList53.equals((java.lang.Object) ' ');
        java.awt.Shape shape60 = shapeList53.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList61 = new org.jfree.chart.util.ShapeList();
        int int62 = shapeList61.size();
        java.awt.Shape shape64 = shapeList61.getShape(0);
        shapeList61.clear();
        shapeList61.clear();
        int int67 = shapeList61.size();
        org.jfree.chart.util.ShapeList shapeList68 = new org.jfree.chart.util.ShapeList();
        boolean boolean70 = shapeList68.equals((java.lang.Object) (short) 0);
        java.lang.Object obj71 = shapeList68.clone();
        boolean boolean72 = shapeList61.equals(obj71);
        boolean boolean73 = shapeList53.equals((java.lang.Object) boolean72);
        java.awt.Shape shape75 = shapeList53.getShape(101);
        boolean boolean76 = shapeList45.equals((java.lang.Object) shapeList53);
        boolean boolean77 = shapeList20.equals((java.lang.Object) shapeList45);
        shapeList45.clear();
        boolean boolean79 = shapeList14.equals((java.lang.Object) shapeList45);
        java.awt.Shape shape81 = shapeList45.getShape(0);
        int int82 = shapeList45.size();
        java.awt.Shape shape84 = shapeList45.getShape(9);
        boolean boolean85 = shapeList0.equals((java.lang.Object) 9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
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
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        boolean boolean18 = shapeList11.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape20 = shapeList11.getShape((int) '4');
        int int21 = shapeList11.size();
        int int22 = shapeList11.size();
        boolean boolean23 = shapeList0.equals((java.lang.Object) int22);
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 0);
        int int28 = shapeList25.size();
        java.awt.Shape shape30 = shapeList25.getShape((int) (byte) 1);
        boolean boolean31 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape33 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape(98, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        java.awt.Shape shape32 = shapeList0.getShape(10);
        java.awt.Shape shape34 = null;
        shapeList0.setShape(98, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
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
        shapeList0.setShape((int) '4', shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape((int) (byte) 100);
        java.awt.Shape shape16 = shapeList11.getShape(33);
        java.lang.Object obj17 = shapeList11.clone();
        java.lang.Object obj18 = shapeList11.clone();
        java.lang.Class<?> wildcardClass19 = shapeList11.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (short) 1, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
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
        shapeList0.setShape(0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
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
        shapeList5.setShape(0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        boolean boolean19 = shapeList14.equals((java.lang.Object) ' ');
        shapeList14.clear();
        int int21 = shapeList14.size();
        shapeList14.clear();
        java.awt.Shape shape24 = shapeList14.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.awt.Shape shape28 = shapeList25.getShape(0);
        shapeList25.clear();
        shapeList25.clear();
        java.awt.Shape shape32 = shapeList25.getShape((-1));
        java.awt.Shape shape34 = shapeList25.getShape((int) (short) 100);
        boolean boolean35 = shapeList14.equals((java.lang.Object) shapeList25);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        java.lang.Object obj38 = shapeList36.clone();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        boolean boolean40 = shapeList14.equals(obj38);
        java.awt.Shape shape42 = shapeList14.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean45 = shapeList43.equals((java.lang.Object) 100);
        int int46 = shapeList43.size();
        boolean boolean48 = shapeList43.equals((java.lang.Object) (byte) 0);
        boolean boolean50 = shapeList43.equals((java.lang.Object) (short) 100);
        shapeList43.clear();
        int int52 = shapeList43.size();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        java.awt.Shape shape56 = shapeList53.getShape(0);
        shapeList53.clear();
        shapeList53.clear();
        java.awt.Shape shape60 = shapeList53.getShape((int) 'a');
        java.lang.Object obj61 = shapeList53.clone();
        java.awt.Shape shape63 = shapeList53.getShape((int) '4');
        shapeList53.clear();
        int int65 = shapeList53.size();
        boolean boolean66 = shapeList43.equals((java.lang.Object) shapeList53);
        boolean boolean67 = shapeList14.equals((java.lang.Object) shapeList43);
        java.lang.Object obj68 = shapeList43.clone();
        java.awt.Shape shape70 = shapeList43.getShape(1);
        boolean boolean71 = shapeList0.equals((java.lang.Object) shapeList43);
        org.jfree.chart.util.ShapeList shapeList72 = new org.jfree.chart.util.ShapeList();
        boolean boolean74 = shapeList72.equals((java.lang.Object) 100);
        int int75 = shapeList72.size();
        boolean boolean77 = shapeList72.equals((java.lang.Object) (byte) 0);
        boolean boolean79 = shapeList72.equals((java.lang.Object) (short) 100);
        shapeList72.clear();
        shapeList72.clear();
        shapeList72.clear();
        java.awt.Shape shape84 = shapeList72.getShape(9);
        shapeList72.clear();
        boolean boolean86 = shapeList43.equals((java.lang.Object) shapeList72);
        java.lang.Object obj87 = shapeList43.clone();
        java.awt.Shape shape89 = null;
        shapeList43.setShape((int) ' ', shape89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList43", shapeList0.equals(shapeList43) ? shapeList0.hashCode() == shapeList43.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
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
        java.lang.Object obj24 = shapeList0.clone();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = shapeList0.getShape(98);
        java.awt.Shape shape29 = null;
        shapeList0.setShape((int) (byte) 10, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 100, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
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
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 0);
        java.lang.Object obj14 = shapeList11.clone();
        int int15 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.awt.Shape shape19 = shapeList16.getShape(0);
        shapeList16.clear();
        shapeList16.clear();
        int int22 = shapeList16.size();
        int int23 = shapeList16.size();
        shapeList16.clear();
        boolean boolean25 = shapeList11.equals((java.lang.Object) shapeList16);
        int int26 = shapeList11.size();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList11);
        shapeList11.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        int int32 = shapeList29.size();
        java.awt.Shape shape34 = shapeList29.getShape((int) '#');
        java.awt.Shape shape36 = shapeList29.getShape((int) (byte) 100);
        int int37 = shapeList29.size();
        java.awt.Shape shape39 = null;
        shapeList29.setShape((int) '4', shape39);
        java.lang.Object obj41 = shapeList29.clone();
        boolean boolean42 = shapeList11.equals(obj41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
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
        java.lang.Object obj14 = shapeList0.clone();
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
        shapeList24.clear();
        shapeList24.clear();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        java.lang.Object obj40 = shapeList38.clone();
        boolean boolean41 = shapeList24.equals(obj40);
        java.lang.Class<?> wildcardClass42 = obj40.getClass();
        boolean boolean43 = shapeList0.equals(obj40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape35 = null;
        shapeList0.setShape(8, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
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
        shapeList0.setShape((int) (short) 10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
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
        java.lang.Object obj33 = shapeList12.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        java.awt.Shape shape37 = shapeList34.getShape((int) (byte) 100);
        shapeList34.clear();
        int int39 = shapeList34.size();
        int int40 = shapeList34.size();
        java.lang.Object obj41 = shapeList34.clone();
        boolean boolean42 = shapeList12.equals((java.lang.Object) shapeList34);
        boolean boolean43 = shapeList0.equals((java.lang.Object) boolean42);
        java.awt.Shape shape45 = null;
        shapeList0.setShape(34, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
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
        java.awt.Shape shape18 = shapeList13.getShape((int) '#');
        java.lang.Object obj19 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        boolean boolean25 = shapeList20.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = shapeList20.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        boolean boolean30 = shapeList20.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape32 = shapeList27.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) 100);
        int int36 = shapeList33.size();
        boolean boolean38 = shapeList33.equals((java.lang.Object) (byte) 0);
        boolean boolean40 = shapeList33.equals((java.lang.Object) (short) 100);
        shapeList33.clear();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.lang.Object obj44 = shapeList42.clone();
        boolean boolean45 = shapeList33.equals((java.lang.Object) shapeList42);
        java.awt.Shape shape47 = shapeList33.getShape(1);
        java.lang.Object obj48 = shapeList33.clone();
        boolean boolean49 = shapeList27.equals(obj48);
        java.lang.Object obj50 = shapeList27.clone();
        boolean boolean51 = shapeList13.equals(obj50);
        boolean boolean52 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape54 = null;
        shapeList0.setShape((int) '4', shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
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
        java.awt.Shape shape19 = shapeList0.getShape(98);
        java.awt.Shape shape21 = shapeList0.getShape(0);
        java.awt.Shape shape23 = null;
        shapeList0.setShape(1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
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
        java.awt.Shape shape28 = shapeList0.getShape(100);
        shapeList0.clear();
        java.awt.Shape shape31 = null;
        shapeList0.setShape(3, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
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
        shapeList0.setShape((int) (byte) 0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
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
        shapeList0.setShape(1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) ' ', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
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
        java.awt.Shape shape18 = shapeList0.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean24 = shapeList19.equals((java.lang.Object) (byte) 0);
        boolean boolean26 = shapeList19.equals((java.lang.Object) (short) 100);
        shapeList19.clear();
        java.awt.Shape shape29 = null;
        shapeList19.setShape(0, shape29);
        java.lang.Object obj31 = shapeList19.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape((int) (byte) 100);
        shapeList10.clear();
        int int15 = shapeList10.size();
        int int16 = shapeList10.size();
        int int17 = shapeList10.size();
        shapeList10.clear();
        int int19 = shapeList10.size();
        shapeList10.clear();
        int int21 = shapeList10.size();
        java.lang.Class<?> wildcardClass22 = shapeList10.getClass();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape25 = shapeList0.getShape(98);
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 1, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
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
        java.awt.Shape shape56 = null;
        shapeList29.setShape(36, shape56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        shapeList14.clear();
        int int19 = shapeList14.size();
        boolean boolean20 = shapeList0.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
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
        shapeList4.setShape((int) (byte) 0, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        shapeList9.clear();
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape17 = shapeList9.getShape((int) '4');
        shapeList9.clear();
        java.lang.Class<?> wildcardClass19 = shapeList9.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) 100);
        int int24 = shapeList21.size();
        java.awt.Shape shape26 = shapeList21.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        java.awt.Shape shape31 = shapeList27.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        int int35 = shapeList32.size();
        boolean boolean36 = shapeList27.equals((java.lang.Object) int35);
        java.awt.Shape shape38 = shapeList27.getShape(0);
        boolean boolean39 = shapeList21.equals((java.lang.Object) 0);
        shapeList21.clear();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        int int43 = shapeList41.size();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.lang.Object obj46 = shapeList44.clone();
        int int47 = shapeList44.size();
        java.lang.Object obj48 = shapeList44.clone();
        boolean boolean49 = shapeList41.equals((java.lang.Object) shapeList44);
        boolean boolean50 = shapeList21.equals((java.lang.Object) shapeList44);
        java.lang.Object obj51 = shapeList44.clone();
        boolean boolean52 = shapeList0.equals((java.lang.Object) shapeList44);
        java.awt.Shape shape54 = null;
        shapeList44.setShape(36, shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList44", shapeList0.equals(shapeList44) ? shapeList0.hashCode() == shapeList44.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
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
        shapeList2.clear();
        java.awt.Shape shape17 = shapeList2.getShape((int) 'a');
        java.awt.Shape shape19 = null;
        shapeList2.setShape(101, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList2", shapeList0.equals(shapeList2) ? shapeList0.hashCode() == shapeList2.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = shapeList14.equals((java.lang.Object) (short) 100);
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape25 = shapeList14.getShape((int) '#');
        java.awt.Shape shape27 = shapeList14.getShape(2);
        java.lang.Object obj28 = shapeList14.clone();
        boolean boolean29 = shapeList0.equals(obj28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
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
        int int19 = shapeList8.size();
        shapeList8.clear();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape23 = null;
        shapeList0.setShape(8, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
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
        java.awt.Shape shape39 = null;
        shapeList0.setShape((int) (byte) 1, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
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
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(11, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((int) 'a');
        java.lang.Object obj21 = shapeList13.clone();
        shapeList13.clear();
        java.lang.Object obj23 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) 100);
        int int27 = shapeList24.size();
        boolean boolean29 = shapeList24.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = shapeList24.clone();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        boolean boolean33 = shapeList31.equals((java.lang.Object) 100);
        boolean boolean34 = shapeList24.equals((java.lang.Object) shapeList31);
        java.awt.Shape shape36 = shapeList31.getShape((int) (short) -1);
        boolean boolean37 = shapeList13.equals((java.lang.Object) shape36);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        int int40 = shapeList38.size();
        int int41 = shapeList38.size();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        shapeList42.clear();
        java.lang.Object obj45 = shapeList42.clone();
        boolean boolean46 = shapeList38.equals((java.lang.Object) shapeList42);
        java.lang.Object obj47 = shapeList38.clone();
        boolean boolean48 = shapeList13.equals(obj47);
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList13);
        int int50 = shapeList13.size();
        java.awt.Shape shape52 = shapeList13.getShape((int) '4');
        java.awt.Shape shape54 = null;
        shapeList13.setShape(2, shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
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
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.lang.Object obj35 = shapeList33.clone();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList33);
        java.lang.Object obj37 = shapeList33.clone();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        int int39 = shapeList38.size();
        java.awt.Shape shape41 = shapeList38.getShape(0);
        shapeList38.clear();
        shapeList38.clear();
        int int44 = shapeList38.size();
        java.awt.Shape shape46 = shapeList38.getShape((-1));
        shapeList38.clear();
        int int48 = shapeList38.size();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        int int51 = shapeList49.size();
        int int52 = shapeList49.size();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        boolean boolean55 = shapeList53.equals((java.lang.Object) 100);
        int int56 = shapeList53.size();
        boolean boolean58 = shapeList53.equals((java.lang.Object) (byte) 0);
        shapeList53.clear();
        boolean boolean60 = shapeList49.equals((java.lang.Object) shapeList53);
        boolean boolean61 = shapeList38.equals((java.lang.Object) shapeList49);
        boolean boolean62 = shapeList33.equals((java.lang.Object) shapeList38);
        java.awt.Shape shape64 = null;
        shapeList38.setShape((int) ' ', shape64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList38", shapeList0.equals(shapeList38) ? shapeList0.hashCode() == shapeList38.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
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
        int int13 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        java.lang.Object obj17 = shapeList15.clone();
        java.awt.Shape shape19 = shapeList15.getShape(33);
        int int20 = shapeList15.size();
        int int21 = shapeList15.size();
        shapeList15.clear();
        java.awt.Shape shape24 = shapeList15.getShape((int) (short) 1);
        int int25 = shapeList15.size();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList15);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape34 = shapeList27.getShape((-1));
        java.awt.Shape shape36 = null;
        shapeList27.setShape((int) 'a', shape36);
        java.awt.Shape shape39 = null;
        shapeList27.setShape((int) (short) 10, shape39);
        java.lang.Object obj41 = shapeList27.clone();
        java.lang.Object obj42 = shapeList27.clone();
        boolean boolean43 = shapeList0.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
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
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        java.awt.Shape shape31 = shapeList28.getShape(0);
        boolean boolean33 = shapeList28.equals((java.lang.Object) ' ');
        shapeList28.clear();
        int int35 = shapeList28.size();
        shapeList28.clear();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) 100);
        int int40 = shapeList37.size();
        boolean boolean42 = shapeList37.equals((java.lang.Object) (byte) 0);
        boolean boolean44 = shapeList37.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape46 = shapeList37.getShape(0);
        shapeList37.clear();
        boolean boolean48 = shapeList28.equals((java.lang.Object) shapeList37);
        java.lang.Object obj49 = shapeList28.clone();
        org.jfree.chart.util.ShapeList shapeList50 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj51 = shapeList50.clone();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        boolean boolean53 = shapeList28.equals((java.lang.Object) wildcardClass52);
        int int54 = shapeList28.size();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        int int56 = shapeList55.size();
        java.awt.Shape shape58 = shapeList55.getShape(0);
        boolean boolean60 = shapeList55.equals((java.lang.Object) ' ');
        shapeList55.clear();
        int int62 = shapeList55.size();
        shapeList55.clear();
        boolean boolean64 = shapeList28.equals((java.lang.Object) shapeList55);
        int int65 = shapeList55.size();
        boolean boolean66 = shapeList13.equals((java.lang.Object) int65);
        java.awt.Shape shape68 = null;
        shapeList13.setShape((int) (short) 100, shape68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
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
        java.awt.Shape shape28 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) 100);
        shapeList29.clear();
        java.awt.Shape shape34 = null;
        shapeList29.setShape((int) (short) 100, shape34);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        java.awt.Shape shape9 = shapeList6.getShape(0);
        java.lang.Class<?> wildcardClass10 = shapeList6.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) wildcardClass10);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
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
        int int36 = shapeList35.size();
        java.awt.Shape shape38 = shapeList35.getShape(0);
        shapeList35.clear();
        shapeList35.clear();
        int int41 = shapeList35.size();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        boolean boolean44 = shapeList42.equals((java.lang.Object) (short) 0);
        java.lang.Object obj45 = shapeList42.clone();
        boolean boolean46 = shapeList35.equals(obj45);
        int int47 = shapeList35.size();
        shapeList35.clear();
        java.awt.Shape shape50 = shapeList35.getShape(33);
        shapeList35.clear();
        boolean boolean52 = shapeList0.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape54 = null;
        shapeList0.setShape((int) (short) 1, shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj15", shapeList0.equals(obj15) ? shapeList0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.awt.Shape shape9 = null;
        shapeList0.setShape(34, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        shapeList11.clear();
        java.lang.Object obj13 = shapeList11.clone();
        int int14 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        int int19 = shapeList15.size();
        boolean boolean21 = shapeList15.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = shapeList15.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = shapeList11.equals((java.lang.Object) wildcardClass23);
        shapeList11.clear();
        java.lang.Class<?> wildcardClass26 = shapeList11.getClass();
        boolean boolean27 = shapeList0.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        java.awt.Shape shape11 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape19 = shapeList12.getShape((-1));
        shapeList12.clear();
        shapeList12.clear();
        shapeList12.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
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
        int int18 = shapeList0.size();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(1, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
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
        int int19 = shapeList13.size();
        java.awt.Shape shape21 = shapeList13.getShape((-1));
        shapeList13.clear();
        int int23 = shapeList13.size();
        java.awt.Shape shape25 = null;
        shapeList13.setShape(8, shape25);
        java.lang.Object obj27 = shapeList13.clone();
        java.awt.Shape shape29 = null;
        shapeList13.setShape(1, shape29);
        java.lang.Object obj31 = shapeList13.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
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
        java.awt.Shape shape22 = shapeList0.getShape(9);
        java.awt.Shape shape24 = null;
        shapeList0.setShape(0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(0, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
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
        java.awt.Shape shape40 = null;
        shapeList24.setShape((int) (byte) 1, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList24", shapeList0.equals(shapeList24) ? shapeList0.hashCode() == shapeList24.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(2, shape6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape15 = shapeList8.getShape((-1));
        boolean boolean16 = shapeList0.equals((java.lang.Object) shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape((int) (byte) 100);
        shapeList4.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        int int11 = shapeList9.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.lang.Object obj14 = shapeList12.clone();
        int int15 = shapeList12.size();
        java.lang.Object obj16 = shapeList12.clone();
        boolean boolean17 = shapeList9.equals((java.lang.Object) shapeList12);
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.lang.Object obj21 = shapeList19.clone();
        int int22 = shapeList19.size();
        java.lang.Object obj23 = shapeList19.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = shapeList9.equals(obj23);
        java.awt.Shape shape27 = shapeList9.getShape(100);
        shapeList9.clear();
        int int29 = shapeList9.size();
        boolean boolean30 = shapeList4.equals((java.lang.Object) shapeList9);
        java.lang.Object obj31 = shapeList4.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList4);
        shapeList4.clear();
        java.awt.Shape shape35 = null;
        shapeList4.setShape((int) (short) 1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
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
        shapeList0.setShape(8, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 0, shape5);
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((-1));
        java.awt.Shape shape20 = shapeList8.getShape(101);
        java.awt.Shape shape22 = shapeList8.getShape((int) (short) -1);
        boolean boolean23 = shapeList0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
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
        int int59 = shapeList0.size();
        java.lang.Object obj60 = shapeList0.clone();
        int int61 = shapeList0.size();
        java.awt.Shape shape63 = null;
        shapeList0.setShape(1, shape63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
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
        java.lang.Object obj13 = shapeList4.clone();
        int int14 = shapeList4.size();
        java.awt.Shape shape16 = null;
        shapeList4.setShape((int) (short) 1, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
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
        shapeList17.clear();
        int int36 = shapeList17.size();
        java.lang.Object obj37 = shapeList17.clone();
        boolean boolean38 = shapeList0.equals(obj37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
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
        java.awt.Shape shape38 = shapeList0.getShape(98);
        int int39 = shapeList0.size();
        java.lang.Object obj40 = shapeList0.clone();
        java.awt.Shape shape42 = null;
        shapeList0.setShape(3, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
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
        java.lang.Object obj34 = shapeList0.clone();
        java.lang.Object obj35 = shapeList0.clone();
        java.awt.Shape shape37 = null;
        shapeList0.setShape(0, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        int int14 = shapeList12.size();
        int int15 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        int int19 = shapeList16.size();
        boolean boolean21 = shapeList16.equals((java.lang.Object) (byte) 0);
        shapeList16.clear();
        boolean boolean23 = shapeList12.equals((java.lang.Object) shapeList16);
        shapeList16.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList16);
        java.lang.Object obj26 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        int int30 = shapeList27.size();
        boolean boolean32 = shapeList27.equals((java.lang.Object) (byte) 0);
        boolean boolean34 = shapeList27.equals((java.lang.Object) (short) 100);
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape38 = shapeList27.getShape((int) '#');
        java.awt.Shape shape40 = null;
        shapeList27.setShape(1, shape40);
        java.awt.Shape shape43 = shapeList27.getShape((int) (byte) 10);
        java.awt.Shape shape45 = null;
        shapeList27.setShape(1, shape45);
        java.awt.Shape shape48 = null;
        shapeList27.setShape(0, shape48);
        boolean boolean50 = shapeList0.equals((java.lang.Object) shapeList27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        shapeList0.clear();
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
        int int24 = shapeList10.size();
        shapeList10.clear();
        java.awt.Shape shape27 = shapeList10.getShape((int) (byte) 100);
        boolean boolean28 = shapeList0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.awt.Shape shape32 = shapeList29.getShape(0);
        java.awt.Shape shape34 = null;
        shapeList29.setShape((int) ' ', shape34);
        int int36 = shapeList29.size();
        java.lang.Object obj37 = shapeList29.clone();
        java.awt.Shape shape39 = shapeList29.getShape((int) '4');
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(1, shape7);
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) 100);
        int int13 = shapeList10.size();
        boolean boolean15 = shapeList10.equals((java.lang.Object) (byte) 0);
        boolean boolean17 = shapeList10.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape19 = shapeList10.getShape(0);
        java.awt.Shape shape21 = shapeList10.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        boolean boolean29 = shapeList22.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape31 = shapeList22.getShape((int) '4');
        shapeList22.clear();
        boolean boolean33 = shapeList10.equals((java.lang.Object) shapeList22);
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) (short) 10, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
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
        java.lang.Object obj17 = shapeList7.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean23 = shapeList18.equals((java.lang.Object) (byte) 0);
        boolean boolean25 = shapeList18.equals((java.lang.Object) (short) 100);
        int int26 = shapeList18.size();
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape30 = null;
        shapeList18.setShape((int) (short) 10, shape30);
        java.awt.Shape shape33 = shapeList18.getShape(2);
        boolean boolean34 = shapeList7.equals((java.lang.Object) shapeList18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 10, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
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
        shapeList0.setShape(9, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
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
        shapeList0.setShape(100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
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
        java.awt.Shape shape45 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape47 = shapeList0.getShape(53);
        java.awt.Shape shape49 = null;
        shapeList0.setShape(98, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
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
        int int13 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
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
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(34, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
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
        shapeList23.setShape(12, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
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
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        java.awt.Shape shape20 = shapeList13.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        java.awt.Shape shape24 = shapeList21.getShape(0);
        shapeList21.clear();
        int int26 = shapeList21.size();
        java.lang.Class<?> wildcardClass27 = shapeList21.getClass();
        boolean boolean28 = shapeList13.equals((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = shapeList13.clone();
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
        shapeList30.clear();
        java.lang.Object obj52 = shapeList30.clone();
        boolean boolean53 = shapeList13.equals((java.lang.Object) shapeList30);
        boolean boolean54 = shapeList0.equals((java.lang.Object) boolean53);
        java.awt.Shape shape56 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape58 = null;
        shapeList0.setShape(33, shape58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        int int10 = shapeList0.size();
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
        java.awt.Shape shape22 = shapeList15.getShape(0);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList15);
        shapeList0.clear();
        java.awt.Shape shape26 = null;
        shapeList0.setShape(34, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.awt.Shape shape8 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(36, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
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
        shapeList0.clear();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) '4', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        int int18 = shapeList16.size();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.lang.Object obj21 = shapeList19.clone();
        int int22 = shapeList19.size();
        java.lang.Object obj23 = shapeList19.clone();
        boolean boolean24 = shapeList16.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape26 = shapeList16.getShape((int) (short) 0);
        java.awt.Shape shape28 = shapeList16.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.awt.Shape shape32 = shapeList29.getShape(0);
        boolean boolean34 = shapeList29.equals((java.lang.Object) ' ');
        java.awt.Shape shape36 = shapeList29.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        java.awt.Shape shape40 = shapeList37.getShape(0);
        shapeList37.clear();
        int int42 = shapeList37.size();
        java.lang.Class<?> wildcardClass43 = shapeList37.getClass();
        boolean boolean44 = shapeList29.equals((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = shapeList29.clone();
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        int int47 = shapeList46.size();
        java.awt.Shape shape49 = shapeList46.getShape(0);
        boolean boolean51 = shapeList46.equals((java.lang.Object) ' ');
        shapeList46.clear();
        int int53 = shapeList46.size();
        shapeList46.clear();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        boolean boolean57 = shapeList55.equals((java.lang.Object) 100);
        int int58 = shapeList55.size();
        boolean boolean60 = shapeList55.equals((java.lang.Object) (byte) 0);
        boolean boolean62 = shapeList55.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape64 = shapeList55.getShape(0);
        shapeList55.clear();
        boolean boolean66 = shapeList46.equals((java.lang.Object) shapeList55);
        shapeList46.clear();
        java.lang.Object obj68 = shapeList46.clone();
        boolean boolean69 = shapeList29.equals((java.lang.Object) shapeList46);
        boolean boolean70 = shapeList16.equals((java.lang.Object) boolean69);
        boolean boolean71 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape73 = null;
        shapeList0.setShape(12, shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = shapeList14.equals((java.lang.Object) (short) 100);
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        shapeList23.clear();
        boolean boolean26 = shapeList14.equals((java.lang.Object) shapeList23);
        shapeList14.clear();
        int int28 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        int int31 = shapeList29.size();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        java.lang.Object obj34 = shapeList32.clone();
        int int35 = shapeList32.size();
        java.lang.Object obj36 = shapeList32.clone();
        boolean boolean37 = shapeList29.equals((java.lang.Object) shapeList32);
        java.lang.Object obj38 = shapeList32.clone();
        java.lang.Object obj39 = shapeList32.clone();
        int int40 = shapeList32.size();
        boolean boolean41 = shapeList14.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape43 = shapeList14.getShape((int) ' ');
        boolean boolean44 = shapeList0.equals((java.lang.Object) shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
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
        shapeList23.clear();
        java.awt.Shape shape52 = null;
        shapeList23.setShape(10, shape52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
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
        shapeList0.clear();
        java.lang.Object obj24 = shapeList0.clone();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) ' ', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        java.lang.Object obj26 = shapeList24.clone();
        int int27 = shapeList24.size();
        java.lang.Object obj28 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) 100);
        boolean boolean33 = shapeList24.equals((java.lang.Object) 10L);
        java.awt.Shape shape35 = shapeList24.getShape((int) ' ');
        java.lang.Object obj36 = shapeList24.clone();
        boolean boolean37 = shapeList11.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape39 = null;
        shapeList11.setShape(0, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        int int14 = shapeList8.size();
        java.awt.Shape shape16 = shapeList8.getShape((-1));
        java.lang.Object obj17 = shapeList8.clone();
        boolean boolean18 = shapeList0.equals(obj17);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        int int21 = shapeList19.size();
        int int22 = shapeList19.size();
        int int23 = shapeList19.size();
        shapeList19.clear();
        shapeList19.clear();
        int int26 = shapeList19.size();
        java.awt.Shape shape28 = null;
        shapeList19.setShape((int) '#', shape28);
        int int30 = shapeList19.size();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(33, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
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
        java.lang.Object obj27 = shapeList0.clone();
        java.lang.Object obj28 = shapeList0.clone();
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) (short) 100, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
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
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        int int17 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        java.lang.Object obj20 = shapeList18.clone();
        int int21 = shapeList18.size();
        java.lang.Object obj22 = shapeList18.clone();
        boolean boolean23 = shapeList15.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape25 = shapeList15.getShape((int) (short) 0);
        java.awt.Shape shape27 = shapeList15.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        int int31 = shapeList28.size();
        boolean boolean33 = shapeList28.equals((java.lang.Object) (byte) 0);
        boolean boolean35 = shapeList28.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape37 = shapeList28.getShape((int) '4');
        boolean boolean38 = shapeList15.equals((java.lang.Object) '4');
        java.awt.Shape shape40 = shapeList15.getShape((int) (short) -1);
        java.lang.Object obj41 = shapeList15.clone();
        int int42 = shapeList15.size();
        shapeList15.clear();
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape46 = null;
        shapeList0.setShape(0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
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
        java.awt.Shape shape25 = null;
        shapeList12.setShape(53, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) '#', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
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
        java.lang.Object obj50 = shapeList37.clone();
        java.awt.Shape shape52 = null;
        shapeList37.setShape((int) (short) 100, shape52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList37", shapeList0.equals(shapeList37) ? shapeList0.hashCode() == shapeList37.hashCode() : true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        int int7 = shapeList5.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.lang.Object obj10 = shapeList8.clone();
        int int11 = shapeList8.size();
        java.lang.Object obj12 = shapeList8.clone();
        boolean boolean13 = shapeList5.equals((java.lang.Object) shapeList8);
        java.lang.Object obj14 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape17 = shapeList5.getShape(33);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 33);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        java.awt.Shape shape22 = shapeList19.getShape(0);
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape26 = shapeList19.getShape((int) 'a');
        java.lang.Object obj27 = shapeList19.clone();
        shapeList19.clear();
        java.lang.Object obj29 = shapeList19.clone();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean35 = shapeList30.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) 100);
        boolean boolean40 = shapeList30.equals((java.lang.Object) shapeList37);
        java.awt.Shape shape42 = shapeList37.getShape((int) (short) -1);
        boolean boolean43 = shapeList19.equals((java.lang.Object) shape42);
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        int int46 = shapeList44.size();
        int int47 = shapeList44.size();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        int int49 = shapeList48.size();
        shapeList48.clear();
        java.lang.Object obj51 = shapeList48.clone();
        boolean boolean52 = shapeList44.equals((java.lang.Object) shapeList48);
        java.lang.Object obj53 = shapeList44.clone();
        boolean boolean54 = shapeList19.equals(obj53);
        java.lang.Class<?> wildcardClass55 = obj53.getClass();
        boolean boolean56 = shapeList0.equals((java.lang.Object) wildcardClass55);
        shapeList0.clear();
        java.awt.Shape shape59 = null;
        shapeList0.setShape(99, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
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
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        java.awt.Shape shape45 = shapeList42.getShape(0);
        shapeList42.clear();
        shapeList42.clear();
        java.awt.Shape shape49 = shapeList42.getShape((int) 'a');
        java.lang.Object obj50 = shapeList42.clone();
        java.awt.Shape shape52 = shapeList42.getShape((int) '4');
        shapeList42.clear();
        boolean boolean54 = shapeList32.equals((java.lang.Object) shapeList42);
        java.lang.Object obj55 = shapeList42.clone();
        java.awt.Shape shape57 = shapeList42.getShape((-1));
        java.awt.Shape shape59 = null;
        shapeList42.setShape((int) (byte) 1, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList42", shapeList0.equals(shapeList42) ? shapeList0.hashCode() == shapeList42.hashCode() : true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
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
        shapeList0.clear();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) 'a');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(8);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((-1));
        java.awt.Shape shape20 = null;
        shapeList11.setShape((int) 'a', shape20);
        shapeList11.clear();
        java.awt.Shape shape24 = shapeList11.getShape((int) 'a');
        java.lang.Class<?> wildcardClass25 = shapeList11.getClass();
        boolean boolean26 = shapeList0.equals((java.lang.Object) wildcardClass25);
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) ' ', shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
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
        int int27 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        java.awt.Shape shape32 = shapeList28.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) 100);
        int int36 = shapeList33.size();
        boolean boolean37 = shapeList28.equals((java.lang.Object) int36);
        java.awt.Shape shape39 = shapeList28.getShape(0);
        java.lang.Object obj40 = shapeList28.clone();
        java.lang.Object obj41 = shapeList28.clone();
        boolean boolean42 = shapeList0.equals(obj41);
        java.awt.Shape shape44 = null;
        shapeList0.setShape((int) (short) 1, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape18 = null;
        shapeList0.setShape(10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
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
        java.awt.Shape shape23 = shapeList0.getShape((int) (byte) 10);
        java.lang.Object obj24 = shapeList0.clone();
        java.lang.Object obj25 = shapeList0.clone();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(34, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
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
        shapeList0.setShape((int) ' ', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList4);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        java.awt.Shape shape14 = shapeList9.getShape((int) '#');
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) 1);
        boolean boolean17 = shapeList4.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape19 = null;
        shapeList4.setShape(99, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        int int15 = shapeList13.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean21 = shapeList13.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        java.lang.Object obj24 = shapeList22.clone();
        int int25 = shapeList22.size();
        shapeList22.clear();
        boolean boolean27 = shapeList13.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape29 = shapeList13.getShape(0);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        int int32 = shapeList30.size();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.lang.Object obj35 = shapeList33.clone();
        int int36 = shapeList33.size();
        java.lang.Object obj37 = shapeList33.clone();
        boolean boolean38 = shapeList30.equals((java.lang.Object) shapeList33);
        java.awt.Shape shape40 = shapeList30.getShape((int) (short) 0);
        java.awt.Shape shape42 = shapeList30.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean45 = shapeList43.equals((java.lang.Object) 100);
        int int46 = shapeList43.size();
        boolean boolean48 = shapeList43.equals((java.lang.Object) (byte) 0);
        boolean boolean50 = shapeList43.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape52 = shapeList43.getShape((int) '4');
        boolean boolean53 = shapeList30.equals((java.lang.Object) '4');
        java.awt.Shape shape55 = shapeList30.getShape((int) (short) -1);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        int int58 = shapeList57.size();
        java.awt.Shape shape60 = shapeList57.getShape(0);
        boolean boolean62 = shapeList57.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        int int64 = shapeList63.size();
        java.lang.Object obj65 = shapeList63.clone();
        int int66 = shapeList63.size();
        java.lang.Object obj67 = shapeList63.clone();
        boolean boolean68 = shapeList57.equals((java.lang.Object) shapeList63);
        boolean boolean69 = shapeList30.equals((java.lang.Object) shapeList57);
        boolean boolean70 = shapeList13.equals((java.lang.Object) boolean69);
        java.lang.Object obj71 = shapeList13.clone();
        boolean boolean72 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape74 = null;
        shapeList13.setShape(35, shape74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
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
        shapeList0.setShape((int) (byte) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
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
        shapeList0.clear();
        java.lang.Object obj27 = shapeList0.clone();
        java.awt.Shape shape29 = null;
        shapeList0.setShape(2, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        boolean boolean13 = shapeList8.equals((java.lang.Object) (byte) 0);
        boolean boolean15 = shapeList8.equals((java.lang.Object) (short) 100);
        shapeList8.clear();
        int int17 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        java.awt.Shape shape21 = shapeList18.getShape(0);
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape25 = shapeList18.getShape((int) 'a');
        java.lang.Object obj26 = shapeList18.clone();
        java.awt.Shape shape28 = shapeList18.getShape((int) '4');
        shapeList18.clear();
        int int30 = shapeList18.size();
        boolean boolean31 = shapeList8.equals((java.lang.Object) shapeList18);
        shapeList8.clear();
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(0, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
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
        java.awt.Shape shape38 = null;
        shapeList21.setShape(8, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = shapeList0.equals(obj4);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(11, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
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
        shapeList0.clear();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
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
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        int int21 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 0);
        java.lang.Object obj25 = shapeList22.clone();
        boolean boolean26 = shapeList15.equals(obj25);
        int int27 = shapeList15.size();
        shapeList15.clear();
        java.awt.Shape shape30 = shapeList15.getShape(33);
        shapeList15.clear();
        shapeList15.clear();
        java.lang.Object obj33 = shapeList15.clone();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape36 = null;
        shapeList0.setShape(3, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
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
        java.lang.Object obj10 = shapeList6.clone();
        java.awt.Shape shape12 = null;
        shapeList6.setShape(0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
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
        java.awt.Shape shape24 = shapeList0.getShape(0);
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(1, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(2, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
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
        shapeList7.clear();
        java.awt.Shape shape20 = null;
        shapeList7.setShape(36, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(101, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
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
        java.awt.Shape shape23 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) (byte) 1, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape12 = shapeList0.getShape(8);
        java.awt.Shape shape14 = null;
        shapeList0.setShape(0, shape14);
        int int16 = shapeList0.size();
        java.lang.Object obj17 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj17", shapeList0.equals(obj17) ? shapeList0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
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
        int int32 = shapeList30.size();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.lang.Object obj35 = shapeList33.clone();
        int int36 = shapeList33.size();
        java.lang.Object obj37 = shapeList33.clone();
        boolean boolean38 = shapeList30.equals((java.lang.Object) shapeList33);
        java.awt.Shape shape40 = shapeList30.getShape((int) (short) 0);
        java.awt.Shape shape42 = shapeList30.getShape((int) (short) 10);
        java.awt.Shape shape44 = shapeList30.getShape((int) '#');
        java.lang.Object obj45 = shapeList30.clone();
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape48 = null;
        shapeList30.setShape(36, shape48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape(98, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) '4');
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(35, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape(8, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
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
        shapeList0.clear();
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (short) 100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 0, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
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
        java.awt.Shape shape17 = shapeList0.getShape(9);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) '#', shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
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
        int int19 = shapeList0.size();
        java.lang.Object obj20 = shapeList0.clone();
        java.awt.Shape shape22 = null;
        shapeList0.setShape(0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
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
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean27 = shapeList22.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        java.awt.Shape shape31 = shapeList28.getShape(0);
        java.lang.Class<?> wildcardClass32 = shapeList28.getClass();
        boolean boolean33 = shapeList22.equals((java.lang.Object) wildcardClass32);
        shapeList22.clear();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList22);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.awt.Shape shape39 = shapeList36.getShape(0);
        shapeList36.clear();
        shapeList36.clear();
        shapeList36.clear();
        java.awt.Shape shape44 = null;
        shapeList36.setShape((int) (byte) 0, shape44);
        int int46 = shapeList36.size();
        java.awt.Shape shape48 = shapeList36.getShape((int) (byte) 10);
        java.lang.Object obj49 = shapeList36.clone();
        java.lang.Class<?> wildcardClass50 = shapeList36.getClass();
        boolean boolean51 = shapeList22.equals((java.lang.Object) wildcardClass50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) ' ', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
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
        java.lang.Object obj26 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape35 = null;
        shapeList27.setShape((int) (byte) 0, shape35);
        int int37 = shapeList27.size();
        java.awt.Shape shape39 = shapeList27.getShape((int) (byte) 100);
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((-1));
        java.awt.Shape shape24 = shapeList15.getShape((int) (short) 100);
        shapeList15.clear();
        int int26 = shapeList15.size();
        java.awt.Shape shape28 = null;
        shapeList15.setShape((int) '#', shape28);
        int int30 = shapeList15.size();
        java.awt.Shape shape32 = null;
        shapeList15.setShape(0, shape32);
        boolean boolean34 = shapeList0.equals((java.lang.Object) shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
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
        shapeList4.clear();
        java.awt.Shape shape22 = null;
        shapeList4.setShape(100, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape(101, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
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
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        java.awt.Shape shape21 = shapeList17.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        boolean boolean26 = shapeList17.equals((java.lang.Object) int25);
        java.awt.Shape shape28 = shapeList17.getShape(0);
        java.awt.Shape shape30 = shapeList17.getShape(0);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        int int32 = shapeList31.size();
        int int33 = shapeList31.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        java.lang.Object obj36 = shapeList34.clone();
        int int37 = shapeList34.size();
        java.lang.Object obj38 = shapeList34.clone();
        boolean boolean39 = shapeList31.equals((java.lang.Object) shapeList34);
        java.lang.Object obj40 = shapeList34.clone();
        boolean boolean41 = shapeList17.equals(obj40);
        java.lang.Object obj42 = shapeList17.clone();
        int int43 = shapeList17.size();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        int int46 = shapeList44.size();
        boolean boolean47 = shapeList17.equals((java.lang.Object) int46);
        int int48 = shapeList17.size();
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(11, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(99, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        boolean boolean18 = shapeList11.equals((java.lang.Object) (short) 100);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape22 = null;
        shapeList11.setShape((int) (short) 10, shape22);
        shapeList11.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList11);
        java.lang.Object obj26 = shapeList11.clone();
        java.awt.Shape shape28 = null;
        shapeList11.setShape(35, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '4', shape2);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        shapeList4.clear();
        shapeList4.clear();
        int int10 = shapeList4.size();
        java.awt.Shape shape12 = shapeList4.getShape((-1));
        shapeList4.clear();
        int int14 = shapeList4.size();
        java.awt.Shape shape16 = null;
        shapeList4.setShape(8, shape16);
        shapeList4.clear();
        shapeList4.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape((int) (byte) 100);
        shapeList20.clear();
        int int25 = shapeList20.size();
        int int26 = shapeList20.size();
        int int27 = shapeList20.size();
        boolean boolean28 = shapeList4.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape30 = shapeList4.getShape((int) (short) -1);
        java.awt.Shape shape32 = shapeList4.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        java.awt.Shape shape36 = shapeList33.getShape(0);
        boolean boolean38 = shapeList33.equals((java.lang.Object) ' ');
        shapeList33.clear();
        int int40 = shapeList33.size();
        shapeList33.clear();
        java.awt.Shape shape43 = shapeList33.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.awt.Shape shape47 = shapeList44.getShape(0);
        shapeList44.clear();
        shapeList44.clear();
        java.awt.Shape shape51 = shapeList44.getShape((-1));
        java.awt.Shape shape53 = shapeList44.getShape((int) (short) 100);
        boolean boolean54 = shapeList33.equals((java.lang.Object) shapeList44);
        boolean boolean55 = shapeList4.equals((java.lang.Object) shapeList33);
        int int56 = shapeList4.size();
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        boolean boolean18 = shapeList13.equals((java.lang.Object) ' ');
        shapeList13.clear();
        int int20 = shapeList13.size();
        shapeList13.clear();
        java.lang.Object obj22 = shapeList13.clone();
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
        java.lang.Object obj44 = shapeList23.clone();
        boolean boolean45 = shapeList13.equals(obj44);
        int int46 = shapeList13.size();
        java.awt.Shape shape48 = shapeList13.getShape(0);
        java.lang.Object obj49 = shapeList13.clone();
        int int50 = shapeList13.size();
        java.lang.Object obj51 = shapeList13.clone();
        boolean boolean52 = shapeList0.equals((java.lang.Object) shapeList13);
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
        int int65 = shapeList53.size();
        java.awt.Shape shape67 = shapeList53.getShape((int) (byte) 10);
        int int68 = shapeList53.size();
        java.awt.Shape shape70 = shapeList53.getShape(11);
        java.awt.Shape shape72 = shapeList53.getShape((int) (byte) -1);
        java.lang.Object obj73 = shapeList53.clone();
        boolean boolean74 = shapeList0.equals((java.lang.Object) shapeList53);
        java.awt.Shape shape76 = null;
        shapeList0.setShape((int) (byte) 100, shape76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
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
        shapeList0.setShape(11, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        int int14 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.lang.Object obj17 = shapeList15.clone();
        int int18 = shapeList15.size();
        java.lang.Object obj19 = shapeList15.clone();
        boolean boolean20 = shapeList12.equals((java.lang.Object) shapeList15);
        boolean boolean22 = shapeList12.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape(0);
        boolean boolean28 = shapeList23.equals((java.lang.Object) ' ');
        shapeList23.clear();
        int int30 = shapeList23.size();
        java.lang.Class<?> wildcardClass31 = shapeList23.getClass();
        boolean boolean32 = shapeList12.equals((java.lang.Object) shapeList23);
        boolean boolean33 = shapeList0.equals((java.lang.Object) boolean32);
        int int34 = shapeList0.size();
        java.awt.Shape shape36 = null;
        shapeList0.setShape((int) (byte) 100, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        boolean boolean6 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(34, shape8);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        int int12 = shapeList10.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.lang.Object obj15 = shapeList13.clone();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        boolean boolean18 = shapeList10.equals((java.lang.Object) shapeList13);
        java.lang.Object obj19 = shapeList10.clone();
        shapeList10.clear();
        int int21 = shapeList10.size();
        int int22 = shapeList10.size();
        shapeList10.clear();
        java.awt.Shape shape25 = shapeList10.getShape(36);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        shapeList0.clear();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape(101);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.awt.Shape shape13 = shapeList10.getShape((int) (byte) 100);
        java.awt.Shape shape15 = shapeList10.getShape(33);
        shapeList10.clear();
        java.lang.Object obj17 = shapeList10.clone();
        int int18 = shapeList10.size();
        java.awt.Shape shape20 = shapeList10.getShape((int) (short) 100);
        int int21 = shapeList10.size();
        shapeList10.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(10, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
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
        java.lang.Object obj13 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        int int20 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 0);
        java.lang.Object obj24 = shapeList21.clone();
        boolean boolean25 = shapeList14.equals(obj24);
        int int26 = shapeList14.size();
        java.awt.Shape shape28 = shapeList14.getShape((int) (byte) 10);
        java.awt.Shape shape30 = shapeList14.getShape(101);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape33 = null;
        shapeList14.setShape((int) (byte) 10, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
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
        java.awt.Shape shape15 = shapeList12.getShape(0);
        boolean boolean17 = shapeList12.equals((java.lang.Object) ' ');
        java.awt.Shape shape19 = shapeList12.getShape((-1));
        shapeList12.clear();
        java.awt.Shape shape22 = shapeList12.getShape((int) (byte) 100);
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        java.awt.Shape shape27 = shapeList24.getShape(0);
        shapeList24.clear();
        shapeList24.clear();
        java.awt.Shape shape31 = shapeList24.getShape((int) 'a');
        java.lang.Object obj32 = shapeList24.clone();
        java.awt.Shape shape34 = shapeList24.getShape((int) '4');
        int int35 = shapeList24.size();
        shapeList24.clear();
        int int37 = shapeList24.size();
        java.awt.Shape shape39 = shapeList24.getShape((int) '4');
        boolean boolean40 = shapeList12.equals((java.lang.Object) shapeList24);
        int int41 = shapeList24.size();
        boolean boolean42 = shapeList0.equals((java.lang.Object) shapeList24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
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
        shapeList0.setShape(35, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape20 = shapeList13.getShape((-1));
        java.awt.Shape shape22 = null;
        shapeList13.setShape((int) 'a', shape22);
        java.lang.Object obj24 = shapeList13.clone();
        int int25 = shapeList13.size();
        java.lang.Object obj26 = shapeList13.clone();
        boolean boolean27 = shapeList0.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        java.awt.Shape shape13 = shapeList0.getShape(11);
        java.awt.Shape shape15 = shapeList0.getShape(33);
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
        shapeList25.clear();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape42 = null;
        shapeList0.setShape(3, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
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
        java.lang.Object obj34 = shapeList0.clone();
        java.lang.Object obj35 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.awt.Shape shape39 = shapeList36.getShape(0);
        boolean boolean41 = shapeList36.equals((java.lang.Object) ' ');
        java.awt.Shape shape43 = shapeList36.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.awt.Shape shape47 = shapeList44.getShape(0);
        shapeList44.clear();
        int int49 = shapeList44.size();
        java.lang.Class<?> wildcardClass50 = shapeList44.getClass();
        boolean boolean51 = shapeList36.equals((java.lang.Object) wildcardClass50);
        boolean boolean52 = shapeList0.equals((java.lang.Object) boolean51);
        java.awt.Shape shape54 = null;
        shapeList0.setShape(1, shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
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
        java.lang.Object obj13 = shapeList6.clone();
        java.awt.Shape shape15 = shapeList6.getShape((-1));
        java.awt.Shape shape17 = shapeList6.getShape(0);
        int int18 = shapeList6.size();
        java.awt.Shape shape20 = null;
        shapeList6.setShape(0, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(0, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        java.awt.Shape shape16 = shapeList13.getShape(0);
        shapeList13.clear();
        shapeList13.clear();
        int int19 = shapeList13.size();
        shapeList13.clear();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
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
        shapeList30.setShape((int) (short) 100, shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList30", shapeList0.equals(shapeList30) ? shapeList0.hashCode() == shapeList30.hashCode() : true);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 1, shape8);
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        java.awt.Shape shape14 = shapeList11.getShape(0);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape18 = shapeList11.getShape((int) 'a');
        java.awt.Shape shape20 = shapeList11.getShape((-1));
        shapeList11.clear();
        java.awt.Shape shape23 = shapeList11.getShape((int) (short) 0);
        java.lang.Object obj24 = shapeList11.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
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
        int int24 = shapeList0.size();
        int int25 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        boolean boolean31 = shapeList26.equals((java.lang.Object) ' ');
        java.awt.Shape shape33 = shapeList26.getShape((-1));
        shapeList26.clear();
        java.awt.Shape shape36 = shapeList26.getShape((int) (byte) 100);
        java.awt.Shape shape38 = shapeList26.getShape(8);
        java.awt.Shape shape40 = null;
        shapeList26.setShape(0, shape40);
        int int42 = shapeList26.size();
        java.lang.Class<?> wildcardClass43 = shapeList26.getClass();
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList2 = new org.jfree.chart.util.ShapeList();
        boolean boolean4 = shapeList2.equals((java.lang.Object) 100);
        java.awt.Shape shape6 = shapeList2.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) 100);
        int int10 = shapeList7.size();
        boolean boolean11 = shapeList2.equals((java.lang.Object) int10);
        java.awt.Shape shape13 = shapeList2.getShape(0);
        java.lang.Object obj14 = shapeList2.clone();
        java.lang.Class<?> wildcardClass15 = shapeList2.getClass();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList2);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        int int20 = shapeList17.size();
        int int21 = shapeList17.size();
        java.awt.Shape shape23 = shapeList17.getShape((int) 'a');
        shapeList17.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        java.awt.Shape shape28 = shapeList25.getShape(0);
        boolean boolean30 = shapeList25.equals((java.lang.Object) ' ');
        shapeList25.clear();
        int int32 = shapeList25.size();
        shapeList25.clear();
        java.awt.Shape shape35 = shapeList25.getShape((-1));
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        java.awt.Shape shape39 = shapeList36.getShape(0);
        shapeList36.clear();
        shapeList36.clear();
        java.awt.Shape shape43 = shapeList36.getShape((-1));
        java.awt.Shape shape45 = shapeList36.getShape((int) (short) 100);
        boolean boolean46 = shapeList25.equals((java.lang.Object) shapeList36);
        boolean boolean47 = shapeList17.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape49 = shapeList17.getShape((int) ' ');
        java.awt.Shape shape51 = shapeList17.getShape((int) '#');
        boolean boolean52 = shapeList0.equals((java.lang.Object) shape51);
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        java.awt.Shape shape56 = shapeList53.getShape(0);
        shapeList53.clear();
        shapeList53.clear();
        int int59 = shapeList53.size();
        java.awt.Shape shape61 = shapeList53.getShape((-1));
        java.lang.Object obj62 = shapeList53.clone();
        shapeList53.clear();
        boolean boolean64 = shapeList0.equals((java.lang.Object) shapeList53);
        java.awt.Shape shape66 = shapeList0.getShape(1);
        java.awt.Shape shape68 = null;
        shapeList0.setShape(101, shape68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList2", shapeList0.equals(shapeList2) ? shapeList0.hashCode() == shapeList2.hashCode() : true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) 100);
        int int18 = shapeList15.size();
        java.awt.Shape shape20 = shapeList15.getShape((int) '#');
        java.awt.Shape shape22 = shapeList15.getShape((int) (short) 1);
        java.awt.Shape shape24 = null;
        shapeList15.setShape(8, shape24);
        int int26 = shapeList15.size();
        boolean boolean27 = shapeList0.equals((java.lang.Object) int26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = shapeList14.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) 100);
        boolean boolean24 = shapeList14.equals((java.lang.Object) shapeList21);
        java.awt.Shape shape26 = shapeList21.getShape((int) (short) -1);
        java.lang.Object obj27 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape30 = shapeList21.getShape(34);
        boolean boolean31 = shapeList0.equals((java.lang.Object) 34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
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
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        java.awt.Shape shape20 = shapeList17.getShape(0);
        boolean boolean22 = shapeList17.equals((java.lang.Object) ' ');
        shapeList17.clear();
        int int24 = shapeList17.size();
        shapeList17.clear();
        java.awt.Shape shape27 = shapeList17.getShape((-1));
        java.awt.Shape shape29 = shapeList17.getShape((-1));
        java.lang.Object obj30 = shapeList17.clone();
        boolean boolean31 = shapeList0.equals(obj30);
        java.awt.Shape shape33 = null;
        shapeList0.setShape(101, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) '4', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
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
        java.awt.Shape shape17 = shapeList0.getShape(101);
        int int18 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        shapeList20.clear();
        shapeList20.clear();
        java.awt.Shape shape27 = shapeList20.getShape((-1));
        java.awt.Shape shape29 = null;
        shapeList20.setShape((int) 'a', shape29);
        java.awt.Shape shape32 = shapeList20.getShape((int) '4');
        java.lang.Object obj33 = shapeList20.clone();
        boolean boolean34 = shapeList0.equals(obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
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
        java.awt.Shape shape18 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape20 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape22 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (byte) 0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
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
        java.lang.Object obj31 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        int int35 = shapeList32.size();
        java.awt.Shape shape37 = shapeList32.getShape((int) '#');
        java.awt.Shape shape39 = shapeList32.getShape((int) (byte) 100);
        int int40 = shapeList32.size();
        java.awt.Shape shape42 = null;
        shapeList32.setShape((int) '4', shape42);
        java.lang.Object obj44 = shapeList32.clone();
        java.lang.Object obj45 = shapeList32.clone();
        boolean boolean46 = shapeList0.equals(obj45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList32", shapeList0.equals(shapeList32) ? shapeList0.hashCode() == shapeList32.hashCode() : true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
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
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        boolean boolean18 = shapeList11.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape20 = shapeList11.getShape((int) '4');
        int int21 = shapeList11.size();
        int int22 = shapeList11.size();
        boolean boolean23 = shapeList0.equals((java.lang.Object) int22);
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 0);
        int int28 = shapeList25.size();
        java.awt.Shape shape30 = shapeList25.getShape((int) (byte) 1);
        boolean boolean31 = shapeList0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        java.lang.Object obj35 = shapeList32.clone();
        java.lang.Object obj36 = shapeList32.clone();
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList32);
        java.awt.Shape shape39 = null;
        shapeList32.setShape(9, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList32", shapeList0.equals(shapeList32) ? shapeList0.hashCode() == shapeList32.hashCode() : true);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape(34, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
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
        shapeList0.setShape(12, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj11", shapeList0.equals(obj11) ? shapeList0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) '4', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        java.awt.Shape shape13 = shapeList9.getShape((int) '#');
        java.awt.Shape shape15 = shapeList9.getShape((int) '4');
        java.awt.Shape shape17 = null;
        shapeList9.setShape((int) (byte) 0, shape17);
        java.lang.Object obj19 = shapeList9.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = shapeList0.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((-1));
        java.awt.Shape shape13 = shapeList0.getShape(11);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape21 = shapeList14.getShape((int) 'a');
        java.lang.Object obj22 = shapeList14.clone();
        java.awt.Shape shape24 = shapeList14.getShape((int) '4');
        shapeList14.clear();
        int int26 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        java.awt.Shape shape31 = shapeList27.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) 100);
        int int35 = shapeList32.size();
        boolean boolean36 = shapeList27.equals((java.lang.Object) int35);
        java.awt.Shape shape38 = shapeList27.getShape(0);
        java.awt.Shape shape40 = shapeList27.getShape(0);
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        int int43 = shapeList41.size();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.lang.Object obj46 = shapeList44.clone();
        int int47 = shapeList44.size();
        java.lang.Object obj48 = shapeList44.clone();
        boolean boolean49 = shapeList41.equals((java.lang.Object) shapeList44);
        java.lang.Object obj50 = shapeList44.clone();
        boolean boolean51 = shapeList27.equals(obj50);
        shapeList27.clear();
        boolean boolean53 = shapeList14.equals((java.lang.Object) shapeList27);
        java.lang.Class<?> wildcardClass54 = shapeList27.getClass();
        boolean boolean55 = shapeList0.equals((java.lang.Object) wildcardClass54);
        shapeList0.clear();
        java.awt.Shape shape58 = null;
        shapeList0.setShape(35, shape58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
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
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        int int47 = shapeList46.size();
        int int48 = shapeList46.size();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        int int51 = shapeList49.size();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        java.lang.Object obj54 = shapeList52.clone();
        int int55 = shapeList52.size();
        java.lang.Object obj56 = shapeList52.clone();
        boolean boolean57 = shapeList49.equals((java.lang.Object) shapeList52);
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        int int59 = shapeList58.size();
        java.lang.Object obj60 = shapeList58.clone();
        int int61 = shapeList58.size();
        shapeList58.clear();
        boolean boolean63 = shapeList49.equals((java.lang.Object) shapeList58);
        int int64 = shapeList49.size();
        java.awt.Shape shape66 = shapeList49.getShape(98);
        org.jfree.chart.util.ShapeList shapeList67 = new org.jfree.chart.util.ShapeList();
        boolean boolean69 = shapeList67.equals((java.lang.Object) 100);
        int int70 = shapeList67.size();
        shapeList67.clear();
        shapeList67.clear();
        java.awt.Shape shape74 = shapeList67.getShape(100);
        java.lang.Object obj75 = shapeList67.clone();
        boolean boolean77 = shapeList67.equals((java.lang.Object) 1.0f);
        java.lang.Object obj78 = shapeList67.clone();
        boolean boolean79 = shapeList49.equals((java.lang.Object) shapeList67);
        boolean boolean80 = shapeList46.equals((java.lang.Object) boolean79);
        java.lang.Class<?> wildcardClass81 = shapeList46.getClass();
        boolean boolean82 = shapeList0.equals((java.lang.Object) shapeList46);
        java.awt.Shape shape84 = null;
        shapeList46.setShape((int) (short) 1, shape84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList46", shapeList0.equals(shapeList46) ? shapeList0.hashCode() == shapeList46.hashCode() : true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
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
        java.awt.Shape shape59 = shapeList23.getShape((int) (short) -1);
        java.awt.Shape shape61 = shapeList23.getShape(0);
        java.awt.Shape shape63 = shapeList23.getShape(101);
        java.awt.Shape shape65 = null;
        shapeList23.setShape(99, shape65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape6 = shapeList0.getShape(8);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) 100);
        int int15 = shapeList12.size();
        boolean boolean17 = shapeList12.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        boolean boolean25 = shapeList20.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.lang.Object obj28 = shapeList26.clone();
        int int29 = shapeList26.size();
        java.lang.Object obj30 = shapeList26.clone();
        boolean boolean31 = shapeList20.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape33 = shapeList26.getShape((int) (short) 1);
        boolean boolean34 = shapeList12.equals((java.lang.Object) shape33);
        int int35 = shapeList12.size();
        java.lang.Object obj36 = shapeList12.clone();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = shapeList0.equals(obj36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
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
        java.lang.Object obj10 = shapeList3.clone();
        java.awt.Shape shape12 = null;
        shapeList3.setShape((int) '4', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
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
        org.jfree.chart.util.ShapeList shapeList50 = new org.jfree.chart.util.ShapeList();
        int int51 = shapeList50.size();
        int int52 = shapeList50.size();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        java.lang.Object obj55 = shapeList53.clone();
        int int56 = shapeList53.size();
        java.lang.Object obj57 = shapeList53.clone();
        boolean boolean58 = shapeList50.equals((java.lang.Object) shapeList53);
        java.lang.Object obj59 = shapeList50.clone();
        shapeList50.clear();
        int int61 = shapeList50.size();
        int int62 = shapeList50.size();
        shapeList50.clear();
        boolean boolean64 = shapeList0.equals((java.lang.Object) shapeList50);
        java.awt.Shape shape66 = null;
        shapeList0.setShape(3, shape66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
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
        java.awt.Shape shape31 = null;
        shapeList20.setShape(10, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        int int5 = shapeList4.size();
        java.awt.Shape shape7 = shapeList4.getShape(0);
        shapeList4.clear();
        shapeList4.clear();
        int int10 = shapeList4.size();
        java.awt.Shape shape12 = shapeList4.getShape((-1));
        java.lang.Object obj13 = shapeList4.clone();
        shapeList4.clear();
        java.lang.Object obj15 = shapeList4.clone();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList4);
        int int17 = shapeList4.size();
        java.lang.Object obj18 = shapeList4.clone();
        java.awt.Shape shape20 = null;
        shapeList4.setShape((int) (byte) 100, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
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
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape(0);
        shapeList12.clear();
        shapeList12.clear();
        int int18 = shapeList12.size();
        int int19 = shapeList12.size();
        int int20 = shapeList12.size();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        java.lang.Object obj23 = shapeList21.clone();
        int int24 = shapeList21.size();
        java.lang.Object obj25 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape28 = shapeList21.getShape((int) (short) 100);
        boolean boolean30 = shapeList21.equals((java.lang.Object) 10L);
        shapeList21.clear();
        shapeList21.clear();
        java.awt.Shape shape34 = shapeList21.getShape(0);
        java.awt.Shape shape36 = shapeList21.getShape(100);
        boolean boolean37 = shapeList12.equals((java.lang.Object) 100);
        shapeList12.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape41 = null;
        shapeList0.setShape((int) '#', shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape(53);
        int int13 = shapeList0.size();
        int int14 = shapeList0.size();
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
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        boolean boolean30 = shapeList15.equals((java.lang.Object) int29);
        java.awt.Shape shape32 = shapeList15.getShape((int) (short) 100);
        shapeList15.clear();
        java.awt.Shape shape35 = shapeList15.getShape((int) (byte) 100);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape38 = null;
        shapeList0.setShape(35, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        boolean boolean13 = shapeList8.equals((java.lang.Object) ' ');
        shapeList8.clear();
        int int15 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape18 = null;
        shapeList8.setShape((int) 'a', shape18);
        java.lang.Object obj20 = shapeList8.clone();
        java.awt.Shape shape22 = shapeList8.getShape(33);
        int int23 = shapeList8.size();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) '#', shape9);
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        int int13 = shapeList12.size();
        java.awt.Shape shape15 = shapeList12.getShape((int) (byte) 100);
        shapeList12.clear();
        int int17 = shapeList12.size();
        int int18 = shapeList12.size();
        int int19 = shapeList12.size();
        shapeList12.clear();
        int int21 = shapeList12.size();
        int int22 = shapeList12.size();
        java.lang.Object obj23 = shapeList12.clone();
        java.lang.Object obj24 = shapeList12.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
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
        shapeList3.clear();
        shapeList3.clear();
        java.awt.Shape shape18 = null;
        shapeList3.setShape(9, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(34, shape5);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        shapeList7.clear();
        shapeList7.clear();
        int int13 = shapeList7.size();
        java.awt.Shape shape15 = shapeList7.getShape((-1));
        shapeList7.clear();
        int int17 = shapeList7.size();
        java.awt.Shape shape19 = null;
        shapeList7.setShape(8, shape19);
        shapeList7.clear();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        java.awt.Shape shape26 = shapeList23.getShape((int) (byte) 100);
        shapeList23.clear();
        int int28 = shapeList23.size();
        int int29 = shapeList23.size();
        int int30 = shapeList23.size();
        boolean boolean31 = shapeList7.equals((java.lang.Object) shapeList23);
        int int32 = shapeList7.size();
        shapeList7.clear();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        int int7 = shapeList5.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.lang.Object obj10 = shapeList8.clone();
        int int11 = shapeList8.size();
        java.lang.Object obj12 = shapeList8.clone();
        boolean boolean13 = shapeList5.equals((java.lang.Object) shapeList8);
        java.lang.Object obj14 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape17 = shapeList5.getShape(33);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 33);
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 1, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
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
        java.lang.Object obj17 = shapeList8.clone();
        java.awt.Shape shape19 = shapeList8.getShape((int) '#');
        java.lang.Object obj20 = shapeList8.clone();
        java.lang.Class<?> wildcardClass21 = shapeList8.getClass();
        boolean boolean22 = shapeList0.equals((java.lang.Object) wildcardClass21);
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) ' ', shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        int int5 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        int int8 = shapeList6.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.lang.Object obj11 = shapeList9.clone();
        int int12 = shapeList9.size();
        java.lang.Object obj13 = shapeList9.clone();
        boolean boolean14 = shapeList6.equals((java.lang.Object) shapeList9);
        java.lang.Object obj15 = shapeList6.clone();
        java.lang.Class<?> wildcardClass16 = shapeList6.getClass();
        boolean boolean17 = shapeList0.equals((java.lang.Object) wildcardClass16);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        boolean boolean18 = shapeList11.equals((java.lang.Object) (short) 100);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape22 = null;
        shapeList11.setShape((int) (short) 10, shape22);
        shapeList11.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        java.awt.Shape shape29 = shapeList26.getShape(0);
        boolean boolean31 = shapeList26.equals((java.lang.Object) ' ');
        int int32 = shapeList26.size();
        java.awt.Shape shape34 = shapeList26.getShape(53);
        boolean boolean35 = shapeList11.equals((java.lang.Object) 53);
        java.awt.Shape shape37 = null;
        shapeList11.setShape(9, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) 100);
        java.awt.Shape shape29 = shapeList25.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) 100);
        int int33 = shapeList30.size();
        boolean boolean34 = shapeList25.equals((java.lang.Object) int33);
        java.awt.Shape shape36 = shapeList25.getShape(0);
        java.awt.Shape shape38 = shapeList25.getShape(0);
        int int39 = shapeList25.size();
        int int40 = shapeList25.size();
        boolean boolean41 = shapeList0.equals((java.lang.Object) int40);
        java.lang.Object obj42 = shapeList0.clone();
        java.lang.Object obj43 = shapeList0.clone();
        java.awt.Shape shape45 = null;
        shapeList0.setShape(101, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
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
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = null;
        shapeList0.setShape(33, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        int int6 = shapeList5.size();
        java.awt.Shape shape8 = shapeList5.getShape(0);
        boolean boolean10 = shapeList5.equals((java.lang.Object) ' ');
        java.awt.Shape shape12 = shapeList5.getShape((-1));
        shapeList5.clear();
        java.awt.Shape shape15 = shapeList5.getShape(101);
        boolean boolean16 = shapeList0.equals((java.lang.Object) shape15);
        java.awt.Shape shape18 = null;
        shapeList0.setShape(0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '4');
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(53, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        int int5 = shapeList0.size();
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape(11);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        java.awt.Shape shape14 = shapeList9.getShape(98);
        shapeList9.clear();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList9);
        shapeList9.clear();
        java.awt.Shape shape19 = null;
        shapeList9.setShape((int) (short) 10, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
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
        java.awt.Shape shape16 = shapeList0.getShape(9);
        java.awt.Shape shape18 = shapeList0.getShape(101);
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) '#', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        boolean boolean12 = shapeList7.equals((java.lang.Object) ' ');
        shapeList7.clear();
        int int14 = shapeList7.size();
        shapeList7.clear();
        java.awt.Shape shape17 = shapeList7.getShape((-1));
        java.awt.Shape shape19 = shapeList7.getShape((-1));
        java.awt.Shape shape21 = null;
        shapeList7.setShape(98, shape21);
        boolean boolean23 = shapeList0.equals((java.lang.Object) 98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        java.awt.Shape shape12 = shapeList9.getShape(0);
        boolean boolean14 = shapeList9.equals((java.lang.Object) ' ');
        shapeList9.clear();
        int int16 = shapeList9.size();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        boolean boolean23 = shapeList18.equals((java.lang.Object) (byte) 0);
        boolean boolean25 = shapeList18.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape27 = shapeList18.getShape(0);
        shapeList18.clear();
        boolean boolean29 = shapeList9.equals((java.lang.Object) shapeList18);
        java.lang.Object obj30 = shapeList9.clone();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        int int32 = shapeList31.size();
        int int33 = shapeList31.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        java.lang.Object obj36 = shapeList34.clone();
        int int37 = shapeList34.size();
        java.lang.Object obj38 = shapeList34.clone();
        boolean boolean39 = shapeList31.equals((java.lang.Object) shapeList34);
        java.lang.Object obj40 = shapeList31.clone();
        boolean boolean41 = shapeList9.equals((java.lang.Object) shapeList31);
        int int42 = shapeList31.size();
        java.lang.Object obj43 = shapeList31.clone();
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList31);
        int int45 = shapeList0.size();
        java.awt.Shape shape47 = null;
        shapeList0.setShape((int) (byte) 100, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
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
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape(2);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        java.lang.Object obj18 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        shapeList19.clear();
        int int21 = shapeList19.size();
        boolean boolean22 = shapeList13.equals((java.lang.Object) shapeList19);
        java.lang.Object obj23 = shapeList19.clone();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape26 = null;
        shapeList19.setShape((int) 'a', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        int int12 = shapeList0.size();
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
        shapeList13.clear();
        shapeList13.clear();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        java.awt.Shape shape19 = shapeList14.getShape(33);
        java.lang.Object obj20 = shapeList14.clone();
        java.awt.Shape shape22 = shapeList14.getShape((int) (byte) -1);
        boolean boolean23 = shapeList0.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = shapeList0.clone();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (byte) 0, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
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
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) ' ', shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
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
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) ' ', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
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
        java.awt.Shape shape60 = null;
        shapeList25.setShape(8, shape60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
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
        shapeList0.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
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
        java.lang.Object obj41 = shapeList15.clone();
        boolean boolean42 = shapeList0.equals(obj41);
        shapeList0.clear();
        java.awt.Shape shape45 = null;
        shapeList0.setShape(33, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
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
        java.awt.Shape shape18 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape20 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape22 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape24 = null;
        shapeList0.setShape(100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(12, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
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
        int int16 = shapeList0.size();
        java.lang.Object obj17 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) '4', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) true);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList0.equals(obj13);
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (byte) 10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (byte) 0, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
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
        shapeList3.clear();
        java.awt.Shape shape15 = shapeList3.getShape((int) '#');
        java.awt.Shape shape17 = null;
        shapeList3.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
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
        java.awt.Shape shape16 = null;
        shapeList3.setShape((int) (short) 10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
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
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) '4', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
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
        java.awt.Shape shape13 = shapeList10.getShape(0);
        shapeList10.clear();
        shapeList10.clear();
        java.awt.Shape shape17 = shapeList10.getShape((-1));
        shapeList10.clear();
        java.awt.Shape shape20 = shapeList10.getShape(1);
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 0);
        int int25 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        int int28 = shapeList26.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.lang.Object obj31 = shapeList29.clone();
        int int32 = shapeList29.size();
        java.lang.Object obj33 = shapeList29.clone();
        boolean boolean34 = shapeList26.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        java.lang.Object obj37 = shapeList35.clone();
        int int38 = shapeList35.size();
        shapeList35.clear();
        boolean boolean40 = shapeList26.equals((java.lang.Object) shapeList35);
        boolean boolean41 = shapeList22.equals((java.lang.Object) shapeList26);
        boolean boolean42 = shapeList10.equals((java.lang.Object) shapeList26);
        boolean boolean43 = shapeList0.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape45 = null;
        shapeList26.setShape((int) (byte) 0, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
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
        java.awt.Shape shape41 = null;
        shapeList0.setShape(99, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) 100);
        int int12 = shapeList9.size();
        boolean boolean14 = shapeList9.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = shapeList9.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) 100);
        boolean boolean19 = shapeList9.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape21 = shapeList9.getShape((int) (short) 1);
        java.awt.Shape shape23 = shapeList9.getShape(1);
        java.lang.Object obj24 = shapeList9.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
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
        java.lang.Object obj24 = shapeList0.clone();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (short) 100, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
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
        shapeList0.setShape(11, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
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
        java.lang.Object obj14 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape23 = shapeList15.getShape((int) '4');
        shapeList15.clear();
        boolean boolean26 = shapeList15.equals((java.lang.Object) true);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape34 = shapeList27.getShape((int) 'a');
        java.lang.Object obj35 = shapeList27.clone();
        java.awt.Shape shape37 = shapeList27.getShape((int) '4');
        shapeList27.clear();
        int int39 = shapeList27.size();
        java.lang.Object obj40 = shapeList27.clone();
        boolean boolean41 = shapeList15.equals((java.lang.Object) shapeList27);
        shapeList15.clear();
        boolean boolean43 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
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
        shapeList0.setShape((int) 'a', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
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
        int int26 = shapeList0.size();
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) (short) 0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        java.awt.Shape shape32 = shapeList29.getShape((int) (byte) 100);
        shapeList29.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        int int35 = shapeList34.size();
        int int36 = shapeList34.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        java.lang.Object obj39 = shapeList37.clone();
        int int40 = shapeList37.size();
        java.lang.Object obj41 = shapeList37.clone();
        boolean boolean42 = shapeList34.equals((java.lang.Object) shapeList37);
        shapeList34.clear();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        int int45 = shapeList44.size();
        java.lang.Object obj46 = shapeList44.clone();
        int int47 = shapeList44.size();
        java.lang.Object obj48 = shapeList44.clone();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        boolean boolean50 = shapeList34.equals(obj48);
        java.awt.Shape shape52 = shapeList34.getShape(100);
        shapeList34.clear();
        int int54 = shapeList34.size();
        boolean boolean55 = shapeList29.equals((java.lang.Object) shapeList34);
        int int56 = shapeList34.size();
        int int57 = shapeList34.size();
        boolean boolean58 = shapeList3.equals((java.lang.Object) shapeList34);
        java.lang.Object obj59 = shapeList3.clone();
        java.awt.Shape shape61 = null;
        shapeList3.setShape((int) (byte) 100, shape61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 0, shape5);
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        java.awt.Shape shape11 = shapeList8.getShape(0);
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape15 = shapeList8.getShape((-1));
        java.awt.Shape shape17 = null;
        shapeList8.setShape((int) 'a', shape17);
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) 100);
        int int23 = shapeList20.size();
        shapeList20.clear();
        shapeList20.clear();
        java.awt.Shape shape27 = shapeList20.getShape(100);
        java.lang.Object obj28 = shapeList20.clone();
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList20);
        java.lang.Class<?> wildcardClass30 = shapeList20.getClass();
        boolean boolean31 = shapeList0.equals((java.lang.Object) wildcardClass30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
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
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        java.awt.Shape shape26 = shapeList22.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        int int30 = shapeList27.size();
        boolean boolean31 = shapeList22.equals((java.lang.Object) int30);
        java.awt.Shape shape33 = shapeList22.getShape(0);
        java.awt.Shape shape35 = shapeList22.getShape(0);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        int int37 = shapeList36.size();
        int int38 = shapeList36.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        java.lang.Object obj41 = shapeList39.clone();
        int int42 = shapeList39.size();
        java.lang.Object obj43 = shapeList39.clone();
        boolean boolean44 = shapeList36.equals((java.lang.Object) shapeList39);
        java.lang.Object obj45 = shapeList39.clone();
        boolean boolean46 = shapeList22.equals(obj45);
        java.lang.Object obj47 = shapeList22.clone();
        int int48 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        int int50 = shapeList49.size();
        int int51 = shapeList49.size();
        boolean boolean52 = shapeList22.equals((java.lang.Object) int51);
        int int53 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        int int55 = shapeList54.size();
        java.lang.Object obj56 = shapeList54.clone();
        boolean boolean57 = shapeList22.equals((java.lang.Object) shapeList54);
        java.lang.Class<?> wildcardClass58 = shapeList54.getClass();
        boolean boolean59 = shapeList0.equals((java.lang.Object) shapeList54);
        java.awt.Shape shape61 = shapeList0.getShape(0);
        java.awt.Shape shape63 = null;
        shapeList0.setShape(2, shape63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape5 = shapeList0.getShape(33);
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(11, shape8);
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        boolean boolean25 = shapeList23.equals((java.lang.Object) 100);
        java.awt.Shape shape27 = shapeList23.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        int int31 = shapeList28.size();
        boolean boolean32 = shapeList23.equals((java.lang.Object) int31);
        java.awt.Shape shape34 = shapeList23.getShape(0);
        java.awt.Shape shape36 = shapeList23.getShape(0);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        int int39 = shapeList37.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        java.lang.Object obj42 = shapeList40.clone();
        int int43 = shapeList40.size();
        java.lang.Object obj44 = shapeList40.clone();
        boolean boolean45 = shapeList37.equals((java.lang.Object) shapeList40);
        java.lang.Object obj46 = shapeList40.clone();
        boolean boolean47 = shapeList23.equals(obj46);
        shapeList23.clear();
        boolean boolean49 = shapeList10.equals((java.lang.Object) shapeList23);
        org.jfree.chart.util.ShapeList shapeList50 = new org.jfree.chart.util.ShapeList();
        int int51 = shapeList50.size();
        int int52 = shapeList50.size();
        int int53 = shapeList50.size();
        int int54 = shapeList50.size();
        shapeList50.clear();
        int int56 = shapeList50.size();
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        int int58 = shapeList57.size();
        java.lang.Object obj59 = shapeList57.clone();
        int int60 = shapeList57.size();
        java.lang.Object obj61 = shapeList57.clone();
        shapeList57.clear();
        java.awt.Shape shape64 = shapeList57.getShape(100);
        boolean boolean65 = shapeList50.equals((java.lang.Object) shapeList57);
        boolean boolean66 = shapeList10.equals((java.lang.Object) boolean65);
        java.lang.Object obj67 = shapeList10.clone();
        int int68 = shapeList10.size();
        java.lang.Object obj69 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList70 = new org.jfree.chart.util.ShapeList();
        int int71 = shapeList70.size();
        int int72 = shapeList70.size();
        org.jfree.chart.util.ShapeList shapeList73 = new org.jfree.chart.util.ShapeList();
        int int74 = shapeList73.size();
        java.lang.Object obj75 = shapeList73.clone();
        int int76 = shapeList73.size();
        java.lang.Object obj77 = shapeList73.clone();
        boolean boolean78 = shapeList70.equals((java.lang.Object) shapeList73);
        java.awt.Shape shape80 = shapeList73.getShape((int) (byte) 10);
        boolean boolean81 = shapeList10.equals((java.lang.Object) (byte) 10);
        boolean boolean82 = shapeList0.equals((java.lang.Object) boolean81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(100, shape13);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        boolean boolean20 = shapeList15.equals((java.lang.Object) ' ');
        shapeList15.clear();
        int int22 = shapeList15.size();
        shapeList15.clear();
        java.lang.Object obj24 = shapeList15.clone();
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
        boolean boolean47 = shapeList15.equals(obj46);
        int int48 = shapeList15.size();
        java.awt.Shape shape50 = shapeList15.getShape(8);
        int int51 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        int int53 = shapeList52.size();
        java.awt.Shape shape55 = shapeList52.getShape(0);
        shapeList52.clear();
        shapeList52.clear();
        int int58 = shapeList52.size();
        java.awt.Shape shape60 = shapeList52.getShape((-1));
        shapeList52.clear();
        int int62 = shapeList52.size();
        java.awt.Shape shape64 = null;
        shapeList52.setShape(8, shape64);
        shapeList52.clear();
        java.awt.Shape shape68 = shapeList52.getShape(9);
        boolean boolean69 = shapeList15.equals((java.lang.Object) shapeList52);
        int int70 = shapeList15.size();
        java.lang.Object obj71 = shapeList15.clone();
        boolean boolean72 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        int int16 = shapeList15.size();
        java.awt.Shape shape18 = shapeList15.getShape(0);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape22 = shapeList15.getShape((int) 'a');
        java.lang.Object obj23 = shapeList15.clone();
        java.awt.Shape shape25 = shapeList15.getShape((int) '4');
        shapeList15.clear();
        int int27 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) 100);
        java.awt.Shape shape32 = shapeList28.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) 100);
        int int36 = shapeList33.size();
        boolean boolean37 = shapeList28.equals((java.lang.Object) int36);
        java.awt.Shape shape39 = shapeList28.getShape(0);
        java.awt.Shape shape41 = shapeList28.getShape(0);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        int int43 = shapeList42.size();
        int int44 = shapeList42.size();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        int int46 = shapeList45.size();
        java.lang.Object obj47 = shapeList45.clone();
        int int48 = shapeList45.size();
        java.lang.Object obj49 = shapeList45.clone();
        boolean boolean50 = shapeList42.equals((java.lang.Object) shapeList45);
        java.lang.Object obj51 = shapeList45.clone();
        boolean boolean52 = shapeList28.equals(obj51);
        shapeList28.clear();
        boolean boolean54 = shapeList15.equals((java.lang.Object) shapeList28);
        java.awt.Shape shape56 = shapeList15.getShape((int) '#');
        java.lang.Object obj57 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        boolean boolean60 = shapeList58.equals((java.lang.Object) 100);
        java.awt.Shape shape62 = shapeList58.getShape((int) '#');
        boolean boolean63 = shapeList15.equals((java.lang.Object) shapeList58);
        boolean boolean64 = shapeList0.equals((java.lang.Object) boolean63);
        java.awt.Shape shape66 = null;
        shapeList0.setShape(100, shape66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
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
        java.awt.Shape shape21 = null;
        shapeList0.setShape(9, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
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
        shapeList22.setShape(1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
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
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        java.awt.Shape shape44 = shapeList41.getShape(0);
        shapeList41.clear();
        shapeList41.clear();
        int int47 = shapeList41.size();
        java.awt.Shape shape49 = shapeList41.getShape((-1));
        shapeList41.clear();
        int int51 = shapeList41.size();
        java.awt.Shape shape53 = null;
        shapeList41.setShape(8, shape53);
        shapeList41.clear();
        shapeList41.clear();
        java.awt.Shape shape58 = shapeList41.getShape(0);
        java.awt.Shape shape60 = null;
        shapeList41.setShape((int) '4', shape60);
        java.lang.Object obj62 = shapeList41.clone();
        boolean boolean63 = shapeList0.equals((java.lang.Object) shapeList41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList41", shapeList0.equals(shapeList41) ? shapeList0.hashCode() == shapeList41.hashCode() : true);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        java.awt.Shape shape21 = shapeList18.getShape(0);
        boolean boolean23 = shapeList18.equals((java.lang.Object) ' ');
        shapeList18.clear();
        int int25 = shapeList18.size();
        shapeList18.clear();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) 100);
        int int30 = shapeList27.size();
        boolean boolean32 = shapeList27.equals((java.lang.Object) (byte) 0);
        boolean boolean34 = shapeList27.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape36 = shapeList27.getShape(0);
        shapeList27.clear();
        boolean boolean38 = shapeList18.equals((java.lang.Object) shapeList27);
        shapeList27.clear();
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape43 = shapeList27.getShape((int) (short) 100);
        java.lang.Object obj44 = shapeList27.clone();
        boolean boolean45 = shapeList0.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape47 = null;
        shapeList27.setShape(101, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        java.awt.Shape shape10 = shapeList7.getShape(0);
        shapeList7.clear();
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape15 = shapeList7.getShape((int) '4');
        boolean boolean16 = shapeList0.equals((java.lang.Object) '4');
        java.awt.Shape shape18 = null;
        shapeList0.setShape(33, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        boolean boolean3 = shapeList0.equals((java.lang.Object) "");
        int int4 = shapeList0.size();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(34, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 1, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
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
        java.lang.Object obj20 = shapeList0.clone();
        java.lang.Object obj21 = shapeList0.clone();
        java.awt.Shape shape23 = null;
        shapeList0.setShape(0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 100, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
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
        shapeList0.setShape((int) ' ', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
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
        java.awt.Shape shape66 = null;
        shapeList40.setShape((int) (short) 0, shape66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList40", shapeList0.equals(shapeList40) ? shapeList0.hashCode() == shapeList40.hashCode() : true);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
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
        shapeList0.clear();
        java.awt.Shape shape28 = null;
        shapeList0.setShape(11, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        int int14 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) 100);
        int int11 = shapeList8.size();
        boolean boolean13 = shapeList8.equals((java.lang.Object) (byte) 0);
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) 1);
        java.lang.Object obj16 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) 100);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        shapeList20.clear();
        shapeList20.clear();
        java.awt.Shape shape27 = shapeList20.getShape((int) 'a');
        java.lang.Object obj28 = shapeList20.clone();
        boolean boolean29 = shapeList17.equals(obj28);
        shapeList17.clear();
        boolean boolean31 = shapeList8.equals((java.lang.Object) shapeList17);
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList17);
        shapeList0.clear();
        java.awt.Shape shape35 = null;
        shapeList0.setShape((int) '#', shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(9);
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(8, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
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
        shapeList7.clear();
        java.lang.Object obj29 = shapeList7.clone();
        java.lang.Object obj30 = shapeList7.clone();
        boolean boolean31 = shapeList0.equals(obj30);
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) (short) 1, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
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
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(8, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(10, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
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
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) 100);
        int int25 = shapeList22.size();
        int int26 = shapeList22.size();
        boolean boolean28 = shapeList22.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = shapeList22.clone();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape32 = null;
        shapeList22.setShape(101, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        int int17 = shapeList14.size();
        boolean boolean19 = shapeList14.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = shapeList14.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape23 = shapeList14.getShape(0);
        java.awt.Shape shape25 = null;
        shapeList14.setShape(100, shape25);
        java.lang.Object obj27 = shapeList14.clone();
        int int28 = shapeList14.size();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(35, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        int int3 = shapeList0.size();
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = shapeList0.equals((java.lang.Object) (short) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) 100);
        int int14 = shapeList11.size();
        boolean boolean16 = shapeList11.equals((java.lang.Object) (byte) 0);
        boolean boolean18 = shapeList11.equals((java.lang.Object) (short) 100);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape22 = null;
        shapeList11.setShape((int) (short) 10, shape22);
        shapeList11.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape27 = null;
        shapeList11.setShape((int) ' ', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
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
        java.lang.Object obj34 = shapeList0.clone();
        java.lang.Object obj35 = shapeList0.clone();
        int int36 = shapeList0.size();
        java.awt.Shape shape38 = null;
        shapeList0.setShape(98, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) -1);
        java.lang.Object obj17 = shapeList0.clone();
        int int18 = shapeList0.size();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) '4', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj17", shapeList0.equals(obj17) ? shapeList0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
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
        java.awt.Shape shape28 = shapeList0.getShape(100);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) (byte) 10, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = shapeList0.getShape(0);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(99, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape7 = shapeList0.getShape((-1));
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        int int11 = shapeList0.size();
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
        java.awt.Shape shape34 = shapeList12.getShape(100);
        java.lang.Object obj35 = shapeList12.clone();
        java.lang.Object obj36 = shapeList12.clone();
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape39 = null;
        shapeList0.setShape(98, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) 100);
        java.awt.Shape shape4 = shapeList0.getShape((int) '#');
        java.awt.Shape shape6 = shapeList0.getShape((int) '4');
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        shapeList9.clear();
        java.lang.Object obj11 = shapeList9.clone();
        shapeList9.clear();
        shapeList9.clear();
        int int14 = shapeList9.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) int14);
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(99, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 0);
        java.lang.Object obj12 = shapeList9.clone();
        int int13 = shapeList9.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        java.awt.Shape shape17 = shapeList14.getShape(0);
        shapeList14.clear();
        shapeList14.clear();
        int int20 = shapeList14.size();
        int int21 = shapeList14.size();
        shapeList14.clear();
        boolean boolean23 = shapeList9.equals((java.lang.Object) shapeList14);
        shapeList9.clear();
        int int25 = shapeList9.size();
        int int26 = shapeList9.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        java.awt.Shape shape30 = shapeList27.getShape(0);
        boolean boolean32 = shapeList27.equals((java.lang.Object) ' ');
        shapeList27.clear();
        int int34 = shapeList27.size();
        shapeList27.clear();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = shapeList36.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape45 = shapeList36.getShape(0);
        shapeList36.clear();
        boolean boolean47 = shapeList27.equals((java.lang.Object) shapeList36);
        shapeList36.clear();
        shapeList36.clear();
        shapeList36.clear();
        java.awt.Shape shape52 = shapeList36.getShape((int) (short) 100);
        java.lang.Object obj53 = shapeList36.clone();
        java.lang.Object obj54 = shapeList36.clone();
        boolean boolean55 = shapeList9.equals(obj54);
        boolean boolean56 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
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
        java.awt.Shape shape28 = null;
        shapeList12.setShape((int) (byte) 100, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
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
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        java.awt.Shape shape38 = shapeList35.getShape(0);
        shapeList35.clear();
        shapeList35.clear();
        int int41 = shapeList35.size();
        java.awt.Shape shape43 = shapeList35.getShape((-1));
        shapeList35.clear();
        java.awt.Shape shape46 = null;
        shapeList35.setShape((int) (short) 10, shape46);
        int int48 = shapeList35.size();
        boolean boolean49 = shapeList0.equals((java.lang.Object) int48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        int int19 = shapeList17.size();
        int int20 = shapeList17.size();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        shapeList21.clear();
        java.lang.Object obj24 = shapeList21.clone();
        boolean boolean25 = shapeList17.equals((java.lang.Object) shapeList21);
        int int26 = shapeList17.size();
        boolean boolean27 = shapeList0.equals((java.lang.Object) int26);
        shapeList0.clear();
        java.awt.Shape shape30 = null;
        shapeList0.setShape(10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
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
        int int37 = shapeList0.size();
        int int38 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) 100);
        java.awt.Shape shape43 = shapeList39.getShape((int) '#');
        java.awt.Shape shape45 = shapeList39.getShape((int) '4');
        int int46 = shapeList39.size();
        java.awt.Shape shape48 = null;
        shapeList39.setShape(53, shape48);
        java.awt.Shape shape51 = null;
        shapeList39.setShape(11, shape51);
        java.lang.Class<?> wildcardClass53 = shapeList39.getClass();
        boolean boolean54 = shapeList0.equals((java.lang.Object) shapeList39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList39", shapeList0.equals(shapeList39) ? shapeList0.hashCode() == shapeList39.hashCode() : true);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
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
        shapeList0.clear();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(8, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
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
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        java.lang.Object obj38 = shapeList36.clone();
        java.awt.Shape shape40 = shapeList36.getShape(33);
        int int41 = shapeList36.size();
        int int42 = shapeList36.size();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        int int44 = shapeList43.size();
        java.awt.Shape shape46 = shapeList43.getShape(0);
        shapeList43.clear();
        shapeList43.clear();
        int int49 = shapeList43.size();
        org.jfree.chart.util.ShapeList shapeList50 = new org.jfree.chart.util.ShapeList();
        boolean boolean52 = shapeList50.equals((java.lang.Object) (short) 0);
        java.lang.Object obj53 = shapeList50.clone();
        boolean boolean54 = shapeList43.equals(obj53);
        java.lang.Object obj55 = shapeList43.clone();
        boolean boolean56 = shapeList36.equals(obj55);
        boolean boolean57 = shapeList0.equals((java.lang.Object) shapeList36);
        java.awt.Shape shape59 = null;
        shapeList0.setShape(98, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
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
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(36, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
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
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(99, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
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
        java.awt.Shape shape53 = shapeList0.getShape((int) (byte) 1);
        shapeList0.clear();
        java.awt.Shape shape56 = null;
        shapeList0.setShape(9, shape56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
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
        shapeList14.clear();
        int int35 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = shapeList36.equals((java.lang.Object) (short) 100);
        shapeList36.clear();
        shapeList36.clear();
        shapeList36.clear();
        java.awt.Shape shape48 = null;
        shapeList36.setShape(2, shape48);
        int int50 = shapeList36.size();
        boolean boolean51 = shapeList14.equals((java.lang.Object) int50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
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
        java.lang.Object obj18 = shapeList16.clone();
        int int19 = shapeList16.size();
        java.lang.Object obj20 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) 100);
        boolean boolean25 = shapeList16.equals((java.lang.Object) 10L);
        shapeList16.clear();
        shapeList16.clear();
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        boolean boolean5 = shapeList0.equals((java.lang.Object) ' ');
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = shapeList0.getShape(0);
        int int12 = shapeList0.size();
        java.lang.Object obj13 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) 100);
        java.awt.Shape shape18 = shapeList14.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        int int22 = shapeList19.size();
        boolean boolean23 = shapeList14.equals((java.lang.Object) int22);
        java.awt.Shape shape25 = shapeList14.getShape(0);
        java.awt.Shape shape27 = shapeList14.getShape(0);
        shapeList14.clear();
        java.lang.Object obj29 = shapeList14.clone();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList14);
        int int31 = shapeList0.size();
        java.awt.Shape shape33 = null;
        shapeList0.setShape(53, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj13", shapeList0.equals(obj13) ? shapeList0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
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
        java.awt.Shape shape30 = null;
        shapeList0.setShape(35, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        java.awt.Shape shape3 = shapeList0.getShape(0);
        shapeList0.clear();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(36, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 10, shape15);
        java.lang.Object obj17 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj17", shapeList0.equals(obj17) ? shapeList0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        int int5 = shapeList0.size();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        int int11 = shapeList10.size();
        java.lang.Object obj12 = shapeList10.clone();
        int int13 = shapeList10.size();
        java.lang.Object obj14 = shapeList10.clone();
        boolean boolean15 = shapeList7.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape17 = shapeList10.getShape(0);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) 100);
        int int21 = shapeList18.size();
        java.awt.Shape shape23 = shapeList18.getShape((int) '#');
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        int int29 = shapeList26.size();
        shapeList26.clear();
        shapeList26.clear();
        java.awt.Shape shape33 = shapeList26.getShape(100);
        boolean boolean34 = shapeList18.equals((java.lang.Object) shape33);
        boolean boolean35 = shapeList10.equals((java.lang.Object) shape33);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) 100);
        int int39 = shapeList36.size();
        boolean boolean41 = shapeList36.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = shapeList36.equals((java.lang.Object) (short) 100);
        shapeList36.clear();
        shapeList36.clear();
        java.awt.Shape shape47 = shapeList36.getShape((int) '#');
        shapeList36.clear();
        boolean boolean49 = shapeList10.equals((java.lang.Object) shapeList36);
        boolean boolean50 = shapeList0.equals((java.lang.Object) shapeList36);
        java.awt.Shape shape52 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape54 = null;
        shapeList0.setShape((int) (short) 0, shape54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) 100);
        boolean boolean23 = shapeList19.equals((java.lang.Object) 1L);
        java.awt.Shape shape25 = shapeList19.getShape(100);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) 100);
        java.awt.Shape shape30 = shapeList26.getShape((int) '#');
        java.awt.Shape shape32 = shapeList26.getShape((int) '4');
        int int33 = shapeList26.size();
        boolean boolean34 = shapeList19.equals((java.lang.Object) shapeList26);
        shapeList26.clear();
        java.lang.Object obj36 = shapeList26.clone();
        boolean boolean37 = shapeList0.equals(obj36);
        java.awt.Shape shape39 = shapeList0.getShape(33);
        java.awt.Shape shape41 = null;
        shapeList0.setShape((int) (short) 0, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
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
        java.awt.Shape shape51 = null;
        shapeList21.setShape(0, shape51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
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
        shapeList0.clear();
        java.lang.Object obj19 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        java.awt.Shape shape23 = shapeList20.getShape(0);
        shapeList20.clear();
        shapeList20.clear();
        java.awt.Shape shape27 = shapeList20.getShape((int) 'a');
        java.lang.Object obj28 = shapeList20.clone();
        shapeList20.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        int int31 = shapeList30.size();
        boolean boolean32 = shapeList20.equals((java.lang.Object) int31);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) 100);
        int int36 = shapeList33.size();
        java.awt.Shape shape38 = shapeList33.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) 100);
        java.awt.Shape shape43 = shapeList39.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        boolean boolean46 = shapeList44.equals((java.lang.Object) 100);
        int int47 = shapeList44.size();
        boolean boolean48 = shapeList39.equals((java.lang.Object) int47);
        java.awt.Shape shape50 = shapeList39.getShape(0);
        boolean boolean51 = shapeList33.equals((java.lang.Object) 0);
        shapeList33.clear();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        int int54 = shapeList53.size();
        int int55 = shapeList53.size();
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        int int57 = shapeList56.size();
        java.lang.Object obj58 = shapeList56.clone();
        int int59 = shapeList56.size();
        java.lang.Object obj60 = shapeList56.clone();
        boolean boolean61 = shapeList53.equals((java.lang.Object) shapeList56);
        boolean boolean62 = shapeList33.equals((java.lang.Object) shapeList56);
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        int int64 = shapeList63.size();
        java.awt.Shape shape66 = shapeList63.getShape(0);
        boolean boolean68 = shapeList63.equals((java.lang.Object) ' ');
        shapeList63.clear();
        int int70 = shapeList63.size();
        shapeList63.clear();
        org.jfree.chart.util.ShapeList shapeList72 = new org.jfree.chart.util.ShapeList();
        boolean boolean74 = shapeList72.equals((java.lang.Object) 100);
        int int75 = shapeList72.size();
        boolean boolean77 = shapeList72.equals((java.lang.Object) (byte) 0);
        boolean boolean79 = shapeList72.equals((java.lang.Object) (short) 100);
        java.awt.Shape shape81 = shapeList72.getShape(0);
        shapeList72.clear();
        boolean boolean83 = shapeList63.equals((java.lang.Object) shapeList72);
        java.lang.Object obj84 = shapeList63.clone();
        org.jfree.chart.util.ShapeList shapeList85 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj86 = shapeList85.clone();
        java.lang.Class<?> wildcardClass87 = obj86.getClass();
        boolean boolean88 = shapeList63.equals((java.lang.Object) wildcardClass87);
        java.lang.Object obj89 = shapeList63.clone();
        boolean boolean90 = shapeList56.equals((java.lang.Object) shapeList63);
        java.lang.Object obj91 = shapeList63.clone();
        boolean boolean92 = shapeList20.equals((java.lang.Object) shapeList63);
        boolean boolean93 = shapeList0.equals((java.lang.Object) boolean92);
        java.awt.Shape shape95 = null;
        shapeList0.setShape(34, shape95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
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
        java.awt.Shape shape31 = null;
        shapeList23.setShape(0, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }
}

