package org.jfree.chart.renderer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) true);
        double double17 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        double double19 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale9.getPaint((double) (-1));
        java.awt.Paint paint23 = grayPaintScale9.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean27 = grayPaintScale9.equals((java.lang.Object) grayPaintScale26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj29 = grayPaintScale2.clone();
        double double30 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj29", grayPaintScale2.equals(obj29) ? grayPaintScale2.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass26 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) false);
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale16.equals((java.lang.Object) grayPaintScale19);
        double double21 = grayPaintScale16.getLowerBound();
        double double22 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) (short) 0);
        boolean boolean25 = grayPaintScale9.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        java.awt.Paint paint30 = grayPaintScale28.getPaint(100.0d);
        java.lang.Class<?> wildcardClass31 = grayPaintScale28.getClass();
        boolean boolean32 = grayPaintScale9.equals((java.lang.Object) wildcardClass31);
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint(1.0d);
        boolean boolean13 = grayPaintScale3.equals((java.lang.Object) paint12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) (-1));
        double double19 = grayPaintScale16.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale16.getClass();
        boolean boolean21 = grayPaintScale3.equals((java.lang.Object) wildcardClass20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double25 = grayPaintScale24.getUpperBound();
        boolean boolean26 = grayPaintScale3.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale24", grayPaintScale7.equals(grayPaintScale24) ? grayPaintScale7.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) double14);
        double double16 = grayPaintScale10.getUpperBound();
        double double17 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        boolean boolean21 = grayPaintScale10.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj22 = grayPaintScale20.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.lang.Object obj16 = grayPaintScale15.clone();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) (-1.0d));
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (byte) 1);
        double double12 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 0.0f);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        boolean boolean23 = grayPaintScale7.equals((java.lang.Object) double22);
        double double24 = grayPaintScale7.getLowerBound();
        double double25 = grayPaintScale7.getUpperBound();
        double double26 = grayPaintScale7.getLowerBound();
        double double27 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale7.getPaint(0.0d);
        boolean boolean30 = grayPaintScale3.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale17", grayPaintScale2.equals(grayPaintScale17) ? grayPaintScale2.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double10 = grayPaintScale9.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj12 = grayPaintScale9.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) 1L);
        double double18 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) 0);
        double double23 = grayPaintScale19.getLowerBound();
        double double24 = grayPaintScale19.getUpperBound();
        boolean boolean25 = grayPaintScale15.equals((java.lang.Object) double24);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double29 = grayPaintScale28.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass33 = grayPaintScale32.getClass();
        boolean boolean34 = grayPaintScale28.equals((java.lang.Object) wildcardClass33);
        double double35 = grayPaintScale28.getLowerBound();
        java.lang.Class<?> wildcardClass36 = grayPaintScale28.getClass();
        boolean boolean37 = grayPaintScale15.equals((java.lang.Object) wildcardClass36);
        java.awt.Paint paint39 = grayPaintScale15.getPaint((double) 1);
        boolean boolean40 = grayPaintScale9.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale32", grayPaintScale2.equals(grayPaintScale32) ? grayPaintScale2.hashCode() == grayPaintScale32.hashCode() : true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint(0.0d);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getUpperBound();
        java.lang.Object obj14 = grayPaintScale9.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj14", grayPaintScale9.equals(obj14) ? grayPaintScale9.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale11.equals((java.lang.Object) grayPaintScale14);
        java.lang.Class<?> wildcardClass16 = grayPaintScale14.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale14", grayPaintScale3.equals(grayPaintScale14) ? grayPaintScale3.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) grayPaintScale7);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getUpperBound();
        double double12 = grayPaintScale6.getLowerBound();
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (short) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) boolean12);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) boolean13);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        boolean boolean20 = grayPaintScale17.equals((java.lang.Object) true);
        double double21 = grayPaintScale17.getLowerBound();
        double double22 = grayPaintScale17.getUpperBound();
        java.lang.Object obj23 = grayPaintScale17.clone();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale17", grayPaintScale8.equals(grayPaintScale17) ? grayPaintScale8.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean18 = grayPaintScale14.equals((java.lang.Object) 'a');
        double double19 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0.0f);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double23 = grayPaintScale2.getLowerBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj24", grayPaintScale2.equals(obj24) ? grayPaintScale2.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 'a');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) double10);
        double double12 = grayPaintScale6.getUpperBound();
        double double13 = grayPaintScale6.getLowerBound();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) double13);
        double double15 = grayPaintScale0.getUpperBound();
        double double16 = grayPaintScale0.getUpperBound();
        double double17 = grayPaintScale0.getLowerBound();
        double double18 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale0.getPaint((double) 1);
        double double21 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        double double23 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint(0.0d);
        double double26 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass29 = grayPaintScale22.getClass();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale22", grayPaintScale0.equals(grayPaintScale22) ? grayPaintScale0.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getLowerBound();
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean17 = grayPaintScale14.equals((java.lang.Object) grayPaintScale15);
        double double18 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) 0L);
        java.lang.Class<?> wildcardClass21 = grayPaintScale15.getClass();
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) wildcardClass21);
        boolean boolean23 = grayPaintScale3.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 1);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        boolean boolean14 = grayPaintScale11.equals((java.lang.Object) true);
        double double15 = grayPaintScale11.getUpperBound();
        double double16 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double20 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (byte) -1);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1));
        boolean boolean25 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 0L);
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) paint30);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) paint30);
        java.lang.Object obj33 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) 1L);
        double double39 = grayPaintScale36.getUpperBound();
        double double40 = grayPaintScale36.getUpperBound();
        double double41 = grayPaintScale36.getLowerBound();
        java.awt.Paint paint43 = grayPaintScale36.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean47 = grayPaintScale36.equals((java.lang.Object) grayPaintScale46);
        double double48 = grayPaintScale46.getLowerBound();
        java.awt.Paint paint50 = grayPaintScale46.getPaint((double) '4');
        boolean boolean51 = grayPaintScale2.equals((java.lang.Object) paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj33", grayPaintScale2.equals(obj33) ? grayPaintScale2.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 1);
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) true);
        java.lang.Object obj16 = grayPaintScale12.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getUpperBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) (-1.0d));
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = grayPaintScale8.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) (byte) 0);
        java.lang.Object obj17 = grayPaintScale9.clone();
        boolean boolean18 = grayPaintScale0.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint(97.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) double9);
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getUpperBound();
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) double18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double21 = grayPaintScale5.getLowerBound();
        java.lang.Object obj22 = grayPaintScale5.clone();
        double double23 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj22", grayPaintScale5.equals(obj22) ? grayPaintScale5.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) double27);
        double double29 = grayPaintScale23.getUpperBound();
        double double30 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        boolean boolean34 = grayPaintScale23.equals((java.lang.Object) grayPaintScale33);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean39 = grayPaintScale37.equals((java.lang.Object) (byte) -1);
        double double40 = grayPaintScale37.getLowerBound();
        double double41 = grayPaintScale37.getUpperBound();
        boolean boolean42 = grayPaintScale23.equals((java.lang.Object) double41);
        java.lang.Class<?> wildcardClass43 = grayPaintScale23.getClass();
        boolean boolean44 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale23", grayPaintScale2.equals(grayPaintScale23) ? grayPaintScale2.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0);
        double double22 = grayPaintScale14.getLowerBound();
        double double23 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale14.getPaint((double) 0);
        double double26 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) 0.0f);
        double double32 = grayPaintScale29.getLowerBound();
        java.lang.Class<?> wildcardClass33 = grayPaintScale29.getClass();
        boolean boolean34 = grayPaintScale14.equals((java.lang.Object) wildcardClass33);
        double double35 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean40 = grayPaintScale38.equals((java.lang.Object) (byte) 10);
        boolean boolean41 = grayPaintScale14.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean45 = grayPaintScale14.equals((java.lang.Object) grayPaintScale44);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale48 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint50 = grayPaintScale48.getPaint((double) 1L);
        boolean boolean51 = grayPaintScale44.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass52 = grayPaintScale44.getClass();
        boolean boolean53 = grayPaintScale2.equals((java.lang.Object) grayPaintScale44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale38", grayPaintScale2.equals(grayPaintScale38) ? grayPaintScale2.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) double13);
        double double15 = grayPaintScale9.getUpperBound();
        double double16 = grayPaintScale9.getLowerBound();
        boolean boolean17 = grayPaintScale3.equals((java.lang.Object) double16);
        double double18 = grayPaintScale3.getUpperBound();
        double double19 = grayPaintScale3.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double24 = grayPaintScale23.getUpperBound();
        double double25 = grayPaintScale23.getUpperBound();
        java.lang.Object obj26 = grayPaintScale23.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and grayPaintScale23", grayPaintScale12.equals(grayPaintScale23) ? grayPaintScale12.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        double double16 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale7.getPaint((double) 0);
        double double19 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) 0.0f);
        double double25 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale22.getClass();
        boolean boolean27 = grayPaintScale7.equals((java.lang.Object) wildcardClass26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double29 = grayPaintScale2.getUpperBound();
        double double30 = grayPaintScale2.getUpperBound();
        java.lang.Object obj31 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale();
        double double33 = grayPaintScale32.getUpperBound();
        boolean boolean35 = grayPaintScale32.equals((java.lang.Object) true);
        double double36 = grayPaintScale32.getUpperBound();
        boolean boolean38 = grayPaintScale32.equals((java.lang.Object) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean43 = grayPaintScale41.equals((java.lang.Object) (byte) 10);
        double double44 = grayPaintScale41.getUpperBound();
        boolean boolean45 = grayPaintScale32.equals((java.lang.Object) grayPaintScale41);
        double double46 = grayPaintScale32.getUpperBound();
        double double47 = grayPaintScale32.getUpperBound();
        double double48 = grayPaintScale32.getLowerBound();
        boolean boolean49 = grayPaintScale2.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj31", grayPaintScale2.equals(obj31) ? grayPaintScale2.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double10 = grayPaintScale8.getUpperBound();
        double double11 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean21 = grayPaintScale16.equals((java.lang.Object) double20);
        double double22 = grayPaintScale16.getUpperBound();
        double double23 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double27 = grayPaintScale26.getUpperBound();
        double double28 = grayPaintScale26.getUpperBound();
        java.lang.Object obj29 = null;
        boolean boolean30 = grayPaintScale26.equals(obj29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean34 = grayPaintScale26.equals((java.lang.Object) grayPaintScale33);
        boolean boolean35 = grayPaintScale16.equals((java.lang.Object) grayPaintScale26);
        double double36 = grayPaintScale16.getUpperBound();
        double double37 = grayPaintScale16.getUpperBound();
        java.lang.Class<?> wildcardClass38 = grayPaintScale16.getClass();
        boolean boolean39 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale19", grayPaintScale8.equals(grayPaintScale19) ? grayPaintScale8.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double8 = grayPaintScale7.getUpperBound();
        java.lang.Object obj9 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale2.equals(obj9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj9", grayPaintScale7.equals(obj9) ? grayPaintScale7.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) false);
        java.lang.Object obj13 = grayPaintScale7.clone();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double13 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) 0.0f);
        double double19 = grayPaintScale16.getUpperBound();
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getLowerBound();
        double double22 = grayPaintScale16.getUpperBound();
        boolean boolean23 = grayPaintScale12.equals((java.lang.Object) double22);
        double double24 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale12.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale0.getUpperBound();
        double double22 = grayPaintScale0.getUpperBound();
        double double23 = grayPaintScale0.getUpperBound();
        double double24 = grayPaintScale0.getUpperBound();
        java.lang.Object obj25 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint(0.0d);
        double double30 = grayPaintScale26.getUpperBound();
        double double31 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale26.getPaint((double) 0);
        double double34 = grayPaintScale26.getLowerBound();
        java.lang.Object obj35 = grayPaintScale26.clone();
        boolean boolean36 = grayPaintScale0.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj25", grayPaintScale0.equals(obj25) ? grayPaintScale0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) (-1.0d));
        boolean boolean17 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double18 = grayPaintScale13.getLowerBound();
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) 0.0f);
        double double26 = grayPaintScale23.getUpperBound();
        double double27 = grayPaintScale23.getUpperBound();
        double double28 = grayPaintScale23.getLowerBound();
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) double28);
        double double30 = grayPaintScale13.getLowerBound();
        double double31 = grayPaintScale13.getUpperBound();
        double double32 = grayPaintScale13.getLowerBound();
        double double33 = grayPaintScale13.getUpperBound();
        double double34 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale13.getPaint((double) (byte) 1);
        boolean boolean37 = grayPaintScale0.equals((java.lang.Object) paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale13", grayPaintScale0.equals(grayPaintScale13) ? grayPaintScale0.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double9 = grayPaintScale8.getUpperBound();
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) grayPaintScale14);
        double double17 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale13.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 97.0d);
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean28 = grayPaintScale13.equals((java.lang.Object) grayPaintScale26);
        java.lang.Object obj29 = grayPaintScale26.clone();
        boolean boolean30 = grayPaintScale3.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale0.getUpperBound();
        double double22 = grayPaintScale0.getUpperBound();
        double double23 = grayPaintScale0.getUpperBound();
        double double24 = grayPaintScale0.getUpperBound();
        java.lang.Object obj25 = grayPaintScale0.clone();
        java.lang.Object obj26 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj25", grayPaintScale0.equals(obj25) ? grayPaintScale0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0L);
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) (byte) -1);
        double double18 = grayPaintScale15.getLowerBound();
        double double19 = grayPaintScale15.getUpperBound();
        java.lang.Object obj20 = grayPaintScale15.clone();
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale10.equals(obj11);
        java.lang.Class<?> wildcardClass13 = grayPaintScale10.getClass();
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = grayPaintScale7.getClass();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) wildcardClass15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 'a');
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (-1.0f));
        java.awt.Paint paint23 = grayPaintScale19.getPaint(35.0d);
        java.awt.Paint paint25 = grayPaintScale19.getPaint((double) (short) 0);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale19", grayPaintScale10.equals(grayPaintScale19) ? grayPaintScale10.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        double double11 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getUpperBound();
        double double20 = grayPaintScale12.getUpperBound();
        double double21 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double25 = grayPaintScale24.getUpperBound();
        double double26 = grayPaintScale24.getUpperBound();
        java.lang.Object obj27 = null;
        boolean boolean28 = grayPaintScale24.equals(obj27);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean32 = grayPaintScale24.equals((java.lang.Object) grayPaintScale31);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint37 = grayPaintScale35.getPaint(0.0d);
        double double38 = grayPaintScale35.getUpperBound();
        boolean boolean39 = grayPaintScale31.equals((java.lang.Object) double38);
        boolean boolean40 = grayPaintScale12.equals((java.lang.Object) double38);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale43 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint45 = grayPaintScale43.getPaint((double) 1L);
        java.awt.Paint paint47 = grayPaintScale43.getPaint((double) 'a');
        double double48 = grayPaintScale43.getUpperBound();
        boolean boolean49 = grayPaintScale12.equals((java.lang.Object) grayPaintScale43);
        boolean boolean50 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale7.equals(obj8);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 0.0f);
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) double15);
        double double17 = grayPaintScale0.getLowerBound();
        double double18 = grayPaintScale0.getLowerBound();
        double double19 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean29 = grayPaintScale25.equals((java.lang.Object) 'a');
        double double30 = grayPaintScale25.getLowerBound();
        boolean boolean31 = grayPaintScale22.equals((java.lang.Object) grayPaintScale25);
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) boolean31);
        java.lang.Object obj33 = grayPaintScale0.clone();
        java.lang.Object obj34 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj33", grayPaintScale0.equals(obj33) ? grayPaintScale0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) grayPaintScale22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 32.0d);
        boolean boolean28 = grayPaintScale9.equals((java.lang.Object) grayPaintScale27);
        java.lang.Object obj29 = grayPaintScale27.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        double double36 = grayPaintScale35.getUpperBound();
        boolean boolean37 = grayPaintScale32.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint39 = grayPaintScale35.getPaint((double) (byte) 1);
        boolean boolean40 = grayPaintScale27.equals((java.lang.Object) grayPaintScale35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale27 and obj29", grayPaintScale27.equals(obj29) ? grayPaintScale27.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 1);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        double double12 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj15 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        double double18 = grayPaintScale16.getUpperBound();
        boolean boolean20 = grayPaintScale16.equals((java.lang.Object) (short) 10);
        boolean boolean22 = grayPaintScale16.equals((java.lang.Object) 10.0f);
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) 1L);
        double double25 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale16.getPaint((double) 1.0f);
        double double28 = grayPaintScale16.getUpperBound();
        double double29 = grayPaintScale16.getUpperBound();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj23 = grayPaintScale2.clone();
        java.lang.Object obj24 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) double17);
        double double19 = grayPaintScale13.getUpperBound();
        double double20 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale13.getPaint((double) 10L);
        boolean boolean23 = grayPaintScale10.equals((java.lang.Object) paint22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) boolean23);
        java.lang.Object obj25 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 1.0f);
        double double31 = grayPaintScale28.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean35 = grayPaintScale28.equals((java.lang.Object) grayPaintScale34);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj39 = null;
        boolean boolean40 = grayPaintScale38.equals(obj39);
        boolean boolean41 = grayPaintScale34.equals((java.lang.Object) grayPaintScale38);
        double double42 = grayPaintScale34.getUpperBound();
        java.awt.Paint paint44 = grayPaintScale34.getPaint((double) (byte) 0);
        double double45 = grayPaintScale34.getUpperBound();
        boolean boolean46 = grayPaintScale2.equals((java.lang.Object) grayPaintScale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) (-1.0d));
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (byte) 1);
        double double13 = grayPaintScale8.getLowerBound();
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) 0.0f);
        double double21 = grayPaintScale18.getUpperBound();
        double double22 = grayPaintScale18.getUpperBound();
        double double23 = grayPaintScale18.getLowerBound();
        boolean boolean24 = grayPaintScale8.equals((java.lang.Object) double23);
        double double25 = grayPaintScale8.getLowerBound();
        double double26 = grayPaintScale8.getLowerBound();
        double double27 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double31 = grayPaintScale30.getUpperBound();
        double double32 = grayPaintScale30.getUpperBound();
        java.lang.Object obj33 = null;
        boolean boolean34 = grayPaintScale30.equals(obj33);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean38 = grayPaintScale30.equals((java.lang.Object) grayPaintScale37);
        double double39 = grayPaintScale30.getLowerBound();
        boolean boolean40 = grayPaintScale8.equals((java.lang.Object) grayPaintScale30);
        java.awt.Paint paint42 = grayPaintScale8.getPaint(0.0d);
        boolean boolean43 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) ' ');
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint((double) 0);
        double double12 = grayPaintScale4.getLowerBound();
        double double13 = grayPaintScale4.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        double double15 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale2.getPaint(52.0d);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) grayPaintScale22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 32.0d);
        boolean boolean28 = grayPaintScale9.equals((java.lang.Object) grayPaintScale27);
        java.lang.Object obj29 = grayPaintScale27.clone();
        java.awt.Paint paint31 = grayPaintScale27.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale27 and obj29", grayPaintScale27.equals(obj29) ? grayPaintScale27.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1L);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj12 = grayPaintScale10.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale13.getPaint(0.0d);
        double double21 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint(0.0d);
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getLowerBound();
        java.lang.Object obj26 = grayPaintScale13.clone();
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj12", grayPaintScale10.equals(obj12) ? grayPaintScale10.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale12.equals(obj15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint25 = grayPaintScale23.getPaint(0.0d);
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean27 = grayPaintScale19.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale0.equals((java.lang.Object) double26);
        java.awt.Paint paint30 = grayPaintScale0.getPaint((double) (short) 0);
        java.lang.Object obj31 = grayPaintScale0.clone();
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj31", grayPaintScale0.equals(obj31) ? grayPaintScale0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale15.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = paint21.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = grayPaintScale2.clone();
        double double25 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj24", grayPaintScale2.equals(obj24) ? grayPaintScale2.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 10);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) 0.0f);
        double double19 = grayPaintScale16.getUpperBound();
        double double20 = grayPaintScale16.getUpperBound();
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj22 = grayPaintScale16.clone();
        boolean boolean23 = grayPaintScale0.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj22", grayPaintScale16.equals(obj22) ? grayPaintScale16.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getUpperBound();
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1.0f);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale6.getUpperBound();
        java.lang.Object obj13 = grayPaintScale6.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj13", grayPaintScale6.equals(obj13) ? grayPaintScale6.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 10);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 'a');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) double18);
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        double double23 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint(0.0d);
        double double26 = grayPaintScale22.getUpperBound();
        double double27 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass28 = grayPaintScale22.getClass();
        boolean boolean29 = grayPaintScale14.equals((java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = grayPaintScale14.getClass();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = grayPaintScale2.clone();
        double double33 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        double double13 = grayPaintScale0.getLowerBound();
        double double14 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getUpperBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale15.getClass();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint(10.0d);
        double double21 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 100);
        java.lang.Object obj25 = grayPaintScale24.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and obj25", grayPaintScale24.equals(obj25) ? grayPaintScale24.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 10.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getUpperBound();
        double double13 = grayPaintScale0.getUpperBound();
        double double14 = grayPaintScale0.getLowerBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        double double16 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        double double15 = grayPaintScale2.getLowerBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (byte) 1);
        java.awt.Paint paint14 = grayPaintScale10.getPaint((double) (byte) 10);
        double double15 = grayPaintScale10.getUpperBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        double double11 = grayPaintScale0.getLowerBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double16 = grayPaintScale15.getUpperBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale15.getPaint(52.0d);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) 52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double14 = grayPaintScale12.getLowerBound();
        double double15 = grayPaintScale12.getUpperBound();
        java.lang.Object obj16 = grayPaintScale12.clone();
        java.lang.Object obj17 = grayPaintScale12.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj16", grayPaintScale12.equals(obj16) ? grayPaintScale12.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (short) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) true);
        double double17 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        double double19 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale9.getPaint((double) (-1));
        java.awt.Paint paint23 = grayPaintScale9.getPaint((double) (short) 10);
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale13", grayPaintScale0.equals(grayPaintScale13) ? grayPaintScale0.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double8 = grayPaintScale7.getUpperBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale7.equals(obj10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj16", grayPaintScale7.equals(obj16) ? grayPaintScale7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        double double9 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) double16);
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale12.getPaint((double) (byte) 10);
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale12);
        java.lang.Object obj23 = grayPaintScale5.clone();
        boolean boolean24 = grayPaintScale2.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj23", grayPaintScale5.equals(obj23) ? grayPaintScale5.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj23 = grayPaintScale20.clone();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint((double) 0);
        double double12 = grayPaintScale4.getLowerBound();
        double double13 = grayPaintScale4.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        double double15 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale2.getPaint(52.0d);
        double double18 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        double double22 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean32 = grayPaintScale27.equals((java.lang.Object) double31);
        double double33 = grayPaintScale27.getUpperBound();
        double double34 = grayPaintScale27.getLowerBound();
        boolean boolean35 = grayPaintScale21.equals((java.lang.Object) double34);
        double double36 = grayPaintScale21.getUpperBound();
        double double37 = grayPaintScale21.getUpperBound();
        double double38 = grayPaintScale21.getLowerBound();
        double double39 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint41 = grayPaintScale21.getPaint((double) 1);
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale21", grayPaintScale4.equals(grayPaintScale21) ? grayPaintScale4.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) wildcardClass7);
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) (byte) 10);
        double double16 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        boolean boolean22 = grayPaintScale13.equals((java.lang.Object) grayPaintScale17);
        double double23 = grayPaintScale13.getLowerBound();
        java.lang.Object obj24 = grayPaintScale13.clone();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj24", grayPaintScale13.equals(obj24) ? grayPaintScale13.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1.0f);
        java.lang.Object obj11 = grayPaintScale10.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj11", grayPaintScale10.equals(obj11) ? grayPaintScale10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (byte) -1);
        double double10 = grayPaintScale6.getLowerBound();
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) 'a');
        java.awt.Paint paint12 = grayPaintScale6.getPaint((double) 100.0f);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        double double5 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 10);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double10 = grayPaintScale9.getUpperBound();
        java.lang.Object obj11 = grayPaintScale9.clone();
        boolean boolean12 = grayPaintScale0.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj11", grayPaintScale9.equals(obj11) ? grayPaintScale9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale5.getPaint((double) 0);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint16);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) false);
        java.lang.Object obj20 = grayPaintScale2.clone();
        double double21 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        double double20 = grayPaintScale2.getUpperBound();
        java.lang.Object obj21 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass22 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj11", grayPaintScale7.equals(obj11) ? grayPaintScale7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double10 = grayPaintScale8.getLowerBound();
        double double11 = grayPaintScale8.getLowerBound();
        java.lang.Object obj12 = grayPaintScale8.clone();
        double double13 = grayPaintScale8.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj12", grayPaintScale8.equals(obj12) ? grayPaintScale8.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        double double6 = grayPaintScale4.getUpperBound();
        boolean boolean8 = grayPaintScale4.equals((java.lang.Object) (short) 100);
        double double9 = grayPaintScale4.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale4", grayPaintScale2.equals(grayPaintScale4) ? grayPaintScale2.hashCode() == grayPaintScale4.hashCode() : true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (-1));
        double double9 = grayPaintScale6.getLowerBound();
        double double10 = grayPaintScale6.getLowerBound();
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double15 = grayPaintScale14.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) double15);
        double double17 = grayPaintScale11.getUpperBound();
        java.lang.Object obj18 = grayPaintScale11.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj18", grayPaintScale11.equals(obj18) ? grayPaintScale11.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double10 = grayPaintScale9.getUpperBound();
        boolean boolean11 = grayPaintScale3.equals((java.lang.Object) double10);
        java.awt.Paint paint13 = grayPaintScale3.getPaint((double) 1L);
        double double14 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 100);
        java.lang.Object obj18 = grayPaintScale17.clone();
        boolean boolean19 = grayPaintScale3.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale17", grayPaintScale2.equals(grayPaintScale17) ? grayPaintScale2.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) grayPaintScale10);
        java.lang.Class<?> wildcardClass12 = grayPaintScale10.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) '#');
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) '4');
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) 10L);
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj12", grayPaintScale7.equals(obj12) ? grayPaintScale7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) 100.0f);
        double double14 = grayPaintScale9.getUpperBound();
        java.lang.Object obj15 = grayPaintScale9.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        double double15 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale5.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        double double22 = grayPaintScale18.getUpperBound();
        double double23 = grayPaintScale18.getLowerBound();
        double double24 = grayPaintScale18.getUpperBound();
        java.lang.Object obj25 = grayPaintScale18.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale18", grayPaintScale5.equals(grayPaintScale18) ? grayPaintScale5.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale0.equals(obj5);
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale0.equals(obj7);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double14 = grayPaintScale12.getLowerBound();
        java.lang.Object obj15 = grayPaintScale12.clone();
        java.awt.Paint paint17 = grayPaintScale12.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj15", grayPaintScale12.equals(obj15) ? grayPaintScale12.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getUpperBound();
        double double11 = grayPaintScale5.getLowerBound();
        double double12 = grayPaintScale5.getUpperBound();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale5", grayPaintScale0.equals(grayPaintScale5) ? grayPaintScale0.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 0.0f);
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) double15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double20 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) 10.0f);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) double30);
        double double32 = grayPaintScale26.getUpperBound();
        double double33 = grayPaintScale26.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale();
        double double35 = grayPaintScale34.getUpperBound();
        java.awt.Paint paint37 = grayPaintScale34.getPaint(0.0d);
        double double38 = grayPaintScale34.getUpperBound();
        double double39 = grayPaintScale34.getLowerBound();
        java.lang.Class<?> wildcardClass40 = grayPaintScale34.getClass();
        boolean boolean41 = grayPaintScale26.equals((java.lang.Object) wildcardClass40);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double45 = grayPaintScale44.getUpperBound();
        boolean boolean46 = grayPaintScale26.equals((java.lang.Object) grayPaintScale44);
        double double47 = grayPaintScale26.getLowerBound();
        java.lang.Object obj48 = grayPaintScale26.clone();
        boolean boolean49 = grayPaintScale19.equals(obj48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale34", grayPaintScale0.equals(grayPaintScale34) ? grayPaintScale0.hashCode() == grayPaintScale34.hashCode() : true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) 0.0f);
        double double10 = grayPaintScale7.getUpperBound();
        double double11 = grayPaintScale7.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint(97.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0);
        double double21 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 0);
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getUpperBound();
        double double26 = grayPaintScale13.getUpperBound();
        double double27 = grayPaintScale13.getUpperBound();
        double double28 = grayPaintScale13.getUpperBound();
        java.lang.Object obj29 = grayPaintScale13.clone();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj29", grayPaintScale13.equals(obj29) ? grayPaintScale13.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 1.0f);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) double9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale12.equals(obj15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale19);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 1);
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (byte) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1));
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0L);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) paint19);
        java.lang.Object obj21 = grayPaintScale0.clone();
        double double22 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj21", grayPaintScale0.equals(obj21) ? grayPaintScale0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale12.equals(obj15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint25 = grayPaintScale23.getPaint(0.0d);
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean27 = grayPaintScale19.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale0.equals((java.lang.Object) double26);
        java.awt.Paint paint30 = grayPaintScale0.getPaint((double) (short) 0);
        java.lang.Object obj31 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj31", grayPaintScale0.equals(obj31) ? grayPaintScale0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) (byte) 10);
        double double15 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        double double20 = grayPaintScale16.getUpperBound();
        boolean boolean21 = grayPaintScale12.equals((java.lang.Object) grayPaintScale16);
        double double22 = grayPaintScale12.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale16", grayPaintScale5.equals(grayPaintScale16) ? grayPaintScale5.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (byte) 0);
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        java.lang.Object obj17 = grayPaintScale16.clone();
        boolean boolean18 = grayPaintScale0.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double19 = grayPaintScale18.getUpperBound();
        java.lang.Object obj20 = grayPaintScale18.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) '4');
        double double13 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 1);
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) grayPaintScale16);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1.0f);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (short) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) boolean7);
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getUpperBound();
        double double16 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean27 = grayPaintScale23.equals((java.lang.Object) 'a');
        double double28 = grayPaintScale23.getLowerBound();
        boolean boolean29 = grayPaintScale20.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj30 = grayPaintScale20.clone();
        boolean boolean31 = grayPaintScale2.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj30", grayPaintScale20.equals(obj30) ? grayPaintScale20.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getUpperBound();
        double double13 = grayPaintScale0.getUpperBound();
        double double14 = grayPaintScale0.getLowerBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        double double16 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 'a');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) grayPaintScale14);
        double double17 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale5.getPaint((double) (short) 100);
        java.lang.Object obj20 = grayPaintScale5.clone();
        double double21 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj20", grayPaintScale5.equals(obj20) ? grayPaintScale5.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getLowerBound();
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) (-1.0d));
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (byte) 1);
        double double12 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 0.0f);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        boolean boolean23 = grayPaintScale7.equals((java.lang.Object) double22);
        double double24 = grayPaintScale7.getLowerBound();
        double double25 = grayPaintScale7.getUpperBound();
        double double26 = grayPaintScale7.getLowerBound();
        double double27 = grayPaintScale7.getUpperBound();
        boolean boolean28 = grayPaintScale3.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getLowerBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint((double) 0);
        double double12 = grayPaintScale4.getLowerBound();
        double double13 = grayPaintScale4.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        double double15 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale2.getPaint(52.0d);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        java.lang.Object obj23 = null;
        boolean boolean24 = grayPaintScale22.equals(obj23);
        java.lang.Object obj25 = grayPaintScale22.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale7.equals(obj8);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getUpperBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, 52.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale11.getClass();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale8.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale11", grayPaintScale2.equals(grayPaintScale11) ? grayPaintScale2.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 1);
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint(0.0d);
        boolean boolean19 = grayPaintScale11.equals((java.lang.Object) paint18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (byte) -1);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 10L);
        double double19 = grayPaintScale10.getUpperBound();
        java.lang.Object obj20 = grayPaintScale10.clone();
        double double21 = grayPaintScale10.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double13 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0);
        double double22 = grayPaintScale14.getLowerBound();
        double double23 = grayPaintScale14.getLowerBound();
        boolean boolean24 = grayPaintScale12.equals((java.lang.Object) double23);
        double double25 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale12.getPaint((double) 10.0f);
        java.awt.Paint paint29 = grayPaintScale12.getPaint((double) 10);
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) 0.0f);
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint(35.0d);
        java.lang.Object obj18 = grayPaintScale11.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj18", grayPaintScale11.equals(obj18) ? grayPaintScale11.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) 10);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) ' ');
        java.lang.Object obj15 = grayPaintScale6.clone();
        double double16 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj15", grayPaintScale6.equals(obj15) ? grayPaintScale6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getLowerBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj7 = grayPaintScale3.clone();
        double double8 = grayPaintScale3.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj7", grayPaintScale3.equals(obj7) ? grayPaintScale3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint((double) 0);
        double double12 = grayPaintScale4.getLowerBound();
        double double13 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale4.getPaint((double) 0);
        double double16 = grayPaintScale4.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) 0.0f);
        double double22 = grayPaintScale19.getLowerBound();
        java.lang.Class<?> wildcardClass23 = grayPaintScale19.getClass();
        boolean boolean24 = grayPaintScale4.equals((java.lang.Object) wildcardClass23);
        double double25 = grayPaintScale4.getUpperBound();
        double double26 = grayPaintScale4.getUpperBound();
        double double27 = grayPaintScale4.getLowerBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) double27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale3.equals((java.lang.Object) true);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (byte) -1);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean17 = grayPaintScale3.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) 0L);
        boolean boolean23 = grayPaintScale3.equals((java.lang.Object) paint22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) boolean23);
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, 32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        double double9 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale5.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean15 = grayPaintScale5.equals((java.lang.Object) 0.0d);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) boolean15);
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double25 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double29 = grayPaintScale28.getLowerBound();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) double29);
        double double31 = grayPaintScale2.getLowerBound();
        java.lang.Object obj32 = grayPaintScale2.clone();
        double double33 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(35.0d);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double10 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) (byte) 10);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) double16);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getUpperBound();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale9.equals(obj12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) grayPaintScale16);
        double double18 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 100.0d);
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getUpperBound();
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean27 = grayPaintScale9.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.awt.Paint paint10 = grayPaintScale3.getPaint((double) (byte) 0);
        java.lang.Object obj11 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean15 = grayPaintScale3.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj11", grayPaintScale3.equals(obj11) ? grayPaintScale3.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double25 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale2.getPaint((double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        double double32 = grayPaintScale31.getUpperBound();
        double double33 = grayPaintScale31.getUpperBound();
        boolean boolean35 = grayPaintScale31.equals((java.lang.Object) (short) 10);
        boolean boolean36 = grayPaintScale30.equals((java.lang.Object) boolean35);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale30", grayPaintScale5.equals(grayPaintScale30) ? grayPaintScale5.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double11 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        boolean boolean16 = grayPaintScale12.equals((java.lang.Object) (short) 10);
        boolean boolean18 = grayPaintScale12.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale12.getLowerBound();
        java.lang.Object obj20 = null;
        boolean boolean21 = grayPaintScale12.equals(obj20);
        boolean boolean22 = grayPaintScale5.equals(obj20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        double double24 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double33 = grayPaintScale32.getLowerBound();
        boolean boolean34 = grayPaintScale29.equals((java.lang.Object) double33);
        double double35 = grayPaintScale29.getUpperBound();
        double double36 = grayPaintScale29.getLowerBound();
        boolean boolean37 = grayPaintScale23.equals((java.lang.Object) double36);
        java.lang.Class<?> wildcardClass38 = grayPaintScale23.getClass();
        boolean boolean39 = grayPaintScale5.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and grayPaintScale23", grayPaintScale12.equals(grayPaintScale23) ? grayPaintScale12.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) grayPaintScale30);
        double double32 = grayPaintScale30.getUpperBound();
        java.lang.Object obj33 = grayPaintScale30.clone();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale30 and obj33", grayPaintScale30.equals(obj33) ? grayPaintScale30.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint(0.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = grayPaintScale11.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 1);
        double double10 = grayPaintScale5.getUpperBound();
        double double11 = grayPaintScale5.getUpperBound();
        java.lang.Object obj12 = grayPaintScale5.clone();
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj12", grayPaintScale5.equals(obj12) ? grayPaintScale5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) 0);
        double double23 = grayPaintScale15.getLowerBound();
        double double24 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale15.getPaint((double) 0);
        double double27 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) 0.0f);
        double double33 = grayPaintScale30.getLowerBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale30.getClass();
        boolean boolean35 = grayPaintScale15.equals((java.lang.Object) wildcardClass34);
        double double36 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean41 = grayPaintScale39.equals((java.lang.Object) (byte) 10);
        boolean boolean42 = grayPaintScale15.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean46 = grayPaintScale15.equals((java.lang.Object) grayPaintScale45);
        java.awt.Paint paint48 = grayPaintScale15.getPaint((double) (byte) 0);
        java.awt.Paint paint50 = grayPaintScale15.getPaint((double) 1);
        double double51 = grayPaintScale15.getUpperBound();
        java.lang.Object obj52 = grayPaintScale15.clone();
        boolean boolean53 = grayPaintScale2.equals(obj52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj52", grayPaintScale15.equals(obj52) ? grayPaintScale15.hashCode() == obj52.hashCode() : true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = grayPaintScale0.clone();
        double double22 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj21", grayPaintScale0.equals(obj21) ? grayPaintScale0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint(0.0d);
        double double16 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) double16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double26 = grayPaintScale25.getUpperBound();
        double double27 = grayPaintScale25.getUpperBound();
        java.lang.Object obj28 = null;
        boolean boolean29 = grayPaintScale25.equals(obj28);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean33 = grayPaintScale25.equals((java.lang.Object) grayPaintScale32);
        double double34 = grayPaintScale25.getLowerBound();
        double double35 = grayPaintScale25.getUpperBound();
        boolean boolean36 = grayPaintScale9.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale25", grayPaintScale2.equals(grayPaintScale25) ? grayPaintScale2.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getLowerBound();
        double double9 = grayPaintScale3.getUpperBound();
        double double10 = grayPaintScale3.getUpperBound();
        double double11 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale3.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj14", grayPaintScale3.equals(obj14) ? grayPaintScale3.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean24 = grayPaintScale19.equals((java.lang.Object) double23);
        double double25 = grayPaintScale19.getUpperBound();
        double double26 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale19.getPaint((double) 10L);
        boolean boolean29 = grayPaintScale16.equals((java.lang.Object) paint28);
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) boolean29);
        java.lang.Object obj31 = grayPaintScale8.clone();
        boolean boolean32 = grayPaintScale2.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj31", grayPaintScale8.equals(obj31) ? grayPaintScale8.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double8 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass12 = grayPaintScale11.getClass();
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) wildcardClass12);
        double double14 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale7.getPaint(97.0d);
        java.awt.Paint paint18 = grayPaintScale7.getPaint((-1.0d));
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) 0.0f);
        double double10 = grayPaintScale7.getUpperBound();
        double double11 = grayPaintScale7.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(35.0d);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100);
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale10", grayPaintScale5.equals(grayPaintScale10) ? grayPaintScale5.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        boolean boolean21 = grayPaintScale5.equals((java.lang.Object) double20);
        double double22 = grayPaintScale5.getLowerBound();
        double double23 = grayPaintScale5.getUpperBound();
        double double24 = grayPaintScale5.getLowerBound();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj29 = grayPaintScale28.clone();
        boolean boolean30 = grayPaintScale5.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale28", grayPaintScale2.equals(grayPaintScale28) ? grayPaintScale2.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) double10);
        double double12 = grayPaintScale6.getUpperBound();
        double double13 = grayPaintScale6.getLowerBound();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) double13);
        double double15 = grayPaintScale0.getUpperBound();
        double double16 = grayPaintScale0.getUpperBound();
        double double17 = grayPaintScale0.getLowerBound();
        double double18 = grayPaintScale0.getLowerBound();
        double double19 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean23 = grayPaintScale20.equals((java.lang.Object) true);
        double double24 = grayPaintScale20.getLowerBound();
        double double25 = grayPaintScale20.getUpperBound();
        double double26 = grayPaintScale20.getUpperBound();
        double double27 = grayPaintScale20.getUpperBound();
        double double28 = grayPaintScale20.getUpperBound();
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (byte) 10);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale12.equals(obj13);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) (byte) 10);
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        double double25 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale24.getPaint(0.0d);
        double double28 = grayPaintScale24.getUpperBound();
        boolean boolean29 = grayPaintScale20.equals((java.lang.Object) grayPaintScale24);
        double double30 = grayPaintScale24.getUpperBound();
        boolean boolean31 = grayPaintScale12.equals((java.lang.Object) double30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean36 = grayPaintScale34.equals((java.lang.Object) 0.0f);
        double double37 = grayPaintScale34.getUpperBound();
        double double38 = grayPaintScale34.getUpperBound();
        double double39 = grayPaintScale34.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale();
        double double41 = grayPaintScale40.getUpperBound();
        double double42 = grayPaintScale40.getUpperBound();
        boolean boolean43 = grayPaintScale34.equals((java.lang.Object) double42);
        java.lang.Class<?> wildcardClass44 = grayPaintScale34.getClass();
        boolean boolean45 = grayPaintScale12.equals((java.lang.Object) grayPaintScale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and grayPaintScale40", grayPaintScale24.equals(grayPaintScale40) ? grayPaintScale24.hashCode() == grayPaintScale40.hashCode() : true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100L);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = grayPaintScale0.clone();
        java.lang.Object obj22 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj21", grayPaintScale0.equals(obj21) ? grayPaintScale0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        double double13 = grayPaintScale12.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1L);
        java.lang.Class<?> wildcardClass17 = grayPaintScale16.getClass();
        boolean boolean18 = grayPaintScale12.equals((java.lang.Object) grayPaintScale16);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 97.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 0.0f);
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0);
        double double22 = grayPaintScale14.getUpperBound();
        boolean boolean23 = grayPaintScale10.equals((java.lang.Object) double22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double27 = grayPaintScale26.getUpperBound();
        boolean boolean28 = grayPaintScale10.equals((java.lang.Object) double27);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale10", grayPaintScale2.equals(grayPaintScale10) ? grayPaintScale2.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) '4');
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        double double12 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (byte) -1);
        double double19 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale15.getPaint((double) 1);
        java.awt.Paint paint23 = grayPaintScale15.getPaint((double) 1.0f);
        java.awt.Paint paint25 = grayPaintScale15.getPaint((double) (byte) 0);
        java.lang.Object obj26 = grayPaintScale15.clone();
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj26", grayPaintScale15.equals(obj26) ? grayPaintScale15.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) true);
        double double16 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint19 = grayPaintScale8.getPaint((double) 10.0f);
        java.lang.Object obj20 = grayPaintScale8.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj20", grayPaintScale8.equals(obj20) ? grayPaintScale8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        java.lang.Object obj12 = grayPaintScale11.clone();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint21 = grayPaintScale19.getPaint(0.0d);
        double double22 = grayPaintScale19.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) double30);
        double double32 = grayPaintScale26.getUpperBound();
        double double33 = grayPaintScale26.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        boolean boolean37 = grayPaintScale26.equals((java.lang.Object) grayPaintScale36);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean42 = grayPaintScale40.equals((java.lang.Object) (byte) -1);
        double double43 = grayPaintScale40.getLowerBound();
        double double44 = grayPaintScale40.getUpperBound();
        boolean boolean45 = grayPaintScale26.equals((java.lang.Object) double44);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale48 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale49 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean51 = grayPaintScale49.equals((java.lang.Object) (-1.0d));
        boolean boolean53 = grayPaintScale49.equals((java.lang.Object) (byte) 1);
        boolean boolean54 = grayPaintScale48.equals((java.lang.Object) grayPaintScale49);
        java.lang.Class<?> wildcardClass55 = grayPaintScale49.getClass();
        boolean boolean56 = grayPaintScale26.equals((java.lang.Object) wildcardClass55);
        boolean boolean57 = grayPaintScale19.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale49", grayPaintScale6.equals(grayPaintScale49) ? grayPaintScale6.hashCode() == grayPaintScale49.hashCode() : true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        double double16 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0);
        double double19 = grayPaintScale11.getLowerBound();
        double double20 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale11.getPaint((double) 0);
        double double23 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) 0.0f);
        double double29 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale26.getClass();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) wildcardClass30);
        double double32 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean37 = grayPaintScale35.equals((java.lang.Object) (byte) 10);
        boolean boolean38 = grayPaintScale11.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean42 = grayPaintScale11.equals((java.lang.Object) grayPaintScale41);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint47 = grayPaintScale45.getPaint((double) 1L);
        boolean boolean48 = grayPaintScale41.equals((java.lang.Object) 1L);
        java.awt.Paint paint50 = grayPaintScale41.getPaint(97.0d);
        double double51 = grayPaintScale41.getUpperBound();
        java.lang.Class<?> wildcardClass52 = grayPaintScale41.getClass();
        boolean boolean53 = grayPaintScale0.equals((java.lang.Object) wildcardClass52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getUpperBound();
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getLowerBound();
        double double20 = grayPaintScale12.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale12.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) wildcardClass7);
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) true);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        double double16 = grayPaintScale10.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        double double18 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale23.equals(obj24);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale23", grayPaintScale2.equals(grayPaintScale23) ? grayPaintScale2.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1L);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) 10);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        double double16 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0);
        double double19 = grayPaintScale11.getLowerBound();
        double double20 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale11.getPaint((double) 0);
        double double23 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) 0.0f);
        double double29 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale26.getClass();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = grayPaintScale6.equals((java.lang.Object) grayPaintScale11);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj34 = grayPaintScale2.clone();
        double double35 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj34", grayPaintScale2.equals(obj34) ? grayPaintScale2.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) ' ');
        java.lang.Object obj15 = grayPaintScale9.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double14 = grayPaintScale12.getLowerBound();
        double double15 = grayPaintScale12.getUpperBound();
        java.lang.Object obj16 = grayPaintScale12.clone();
        double double17 = grayPaintScale12.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj16", grayPaintScale12.equals(obj16) ? grayPaintScale12.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double25 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double29 = grayPaintScale28.getLowerBound();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) double29);
        double double31 = grayPaintScale2.getLowerBound();
        java.lang.Object obj32 = grayPaintScale2.clone();
        java.lang.Object obj33 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale2.equals(obj7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (-1));
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getLowerBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) true);
        double double14 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale6.equals((java.lang.Object) grayPaintScale10);
        double double16 = grayPaintScale10.getUpperBound();
        double double17 = grayPaintScale10.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) double13);
        double double15 = grayPaintScale9.getUpperBound();
        double double16 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getUpperBound();
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) double22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double27 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass30 = grayPaintScale26.getClass();
        boolean boolean31 = grayPaintScale9.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale12", grayPaintScale5.equals(grayPaintScale12) ? grayPaintScale5.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale3.getPaint(0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(0.0d);
        double double14 = grayPaintScale3.getLowerBound();
        double double15 = grayPaintScale3.getLowerBound();
        java.lang.Object obj16 = grayPaintScale3.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj16", grayPaintScale3.equals(obj16) ? grayPaintScale3.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        double double13 = grayPaintScale0.getUpperBound();
        double double14 = grayPaintScale0.getLowerBound();
        double double15 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale16.getPaint(0.0d);
        double double24 = grayPaintScale16.getUpperBound();
        java.lang.Object obj25 = grayPaintScale16.clone();
        boolean boolean26 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale12.equals(obj15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint25 = grayPaintScale23.getPaint(0.0d);
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean27 = grayPaintScale19.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale0.equals((java.lang.Object) double26);
        java.awt.Paint paint30 = grayPaintScale0.getPaint((double) (short) 0);
        java.lang.Object obj31 = grayPaintScale0.clone();
        java.lang.Object obj32 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj31", grayPaintScale0.equals(obj31) ? grayPaintScale0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (short) 100);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (short) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) boolean7);
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0);
        double double14 = grayPaintScale6.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double21 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale20.getPaint(0.0d);
        double double24 = grayPaintScale20.getLowerBound();
        java.lang.Object obj25 = grayPaintScale20.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj25", grayPaintScale20.equals(obj25) ? grayPaintScale20.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        boolean boolean21 = grayPaintScale5.equals((java.lang.Object) double20);
        double double22 = grayPaintScale5.getLowerBound();
        double double23 = grayPaintScale5.getUpperBound();
        double double24 = grayPaintScale5.getLowerBound();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double26 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        double double28 = grayPaintScale27.getUpperBound();
        boolean boolean30 = grayPaintScale27.equals((java.lang.Object) true);
        double double31 = grayPaintScale27.getLowerBound();
        double double32 = grayPaintScale27.getUpperBound();
        java.lang.Object obj33 = grayPaintScale27.clone();
        boolean boolean34 = grayPaintScale5.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale27", grayPaintScale5.equals(grayPaintScale27) ? grayPaintScale5.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) double17);
        double double19 = grayPaintScale13.getUpperBound();
        double double20 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        double double22 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint(0.0d);
        double double25 = grayPaintScale21.getUpperBound();
        double double26 = grayPaintScale21.getUpperBound();
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double29 = grayPaintScale13.getLowerBound();
        double double30 = grayPaintScale13.getLowerBound();
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale21", grayPaintScale0.equals(grayPaintScale21) ? grayPaintScale0.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, 32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean14 = grayPaintScale11.equals((java.lang.Object) grayPaintScale12);
        double double15 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean21 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) boolean21);
        java.lang.Object obj23 = grayPaintScale8.clone();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj23", grayPaintScale8.equals(obj23) ? grayPaintScale8.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (byte) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (-1));
        java.lang.Object obj12 = grayPaintScale6.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (byte) -1);
        double double19 = grayPaintScale15.getLowerBound();
        double double20 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale15.getPaint(32.0d);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 97.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj18 = grayPaintScale15.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj18", grayPaintScale15.equals(obj18) ? grayPaintScale15.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint(0.0d);
        double double16 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) double16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj23 = grayPaintScale20.clone();
        java.lang.Object obj24 = grayPaintScale20.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj5", grayPaintScale3.equals(obj5) ? grayPaintScale3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) 0);
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double16 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass20 = grayPaintScale19.getClass();
        boolean boolean21 = grayPaintScale15.equals((java.lang.Object) wildcardClass20);
        double double22 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass23 = grayPaintScale15.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '4');
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 97.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        double double10 = grayPaintScale4.getUpperBound();
        double double11 = grayPaintScale4.getUpperBound();
        double double12 = grayPaintScale4.getUpperBound();
        double double13 = grayPaintScale4.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double17 = grayPaintScale16.getUpperBound();
        double double18 = grayPaintScale16.getUpperBound();
        java.lang.Object obj19 = null;
        boolean boolean20 = grayPaintScale16.equals(obj19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint(0.0d);
        double double30 = grayPaintScale27.getUpperBound();
        boolean boolean31 = grayPaintScale23.equals((java.lang.Object) double30);
        boolean boolean32 = grayPaintScale4.equals((java.lang.Object) double30);
        double double33 = grayPaintScale4.getUpperBound();
        double double34 = grayPaintScale4.getUpperBound();
        java.lang.Object obj35 = grayPaintScale4.clone();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj35", grayPaintScale4.equals(obj35) ? grayPaintScale4.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double13 = grayPaintScale12.getUpperBound();
        java.lang.Object obj14 = grayPaintScale12.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj14", grayPaintScale12.equals(obj14) ? grayPaintScale12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 1);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) (-1.0d));
        boolean boolean16 = grayPaintScale12.equals((java.lang.Object) (byte) 1);
        boolean boolean17 = grayPaintScale11.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) (short) 1);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 97.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double25 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double29 = grayPaintScale28.getLowerBound();
        java.lang.Object obj30 = null;
        boolean boolean31 = grayPaintScale28.equals(obj30);
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) (byte) 100);
        double double34 = grayPaintScale28.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint39 = grayPaintScale37.getPaint((double) 1.0f);
        double double40 = grayPaintScale37.getUpperBound();
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) 1L);
        double double43 = grayPaintScale37.getLowerBound();
        boolean boolean44 = grayPaintScale28.equals((java.lang.Object) grayPaintScale37);
        boolean boolean45 = grayPaintScale5.equals((java.lang.Object) grayPaintScale28);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale();
        double double47 = grayPaintScale46.getUpperBound();
        java.awt.Paint paint49 = grayPaintScale46.getPaint(0.0d);
        boolean boolean51 = grayPaintScale46.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint53 = grayPaintScale46.getPaint((double) 0);
        double double54 = grayPaintScale46.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale57 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double58 = grayPaintScale57.getUpperBound();
        java.awt.Paint paint60 = grayPaintScale57.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale63 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean64 = grayPaintScale57.equals((java.lang.Object) '#');
        java.awt.Paint paint66 = grayPaintScale57.getPaint((double) '#');
        boolean boolean67 = grayPaintScale46.equals((java.lang.Object) paint66);
        boolean boolean68 = grayPaintScale5.equals((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale46", grayPaintScale9.equals(grayPaintScale46) ? grayPaintScale9.hashCode() == grayPaintScale46.hashCode() : true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) (byte) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale5.equals(obj12);
        boolean boolean14 = grayPaintScale2.equals(obj12);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) double22);
        double double24 = grayPaintScale18.getUpperBound();
        double double25 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint(0.0d);
        double double30 = grayPaintScale26.getUpperBound();
        double double31 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass32 = grayPaintScale26.getClass();
        boolean boolean33 = grayPaintScale18.equals((java.lang.Object) wildcardClass32);
        double double34 = grayPaintScale18.getLowerBound();
        double double35 = grayPaintScale18.getUpperBound();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        double double12 = grayPaintScale10.getUpperBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale10.getClass();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getUpperBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        double double15 = grayPaintScale2.getLowerBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) 0.0f);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        double double18 = grayPaintScale12.getUpperBound();
        boolean boolean19 = grayPaintScale8.equals((java.lang.Object) double18);
        double double20 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        double double22 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint(0.0d);
        double double25 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale21.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass28 = paint27.getClass();
        boolean boolean29 = grayPaintScale8.equals((java.lang.Object) wildcardClass28);
        double double30 = grayPaintScale8.getLowerBound();
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale21", grayPaintScale0.equals(grayPaintScale21) ? grayPaintScale0.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (short) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) boolean12);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) boolean13);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getUpperBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 'a');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) 1.0f);
        double double18 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) grayPaintScale21);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        double double25 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale24.getPaint((double) 0);
        double double28 = grayPaintScale24.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10L);
        boolean boolean32 = grayPaintScale24.equals((java.lang.Object) grayPaintScale31);
        double double33 = grayPaintScale31.getLowerBound();
        double double34 = grayPaintScale31.getUpperBound();
        double double35 = grayPaintScale31.getLowerBound();
        boolean boolean36 = grayPaintScale0.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale24", grayPaintScale0.equals(grayPaintScale24) ? grayPaintScale0.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 97.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double10 = grayPaintScale7.getUpperBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale7.equals(obj11);
        java.lang.Object obj13 = grayPaintScale7.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj13", grayPaintScale7.equals(obj13) ? grayPaintScale7.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        double double5 = grayPaintScale4.getLowerBound();
        double double6 = grayPaintScale4.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) double6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) double16);
        java.lang.Object obj18 = grayPaintScale0.clone();
        double double19 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj18", grayPaintScale0.equals(obj18) ? grayPaintScale0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, 32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) grayPaintScale9);
        double double12 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale8.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean18 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale5.getUpperBound();
        java.lang.Object obj21 = grayPaintScale5.clone();
        boolean boolean22 = grayPaintScale2.equals(obj21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj21", grayPaintScale5.equals(obj21) ? grayPaintScale5.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getUpperBound();
        double double12 = grayPaintScale6.getLowerBound();
        double double13 = grayPaintScale6.getUpperBound();
        double double14 = grayPaintScale6.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double19 = grayPaintScale18.getLowerBound();
        java.lang.Object obj20 = grayPaintScale18.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj20", grayPaintScale18.equals(obj20) ? grayPaintScale18.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint(1.0d);
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 'a');
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) (byte) 10);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getLowerBound();
        double double22 = grayPaintScale17.getLowerBound();
        boolean boolean23 = grayPaintScale12.equals((java.lang.Object) grayPaintScale17);
        double double24 = grayPaintScale17.getUpperBound();
        java.lang.Object obj25 = grayPaintScale17.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj25", grayPaintScale17.equals(obj25) ? grayPaintScale17.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 10L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint(1.0d);
        boolean boolean13 = grayPaintScale3.equals((java.lang.Object) paint12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) (-1));
        double double19 = grayPaintScale16.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale16.getClass();
        boolean boolean21 = grayPaintScale3.equals((java.lang.Object) wildcardClass20);
        double double22 = grayPaintScale3.getUpperBound();
        java.lang.Object obj23 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double27 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint((double) 10);
        boolean boolean30 = grayPaintScale3.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj23", grayPaintScale3.equals(obj23) ? grayPaintScale3.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        boolean boolean5 = grayPaintScale2.equals(obj3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        double double16 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale7.getPaint((double) 0);
        double double19 = grayPaintScale7.getLowerBound();
        double double20 = grayPaintScale7.getUpperBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 'a');
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0.0f);
        double double17 = grayPaintScale9.getUpperBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale9.getClass();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale12", grayPaintScale2.equals(grayPaintScale12) ? grayPaintScale2.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean21 = grayPaintScale18.equals((java.lang.Object) grayPaintScale19);
        double double22 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale18.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean28 = grayPaintScale18.equals((java.lang.Object) 0.0d);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale19", grayPaintScale3.equals(grayPaintScale19) ? grayPaintScale3.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale12.equals(obj13);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        double double16 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale8.getPaint((double) (byte) 0);
        java.lang.Object obj19 = grayPaintScale8.clone();
        java.awt.Paint paint21 = grayPaintScale8.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj19", grayPaintScale8.equals(obj19) ? grayPaintScale8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint21 = grayPaintScale19.getPaint(0.0d);
        double double22 = grayPaintScale19.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 97.0d);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale26", grayPaintScale2.equals(grayPaintScale26) ? grayPaintScale2.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (byte) -1);
        double double15 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint((double) 1);
        java.awt.Paint paint19 = grayPaintScale11.getPaint(0.0d);
        double double20 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale23.equals(obj24);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getUpperBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale23.getClass();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale23", grayPaintScale2.equals(grayPaintScale23) ? grayPaintScale2.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 'a');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) double18);
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        double double23 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint(0.0d);
        double double26 = grayPaintScale22.getUpperBound();
        double double27 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass28 = grayPaintScale22.getClass();
        boolean boolean29 = grayPaintScale14.equals((java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = grayPaintScale14.getClass();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        double double36 = grayPaintScale35.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale35.getPaint((double) (-1.0f));
        java.awt.Paint paint40 = grayPaintScale35.getPaint((double) (short) -1);
        java.lang.Class<?> wildcardClass41 = grayPaintScale35.getClass();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) wildcardClass41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint(1.0d);
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale2.equals(obj17);
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double26 = grayPaintScale25.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) double26);
        double double28 = grayPaintScale22.getUpperBound();
        double double29 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double33 = grayPaintScale32.getUpperBound();
        double double34 = grayPaintScale32.getUpperBound();
        java.lang.Object obj35 = null;
        boolean boolean36 = grayPaintScale32.equals(obj35);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean40 = grayPaintScale32.equals((java.lang.Object) grayPaintScale39);
        boolean boolean41 = grayPaintScale22.equals((java.lang.Object) grayPaintScale32);
        java.lang.Object obj42 = grayPaintScale32.clone();
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 0.0f);
        double double16 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale17.getPaint((double) 0);
        double double25 = grayPaintScale17.getUpperBound();
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) double25);
        double double27 = grayPaintScale13.getUpperBound();
        double double28 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint33 = grayPaintScale31.getPaint((double) 1.0f);
        double double34 = grayPaintScale31.getUpperBound();
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) 1L);
        java.awt.Paint paint38 = grayPaintScale31.getPaint((double) (short) 10);
        boolean boolean39 = grayPaintScale13.equals((java.lang.Object) (short) 10);
        boolean boolean40 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        java.lang.Object obj24 = grayPaintScale23.clone();
        boolean boolean25 = grayPaintScale2.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj24", grayPaintScale23.equals(obj24) ? grayPaintScale23.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1));
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = grayPaintScale6.equals(obj7);
        java.lang.Object obj10 = grayPaintScale6.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj10", grayPaintScale6.equals(obj10) ? grayPaintScale6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) true);
        double double16 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getLowerBound();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) double19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        double double15 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double24 = grayPaintScale23.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) double24);
        double double26 = grayPaintScale20.getUpperBound();
        double double27 = grayPaintScale20.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        double double29 = grayPaintScale28.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale28.getPaint(0.0d);
        double double32 = grayPaintScale28.getUpperBound();
        double double33 = grayPaintScale28.getLowerBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale28.getClass();
        boolean boolean35 = grayPaintScale20.equals((java.lang.Object) wildcardClass34);
        double double36 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale20.getPaint(10.0d);
        double double39 = grayPaintScale20.getLowerBound();
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) double39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale23", grayPaintScale2.equals(grayPaintScale23) ? grayPaintScale2.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) grayPaintScale9);
        double double13 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) 1.0f);
        double double19 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean23 = grayPaintScale16.equals((java.lang.Object) grayPaintScale22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj27 = null;
        boolean boolean28 = grayPaintScale26.equals(obj27);
        boolean boolean29 = grayPaintScale22.equals((java.lang.Object) grayPaintScale26);
        boolean boolean30 = grayPaintScale8.equals((java.lang.Object) boolean29);
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) double12);
        double double14 = grayPaintScale0.getLowerBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        java.lang.Object obj16 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (byte) -1);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 10L);
        double double19 = grayPaintScale10.getUpperBound();
        double double20 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean24 = grayPaintScale21.equals((java.lang.Object) true);
        java.lang.Object obj25 = grayPaintScale21.clone();
        boolean boolean26 = grayPaintScale10.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale21", grayPaintScale0.equals(grayPaintScale21) ? grayPaintScale0.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double6 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        double double16 = grayPaintScale7.getLowerBound();
        boolean boolean17 = grayPaintScale5.equals((java.lang.Object) double16);
        double double18 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale5.getPaint(52.0d);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '#');
        double double9 = grayPaintScale8.getUpperBound();
        java.lang.Object obj10 = grayPaintScale8.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        double double12 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) grayPaintScale30);
        java.awt.Paint paint33 = grayPaintScale0.getPaint((double) (byte) 0);
        double double34 = grayPaintScale0.getUpperBound();
        java.lang.Object obj35 = grayPaintScale0.clone();
        java.awt.Paint paint37 = grayPaintScale0.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj35", grayPaintScale0.equals(obj35) ? grayPaintScale0.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = grayPaintScale11.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) wildcardClass12);
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double18 = grayPaintScale17.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        double double21 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale20.getPaint(0.0d);
        double double24 = grayPaintScale20.getUpperBound();
        double double25 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 0);
        double double28 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint((double) 0);
        double double31 = grayPaintScale20.getUpperBound();
        double double32 = grayPaintScale20.getUpperBound();
        double double33 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 'a');
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) (-1.0f));
        boolean boolean39 = grayPaintScale20.equals((java.lang.Object) grayPaintScale36);
        java.lang.Class<?> wildcardClass40 = grayPaintScale20.getClass();
        boolean boolean41 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale36", grayPaintScale2.equals(grayPaintScale36) ? grayPaintScale2.hashCode() == grayPaintScale36.hashCode() : true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) 0);
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) double11);
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) double9);
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale13.getClass();
        boolean boolean20 = grayPaintScale5.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale5.getLowerBound();
        double double22 = grayPaintScale5.getUpperBound();
        java.lang.Class<?> wildcardClass23 = grayPaintScale5.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale13", grayPaintScale2.equals(grayPaintScale13) ? grayPaintScale2.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) (byte) 10);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 1);
        double double20 = grayPaintScale15.getUpperBound();
        double double21 = grayPaintScale15.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) grayPaintScale7);
        double double10 = grayPaintScale7.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100);
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint12 = grayPaintScale10.getPaint(0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale17.equals(obj18);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) (byte) 10);
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        double double17 = grayPaintScale11.getUpperBound();
        java.lang.Object obj18 = grayPaintScale11.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj18", grayPaintScale11.equals(obj18) ? grayPaintScale11.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) (-1.0d));
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 'a');
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) 1.0f);
        java.lang.Object obj15 = grayPaintScale6.clone();
        double double16 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj15", grayPaintScale6.equals(obj15) ? grayPaintScale6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint(0.0d);
        double double17 = grayPaintScale9.getUpperBound();
        double double18 = grayPaintScale9.getLowerBound();
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = grayPaintScale9.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        java.lang.Object obj21 = grayPaintScale19.clone();
        double double22 = grayPaintScale19.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj21", grayPaintScale19.equals(obj21) ? grayPaintScale19.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (byte) -1);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 10L);
        double double19 = grayPaintScale10.getUpperBound();
        double double20 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) '#');
        java.lang.Object obj24 = grayPaintScale23.clone();
        boolean boolean25 = grayPaintScale10.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj24", grayPaintScale23.equals(obj24) ? grayPaintScale23.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) double12);
        double double14 = grayPaintScale0.getLowerBound();
        java.lang.Object obj15 = grayPaintScale0.clone();
        double double16 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj15", grayPaintScale0.equals(obj15) ? grayPaintScale0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) false);
        double double19 = grayPaintScale13.getUpperBound();
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        double double21 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        double double23 = grayPaintScale22.getUpperBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) true);
        double double26 = grayPaintScale22.getUpperBound();
        double double27 = grayPaintScale22.getLowerBound();
        double double28 = grayPaintScale22.getLowerBound();
        boolean boolean29 = grayPaintScale9.equals((java.lang.Object) double28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale22", grayPaintScale13.equals(grayPaintScale22) ? grayPaintScale13.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 32.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) -1);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) double9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (byte) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (-1));
        java.lang.Object obj19 = grayPaintScale13.clone();
        boolean boolean20 = grayPaintScale2.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj19", grayPaintScale13.equals(obj19) ? grayPaintScale13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (short) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) boolean7);
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getUpperBound();
        double double18 = grayPaintScale12.getLowerBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale23.equals(obj24);
        java.awt.Paint paint27 = grayPaintScale23.getPaint(0.0d);
        double double28 = grayPaintScale23.getUpperBound();
        java.lang.Object obj29 = grayPaintScale23.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale23", grayPaintScale2.equals(grayPaintScale23) ? grayPaintScale2.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        double double6 = grayPaintScale4.getUpperBound();
        double double7 = grayPaintScale4.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale10.equals(obj11);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        boolean boolean16 = grayPaintScale4.equals((java.lang.Object) grayPaintScale10);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint25 = grayPaintScale18.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double29 = grayPaintScale28.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale28.getPaint((double) (byte) -1);
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) (-1));
        boolean boolean34 = grayPaintScale18.equals((java.lang.Object) grayPaintScale28);
        boolean boolean35 = grayPaintScale10.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale18", grayPaintScale4.equals(grayPaintScale18) ? grayPaintScale4.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (byte) 10);
        double double8 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 10);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.awt.Paint paint9 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        boolean boolean9 = grayPaintScale4.equals((java.lang.Object) 100.0f);
        double double10 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale4.getPaint(0.0d);
        double double13 = grayPaintScale4.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean24 = grayPaintScale20.equals((java.lang.Object) 'a');
        double double25 = grayPaintScale20.getLowerBound();
        boolean boolean26 = grayPaintScale17.equals((java.lang.Object) grayPaintScale20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double30 = grayPaintScale29.getUpperBound();
        boolean boolean31 = grayPaintScale20.equals((java.lang.Object) grayPaintScale29);
        double double32 = grayPaintScale29.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale();
        double double34 = grayPaintScale33.getLowerBound();
        java.lang.Class<?> wildcardClass35 = grayPaintScale33.getClass();
        boolean boolean36 = grayPaintScale29.equals((java.lang.Object) grayPaintScale33);
        double double37 = grayPaintScale29.getUpperBound();
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) double37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale33", grayPaintScale4.equals(grayPaintScale33) ? grayPaintScale4.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) '#');
        double double7 = grayPaintScale6.getUpperBound();
        double double8 = grayPaintScale6.getUpperBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj9", grayPaintScale6.equals(obj9) ? grayPaintScale6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 1);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        java.lang.Object obj14 = grayPaintScale12.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj14", grayPaintScale12.equals(obj14) ? grayPaintScale12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double9 = grayPaintScale8.getLowerBound();
        double double10 = grayPaintScale8.getUpperBound();
        double double11 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) true);
        double double16 = grayPaintScale12.getUpperBound();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale16.getPaint(0.0d);
        double double24 = grayPaintScale16.getUpperBound();
        double double25 = grayPaintScale16.getLowerBound();
        double double26 = grayPaintScale16.getLowerBound();
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale0.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getLowerBound();
        double double16 = grayPaintScale2.getLowerBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        double double19 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) (-1.0d));
        boolean boolean24 = grayPaintScale20.equals((java.lang.Object) (byte) 1);
        double double25 = grayPaintScale20.getLowerBound();
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) 0.0f);
        double double33 = grayPaintScale30.getUpperBound();
        double double34 = grayPaintScale30.getUpperBound();
        double double35 = grayPaintScale30.getLowerBound();
        boolean boolean36 = grayPaintScale20.equals((java.lang.Object) double35);
        double double37 = grayPaintScale20.getLowerBound();
        double double38 = grayPaintScale20.getUpperBound();
        double double39 = grayPaintScale20.getLowerBound();
        double double40 = grayPaintScale20.getUpperBound();
        java.lang.Class<?> wildcardClass41 = grayPaintScale20.getClass();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale30", grayPaintScale6.equals(grayPaintScale30) ? grayPaintScale6.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) '#');
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) '#');
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 'a');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) (byte) 10);
        double double10 = grayPaintScale7.getUpperBound();
        double double11 = grayPaintScale7.getLowerBound();
        double double12 = grayPaintScale7.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getUpperBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        boolean boolean20 = grayPaintScale2.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj19", grayPaintScale16.equals(obj19) ? grayPaintScale16.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) 0);
        double double9 = grayPaintScale5.getLowerBound();
        double double10 = grayPaintScale5.getUpperBound();
        java.lang.Object obj11 = grayPaintScale5.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj11", grayPaintScale5.equals(obj11) ? grayPaintScale5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        java.lang.Class<?> wildcardClass10 = grayPaintScale5.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) wildcardClass10);
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 'a');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj17 = grayPaintScale5.clone();
        java.awt.Paint paint19 = grayPaintScale5.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj17", grayPaintScale5.equals(obj17) ? grayPaintScale5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getLowerBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        double double14 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale2.equals(obj9);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint(0.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale15.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = paint21.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.lang.Object obj25 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj24", grayPaintScale2.equals(obj24) ? grayPaintScale2.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Class<?> wildcardClass10 = grayPaintScale9.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) ' ');
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale0.equals(obj5);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) (short) 1);
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale6.equals(obj14);
        java.lang.Object obj16 = grayPaintScale6.clone();
        java.lang.Class<?> wildcardClass17 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj16", grayPaintScale6.equals(obj16) ? grayPaintScale6.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale2.equals(obj7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1.0f);
        java.lang.Object obj13 = grayPaintScale12.clone();
        boolean boolean14 = grayPaintScale2.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (byte) -1);
        double double12 = grayPaintScale8.getLowerBound();
        double double13 = grayPaintScale8.getLowerBound();
        java.lang.Object obj14 = grayPaintScale8.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj14", grayPaintScale8.equals(obj14) ? grayPaintScale8.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '4');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 1);
        double double8 = grayPaintScale7.getUpperBound();
        double double9 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getLowerBound();
        double double16 = grayPaintScale13.getLowerBound();
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getUpperBound();
        double double19 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double26 = grayPaintScale25.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) double26);
        double double28 = grayPaintScale22.getUpperBound();
        double double29 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        double double31 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale30.getPaint(0.0d);
        double double34 = grayPaintScale30.getUpperBound();
        double double35 = grayPaintScale30.getLowerBound();
        java.lang.Class<?> wildcardClass36 = grayPaintScale30.getClass();
        boolean boolean37 = grayPaintScale22.equals((java.lang.Object) wildcardClass36);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double41 = grayPaintScale40.getUpperBound();
        boolean boolean42 = grayPaintScale22.equals((java.lang.Object) grayPaintScale40);
        double double43 = grayPaintScale40.getLowerBound();
        double double44 = grayPaintScale40.getUpperBound();
        boolean boolean45 = grayPaintScale13.equals((java.lang.Object) double44);
        boolean boolean46 = grayPaintScale7.equals((java.lang.Object) boolean45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale30", grayPaintScale7.equals(grayPaintScale30) ? grayPaintScale7.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale2.equals(obj9);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(32.0d);
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 97.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint(0.0d);
        boolean boolean13 = grayPaintScale4.equals((java.lang.Object) (-1));
        java.awt.Paint paint15 = grayPaintScale4.getPaint(1.0d);
        java.lang.Object obj16 = grayPaintScale4.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj16", grayPaintScale4.equals(obj16) ? grayPaintScale4.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (byte) -1);
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) 10);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) ' ');
        java.lang.Object obj15 = grayPaintScale6.clone();
        double double16 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj15", grayPaintScale6.equals(obj15) ? grayPaintScale6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint(1.0d);
        boolean boolean13 = grayPaintScale3.equals((java.lang.Object) paint12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) (-1));
        double double19 = grayPaintScale16.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale16.getClass();
        boolean boolean21 = grayPaintScale3.equals((java.lang.Object) wildcardClass20);
        double double22 = grayPaintScale3.getUpperBound();
        java.lang.Object obj23 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass24 = grayPaintScale3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj23", grayPaintScale3.equals(obj23) ? grayPaintScale3.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Object obj10 = grayPaintScale9.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
        double double13 = grayPaintScale0.getUpperBound();
        java.lang.Object obj14 = grayPaintScale0.clone();
        double double15 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (byte) 1);
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double22 = grayPaintScale21.getUpperBound();
        boolean boolean23 = grayPaintScale14.equals((java.lang.Object) grayPaintScale21);
        boolean boolean24 = grayPaintScale11.equals((java.lang.Object) boolean23);
        double double25 = grayPaintScale11.getUpperBound();
        boolean boolean26 = grayPaintScale0.equals((java.lang.Object) double25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        double double28 = grayPaintScale27.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale27.getPaint(0.0d);
        double double31 = grayPaintScale27.getUpperBound();
        double double32 = grayPaintScale27.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale27.getPaint((double) 0);
        double double35 = grayPaintScale27.getUpperBound();
        double double36 = grayPaintScale27.getUpperBound();
        double double37 = grayPaintScale27.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        boolean boolean41 = grayPaintScale27.equals((java.lang.Object) (short) 10);
        boolean boolean42 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale27", grayPaintScale0.equals(grayPaintScale27) ? grayPaintScale0.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getLowerBound();
        double double9 = grayPaintScale3.getUpperBound();
        double double10 = grayPaintScale3.getUpperBound();
        double double11 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale3.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj14", grayPaintScale3.equals(obj14) ? grayPaintScale3.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getLowerBound();
        double double12 = grayPaintScale9.getLowerBound();
        double double13 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) '4');
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj19 = null;
        boolean boolean20 = grayPaintScale18.equals(obj19);
        java.lang.Class<?> wildcardClass21 = grayPaintScale18.getClass();
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = grayPaintScale15.getClass();
        boolean boolean24 = grayPaintScale10.equals((java.lang.Object) wildcardClass23);
        double double25 = grayPaintScale10.getLowerBound();
        double double26 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass27 = grayPaintScale10.getClass();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double14 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 0.0f);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        double double23 = grayPaintScale17.getUpperBound();
        boolean boolean24 = grayPaintScale13.equals((java.lang.Object) double23);
        double double25 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale13.getPaint((double) (byte) 10);
        double double28 = grayPaintScale13.getLowerBound();
        java.lang.Object obj29 = grayPaintScale13.clone();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale17", grayPaintScale5.equals(grayPaintScale17) ? grayPaintScale5.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0);
        double double14 = grayPaintScale6.getUpperBound();
        double double15 = grayPaintScale6.getUpperBound();
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getLowerBound();
        double double18 = grayPaintScale6.getUpperBound();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double13 = grayPaintScale12.getLowerBound();
        double double14 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj21 = null;
        boolean boolean22 = grayPaintScale20.equals(obj21);
        java.lang.Class<?> wildcardClass23 = grayPaintScale20.getClass();
        boolean boolean24 = grayPaintScale17.equals((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = grayPaintScale17.getClass();
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) wildcardClass25);
        double double27 = grayPaintScale12.getLowerBound();
        double double28 = grayPaintScale12.getUpperBound();
        java.lang.Object obj29 = grayPaintScale12.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getUpperBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (-1.0d));
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        double double11 = grayPaintScale6.getUpperBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) ' ');
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean27 = grayPaintScale23.equals((java.lang.Object) 'a');
        double double28 = grayPaintScale23.getLowerBound();
        boolean boolean29 = grayPaintScale20.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double33 = grayPaintScale32.getUpperBound();
        boolean boolean34 = grayPaintScale23.equals((java.lang.Object) grayPaintScale32);
        double double35 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint37 = grayPaintScale23.getPaint((double) (short) 100);
        java.lang.Object obj38 = grayPaintScale23.clone();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj38", grayPaintScale23.equals(obj38) ? grayPaintScale23.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale10.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) wildcardClass16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        double double23 = grayPaintScale20.getUpperBound();
        java.lang.Object obj24 = grayPaintScale20.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj24", grayPaintScale20.equals(obj24) ? grayPaintScale20.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) double9);
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double17 = grayPaintScale16.getUpperBound();
        double double18 = grayPaintScale16.getUpperBound();
        double double19 = grayPaintScale16.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        double double21 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (short) 10);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale24", grayPaintScale8.equals(grayPaintScale24) ? grayPaintScale8.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 100.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 0.0f);
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        boolean boolean21 = grayPaintScale5.equals((java.lang.Object) double20);
        double double22 = grayPaintScale5.getLowerBound();
        double double23 = grayPaintScale5.getUpperBound();
        double double24 = grayPaintScale5.getLowerBound();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj26 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj26", grayPaintScale2.equals(obj26) ? grayPaintScale2.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) false);
        double double19 = grayPaintScale13.getUpperBound();
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        java.lang.Object obj21 = grayPaintScale9.clone();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj21", grayPaintScale9.equals(obj21) ? grayPaintScale9.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getLowerBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) true);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getUpperBound();
        double double19 = grayPaintScale13.getUpperBound();
        double double20 = grayPaintScale13.getLowerBound();
        double double21 = grayPaintScale13.getLowerBound();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 32.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 35.0d);
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals(obj9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1L);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (byte) 10);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        double double16 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0);
        double double19 = grayPaintScale11.getLowerBound();
        double double20 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale11.getPaint((double) 0);
        double double23 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) 0.0f);
        double double29 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale26.getClass();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = grayPaintScale6.equals((java.lang.Object) grayPaintScale11);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj34 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj34", grayPaintScale2.equals(obj34) ? grayPaintScale2.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 1);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) 0.0f);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        double double18 = grayPaintScale12.getUpperBound();
        boolean boolean19 = grayPaintScale8.equals((java.lang.Object) double18);
        double double20 = grayPaintScale8.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getUpperBound();
        double double9 = grayPaintScale6.getLowerBound();
        double double10 = grayPaintScale6.getLowerBound();
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint(0.0d);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) paint9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double14 = grayPaintScale13.getLowerBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale13.equals(obj15);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (byte) 100);
        double double19 = grayPaintScale13.getUpperBound();
        double double20 = grayPaintScale13.getUpperBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean26 = grayPaintScale22.equals((java.lang.Object) grayPaintScale25);
        double double27 = grayPaintScale25.getLowerBound();
        double double28 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double35 = grayPaintScale34.getUpperBound();
        boolean boolean36 = grayPaintScale31.equals((java.lang.Object) double35);
        boolean boolean37 = grayPaintScale25.equals((java.lang.Object) grayPaintScale31);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double41 = grayPaintScale40.getLowerBound();
        double double42 = grayPaintScale40.getLowerBound();
        double double43 = grayPaintScale40.getLowerBound();
        boolean boolean44 = grayPaintScale31.equals((java.lang.Object) grayPaintScale40);
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale40", grayPaintScale2.equals(grayPaintScale40) ? grayPaintScale2.hashCode() == grayPaintScale40.hashCode() : true);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getUpperBound();
        boolean boolean21 = grayPaintScale15.equals((java.lang.Object) double20);
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj23 = grayPaintScale15.clone();
        java.lang.Object obj24 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }
}

