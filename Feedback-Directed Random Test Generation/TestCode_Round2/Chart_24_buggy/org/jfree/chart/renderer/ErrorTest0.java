package org.jfree.chart.renderer;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        double double3 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Class<?> wildcardClass4 = grayPaintScale3.getClass();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass3 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale1 = new org.jfree.chart.renderer.GrayPaintScale();
        double double2 = grayPaintScale1.getUpperBound();
        java.awt.Paint paint4 = grayPaintScale1.getPaint(0.0d);
        double double5 = grayPaintScale1.getUpperBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) grayPaintScale1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale1", grayPaintScale0.equals(grayPaintScale1) ? grayPaintScale0.hashCode() == grayPaintScale1.hashCode() : true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Class<?> wildcardClass5 = grayPaintScale4.getClass();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale4", grayPaintScale0.equals(grayPaintScale4) ? grayPaintScale0.hashCode() == grayPaintScale4.hashCode() : true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        double double2 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        java.lang.Object obj8 = grayPaintScale3.clone();
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass2 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        double double3 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj4 = grayPaintScale3.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj4", grayPaintScale3.equals(obj4) ? grayPaintScale3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getUpperBound();
        java.lang.Object obj11 = grayPaintScale5.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj11", grayPaintScale5.equals(obj11) ? grayPaintScale5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0);
        double double14 = grayPaintScale6.getLowerBound();
        java.lang.Object obj15 = grayPaintScale6.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) grayPaintScale10);
        boolean boolean13 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale10", grayPaintScale5.equals(grayPaintScale10) ? grayPaintScale5.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) 0);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double7 = grayPaintScale6.getUpperBound();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale0.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj8", grayPaintScale6.equals(obj8) ? grayPaintScale6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale5.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint((double) 0);
        double double12 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale4.getPaint((double) 0);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale4", grayPaintScale0.equals(grayPaintScale4) ? grayPaintScale0.hashCode() == grayPaintScale4.hashCode() : true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale5.clone();
        double double8 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj10 = grayPaintScale9.clone();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale3.getPaint(0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale3", grayPaintScale0.equals(grayPaintScale3) ? grayPaintScale0.hashCode() == grayPaintScale3.hashCode() : true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale10", grayPaintScale5.equals(grayPaintScale10) ? grayPaintScale5.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) grayPaintScale9);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getUpperBound();
        double double8 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale3.getPaint((double) 0);
        double double11 = grayPaintScale3.getLowerBound();
        java.lang.Object obj12 = grayPaintScale3.clone();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale3", grayPaintScale0.equals(grayPaintScale3) ? grayPaintScale0.hashCode() == grayPaintScale3.hashCode() : true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        double double12 = grayPaintScale8.getUpperBound();
        double double13 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale8.getPaint(0.0d);
        double double16 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale8.getPaint(0.0d);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        java.lang.Class<?> wildcardClass9 = grayPaintScale4.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Object obj4 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = grayPaintScale12.getClass();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getUpperBound();
        java.lang.Class<?> wildcardClass10 = grayPaintScale4.getClass();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale4", grayPaintScale0.equals(grayPaintScale4) ? grayPaintScale0.hashCode() == grayPaintScale4.hashCode() : true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        double double22 = grayPaintScale18.getUpperBound();
        double double23 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale18.getPaint(0.0d);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale18", grayPaintScale5.equals(grayPaintScale18) ? grayPaintScale5.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
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
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale12", grayPaintScale2.equals(grayPaintScale12) ? grayPaintScale2.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0);
        double double17 = grayPaintScale9.getLowerBound();
        java.lang.Object obj18 = grayPaintScale9.clone();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale4.getPaint((double) (short) 1);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) paint10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 0.0f);
        double double12 = grayPaintScale9.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale11.equals((java.lang.Object) grayPaintScale14);
        double double16 = grayPaintScale11.getLowerBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        double double11 = grayPaintScale6.getUpperBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        double double3 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 0.0f);
        double double17 = grayPaintScale14.getLowerBound();
        java.lang.Object obj18 = grayPaintScale14.clone();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj18", grayPaintScale14.equals(obj18) ? grayPaintScale14.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) 'a');
        java.lang.Object obj16 = grayPaintScale8.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) double10);
        double double12 = grayPaintScale6.getUpperBound();
        double double13 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale14.getClass();
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = grayPaintScale6.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale5.clone();
        java.lang.Object obj8 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = null;
        boolean boolean7 = grayPaintScale2.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale5.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (-1.0d));
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        double double11 = grayPaintScale6.getUpperBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) 0);
        double double23 = grayPaintScale15.getLowerBound();
        double double24 = grayPaintScale15.getLowerBound();
        double double25 = grayPaintScale15.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale15", grayPaintScale4.equals(grayPaintScale15) ? grayPaintScale4.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getUpperBound();
        double double16 = grayPaintScale10.getUpperBound();
        double double17 = grayPaintScale10.getLowerBound();
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale10", grayPaintScale0.equals(grayPaintScale10) ? grayPaintScale0.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
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
        java.awt.Paint paint36 = grayPaintScale18.getPaint(10.0d);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale26", grayPaintScale6.equals(grayPaintScale26) ? grayPaintScale6.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        java.lang.Object obj10 = grayPaintScale5.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj10", grayPaintScale5.equals(obj10) ? grayPaintScale5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        double double9 = grayPaintScale7.getUpperBound();
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint13 = grayPaintScale7.getPaint(0.0d);
        java.awt.Paint paint15 = grayPaintScale7.getPaint(0.0d);
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale7", grayPaintScale3.equals(grayPaintScale7) ? grayPaintScale3.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
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
        double double18 = grayPaintScale0.getUpperBound();
        double double19 = grayPaintScale0.getLowerBound();
        java.lang.Object obj20 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj20", grayPaintScale0.equals(obj20) ? grayPaintScale0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale13.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint19 = grayPaintScale13.getPaint(0.0d);
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 0.0f);
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
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
        boolean boolean40 = grayPaintScale17.equals((java.lang.Object) grayPaintScale20);
        double double41 = grayPaintScale20.getLowerBound();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) double41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale17", grayPaintScale2.equals(grayPaintScale17) ? grayPaintScale2.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) (-1.0d));
        boolean boolean15 = grayPaintScale11.equals((java.lang.Object) (byte) 1);
        double double16 = grayPaintScale11.getLowerBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
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
        boolean boolean33 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        boolean boolean34 = grayPaintScale0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale13", grayPaintScale0.equals(grayPaintScale13) ? grayPaintScale0.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Object obj2 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (short) 10);
        boolean boolean9 = grayPaintScale3.equals((java.lang.Object) 10.0f);
        boolean boolean11 = grayPaintScale3.equals((java.lang.Object) 1L);
        double double12 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale3.getPaint((double) 1.0f);
        java.lang.Object obj15 = grayPaintScale3.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj15", grayPaintScale3.equals(obj15) ? grayPaintScale3.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double25 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale24.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        double double29 = grayPaintScale28.getUpperBound();
        boolean boolean31 = grayPaintScale28.equals((java.lang.Object) true);
        double double32 = grayPaintScale28.getLowerBound();
        boolean boolean33 = grayPaintScale24.equals((java.lang.Object) grayPaintScale28);
        boolean boolean34 = grayPaintScale0.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale28", grayPaintScale0.equals(grayPaintScale28) ? grayPaintScale0.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getUpperBound();
        double double12 = grayPaintScale6.getLowerBound();
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getLowerBound();
        boolean boolean15 = grayPaintScale3.equals((java.lang.Object) double14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double15 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0);
        double double24 = grayPaintScale16.getLowerBound();
        double double25 = grayPaintScale16.getLowerBound();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) double25);
        double double27 = grayPaintScale14.getUpperBound();
        double double28 = grayPaintScale14.getLowerBound();
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
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
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
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
        double double26 = grayPaintScale8.getUpperBound();
        double double27 = grayPaintScale8.getLowerBound();
        boolean boolean28 = grayPaintScale5.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj29 = grayPaintScale5.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj29", grayPaintScale5.equals(obj29) ? grayPaintScale5.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
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
        double double23 = grayPaintScale20.getLowerBound();
        java.lang.Object obj24 = grayPaintScale20.clone();
        double double25 = grayPaintScale20.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj24", grayPaintScale20.equals(obj24) ? grayPaintScale20.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals(obj9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) 0.0f);
        double double25 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale22.getClass();
        boolean boolean27 = grayPaintScale7.equals((java.lang.Object) wildcardClass26);
        double double28 = grayPaintScale7.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) 0);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale7", grayPaintScale5.equals(grayPaintScale7) ? grayPaintScale5.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
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
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale3.clone();
        double double7 = grayPaintScale3.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj6", grayPaintScale3.equals(obj6) ? grayPaintScale3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        double double11 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
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
        double double27 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj26", grayPaintScale2.equals(obj26) ? grayPaintScale2.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double7 = grayPaintScale6.getUpperBound();
        double double8 = grayPaintScale6.getUpperBound();
        double double9 = grayPaintScale6.getUpperBound();
        java.lang.Object obj10 = grayPaintScale6.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj10", grayPaintScale6.equals(obj10) ? grayPaintScale6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
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
        double double18 = grayPaintScale0.getUpperBound();
        double double19 = grayPaintScale0.getLowerBound();
        java.lang.Object obj20 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        double double22 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint(0.0d);
        double double25 = grayPaintScale21.getUpperBound();
        double double26 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint28 = grayPaintScale21.getPaint((double) 0);
        double double29 = grayPaintScale21.getLowerBound();
        double double30 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint32 = grayPaintScale21.getPaint((double) 0);
        double double33 = grayPaintScale21.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean38 = grayPaintScale36.equals((java.lang.Object) 0.0f);
        double double39 = grayPaintScale36.getLowerBound();
        java.lang.Class<?> wildcardClass40 = grayPaintScale36.getClass();
        boolean boolean41 = grayPaintScale21.equals((java.lang.Object) wildcardClass40);
        double double42 = grayPaintScale21.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean47 = grayPaintScale45.equals((java.lang.Object) (byte) 10);
        boolean boolean48 = grayPaintScale21.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass49 = grayPaintScale21.getClass();
        boolean boolean50 = grayPaintScale0.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj20", grayPaintScale0.equals(obj20) ? grayPaintScale0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
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
        double double26 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) 1L);
        double double32 = grayPaintScale29.getUpperBound();
        double double33 = grayPaintScale29.getUpperBound();
        java.lang.Object obj34 = grayPaintScale29.clone();
        boolean boolean35 = grayPaintScale2.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale29 and obj34", grayPaintScale29.equals(obj34) ? grayPaintScale29.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
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
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Object obj18 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        boolean boolean9 = grayPaintScale4.equals((java.lang.Object) 100.0f);
        java.lang.Object obj10 = grayPaintScale4.clone();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.lang.Class<?> wildcardClass6 = grayPaintScale4.getClass();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        double double2 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0);
        double double15 = grayPaintScale7.getLowerBound();
        boolean boolean16 = grayPaintScale3.equals((java.lang.Object) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj6", grayPaintScale3.equals(obj6) ? grayPaintScale3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 97.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Object obj13 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean28 = grayPaintScale25.equals((java.lang.Object) grayPaintScale26);
        double double29 = grayPaintScale25.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale25.getPaint(32.0d);
        boolean boolean32 = grayPaintScale20.equals((java.lang.Object) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale26", grayPaintScale10.equals(grayPaintScale26) ? grayPaintScale10.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
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
        double double18 = grayPaintScale0.getUpperBound();
        double double19 = grayPaintScale0.getLowerBound();
        java.lang.Object obj20 = grayPaintScale0.clone();
        double double21 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj20", grayPaintScale0.equals(obj20) ? grayPaintScale0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        boolean boolean9 = grayPaintScale3.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj5", grayPaintScale3.equals(obj5) ? grayPaintScale3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
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
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj13", grayPaintScale6.equals(obj13) ? grayPaintScale6.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        double double30 = grayPaintScale29.getUpperBound();
        double double31 = grayPaintScale29.getUpperBound();
        boolean boolean33 = grayPaintScale29.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint35 = grayPaintScale29.getPaint(0.0d);
        boolean boolean36 = grayPaintScale7.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale29", grayPaintScale7.equals(grayPaintScale29) ? grayPaintScale7.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0);
        double double14 = grayPaintScale6.getLowerBound();
        double double15 = grayPaintScale6.getLowerBound();
        java.lang.Object obj16 = grayPaintScale6.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        double double12 = grayPaintScale8.getUpperBound();
        double double13 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0);
        double double16 = grayPaintScale8.getUpperBound();
        double double17 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale8.getClass();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj7 = grayPaintScale5.clone();
        java.awt.Paint paint9 = grayPaintScale5.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        double double12 = grayPaintScale8.getUpperBound();
        double double13 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale8.getPaint(0.0d);
        double double16 = grayPaintScale8.getUpperBound();
        double double17 = grayPaintScale8.getLowerBound();
        boolean boolean19 = grayPaintScale8.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 'a');
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        java.lang.Object obj12 = grayPaintScale11.clone();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getLowerBound();
        double double22 = grayPaintScale19.getUpperBound();
        double double23 = grayPaintScale19.getLowerBound();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) double23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale19", grayPaintScale0.equals(grayPaintScale19) ? grayPaintScale0.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 0.0f);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getLowerBound();
        double double15 = grayPaintScale9.getUpperBound();
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) double15);
        java.lang.Object obj17 = grayPaintScale5.clone();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj17", grayPaintScale5.equals(obj17) ? grayPaintScale5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getUpperBound();
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale5", grayPaintScale0.equals(grayPaintScale5) ? grayPaintScale0.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getUpperBound();
        double double23 = grayPaintScale17.getUpperBound();
        boolean boolean24 = grayPaintScale10.equals((java.lang.Object) double23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getUpperBound();
        boolean boolean23 = grayPaintScale19.equals((java.lang.Object) (short) 10);
        boolean boolean25 = grayPaintScale19.equals((java.lang.Object) 10.0f);
        java.lang.Object obj26 = grayPaintScale19.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (short) 1);
        double double7 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        double double12 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale8.getPaint((double) (short) 1);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale();
        double double33 = grayPaintScale32.getLowerBound();
        java.lang.Object obj34 = grayPaintScale32.clone();
        boolean boolean35 = grayPaintScale30.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale32", grayPaintScale0.equals(grayPaintScale32) ? grayPaintScale0.hashCode() == grayPaintScale32.hashCode() : true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj28 = null;
        boolean boolean29 = grayPaintScale27.equals(obj28);
        java.lang.Object obj30 = grayPaintScale27.clone();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale27 and obj30", grayPaintScale27.equals(obj30) ? grayPaintScale27.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 1L);
        double double20 = grayPaintScale17.getLowerBound();
        java.lang.Object obj21 = grayPaintScale17.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj21", grayPaintScale17.equals(obj21) ? grayPaintScale17.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
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
        double double29 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean36 = grayPaintScale32.equals((java.lang.Object) 'a');
        double double37 = grayPaintScale32.getLowerBound();
        java.lang.Object obj38 = grayPaintScale32.clone();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale32 and obj38", grayPaintScale32.equals(obj38) ? grayPaintScale32.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) grayPaintScale16);
        double double19 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0L);
        java.lang.Class<?> wildcardClass22 = grayPaintScale16.getClass();
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) true);
        java.lang.Object obj14 = grayPaintScale10.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double27 = grayPaintScale26.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        double double29 = grayPaintScale28.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale28.getPaint(0.0d);
        double double32 = grayPaintScale28.getUpperBound();
        double double33 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale28.getPaint((double) 0);
        double double36 = grayPaintScale28.getLowerBound();
        double double37 = grayPaintScale28.getLowerBound();
        boolean boolean38 = grayPaintScale26.equals((java.lang.Object) double37);
        double double39 = grayPaintScale26.getUpperBound();
        double double40 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass41 = grayPaintScale26.getClass();
        boolean boolean42 = grayPaintScale20.equals((java.lang.Object) wildcardClass41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale28", grayPaintScale10.equals(grayPaintScale28) ? grayPaintScale10.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0);
        double double21 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 0);
        java.awt.Paint paint25 = grayPaintScale13.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass26 = grayPaintScale13.getClass();
        boolean boolean27 = grayPaintScale6.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale13", grayPaintScale6.equals(grayPaintScale13) ? grayPaintScale6.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
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
        double double14 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj13", grayPaintScale6.equals(obj13) ? grayPaintScale6.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1.0f);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double19 = grayPaintScale18.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) double19);
        double double21 = grayPaintScale15.getUpperBound();
        double double22 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        double double24 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint(0.0d);
        double double27 = grayPaintScale23.getUpperBound();
        double double28 = grayPaintScale23.getLowerBound();
        java.lang.Class<?> wildcardClass29 = grayPaintScale23.getClass();
        boolean boolean30 = grayPaintScale15.equals((java.lang.Object) wildcardClass29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double34 = grayPaintScale33.getUpperBound();
        boolean boolean35 = grayPaintScale15.equals((java.lang.Object) grayPaintScale33);
        double double36 = grayPaintScale33.getLowerBound();
        java.lang.Object obj37 = grayPaintScale33.clone();
        boolean boolean38 = grayPaintScale0.equals(obj37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
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
        java.lang.Object obj21 = grayPaintScale2.clone();
        double double22 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale5.getPaint((double) 0);
        double double17 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 0.0f);
        double double23 = grayPaintScale20.getLowerBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale20.getClass();
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) wildcardClass24);
        double double26 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) (byte) 10);
        boolean boolean32 = grayPaintScale5.equals((java.lang.Object) (byte) 10);
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale5", grayPaintScale0.equals(grayPaintScale5) ? grayPaintScale0.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 'a');
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        double double19 = grayPaintScale17.getUpperBound();
        boolean boolean21 = grayPaintScale17.equals((java.lang.Object) (short) 10);
        boolean boolean22 = grayPaintScale16.equals((java.lang.Object) boolean21);
        boolean boolean23 = grayPaintScale11.equals((java.lang.Object) boolean22);
        double double24 = grayPaintScale11.getUpperBound();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) double24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double8 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass12 = grayPaintScale11.getClass();
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale7", grayPaintScale2.equals(grayPaintScale7) ? grayPaintScale2.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double15 = grayPaintScale14.getUpperBound();
        double double16 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) 10.0f);
        java.lang.Class<?> wildcardClass19 = paint18.getClass();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) paint18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj24 = grayPaintScale21.clone();
        boolean boolean25 = grayPaintScale0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale21", grayPaintScale0.equals(grayPaintScale21) ? grayPaintScale0.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
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
        java.lang.Class<?> wildcardClass14 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 1L);
        double double13 = grayPaintScale10.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 100.0f);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double19 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint((double) (byte) -1);
        java.awt.Paint paint23 = grayPaintScale18.getPaint((double) (-1));
        boolean boolean24 = grayPaintScale8.equals((java.lang.Object) grayPaintScale18);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale18", grayPaintScale2.equals(grayPaintScale18) ? grayPaintScale2.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) (-1.0d));
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) (byte) 1);
        double double15 = grayPaintScale10.getLowerBound();
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 0.0f);
        double double23 = grayPaintScale20.getUpperBound();
        double double24 = grayPaintScale20.getUpperBound();
        double double25 = grayPaintScale20.getLowerBound();
        boolean boolean26 = grayPaintScale10.equals((java.lang.Object) double25);
        double double27 = grayPaintScale10.getLowerBound();
        double double28 = grayPaintScale10.getUpperBound();
        double double29 = grayPaintScale10.getLowerBound();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) double11);
        double double13 = grayPaintScale7.getUpperBound();
        double double14 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint(0.0d);
        double double19 = grayPaintScale15.getUpperBound();
        double double20 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale15.getClass();
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = grayPaintScale7.clone();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) true);
        java.lang.Object obj9 = grayPaintScale5.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj9", grayPaintScale5.equals(obj9) ? grayPaintScale5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 1L);
        double double11 = grayPaintScale8.getUpperBound();
        java.lang.Object obj12 = grayPaintScale8.clone();
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) 1L);
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        double double5 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 1.0f);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 100.0f);
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double24 = grayPaintScale23.getUpperBound();
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) grayPaintScale23);
        double double26 = grayPaintScale23.getLowerBound();
        java.lang.Object obj27 = grayPaintScale23.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj27", grayPaintScale23.equals(obj27) ? grayPaintScale23.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale3.getUpperBound();
        java.lang.Object obj7 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj7", grayPaintScale3.equals(obj7) ? grayPaintScale3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) true);
        double double19 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale11.equals((java.lang.Object) grayPaintScale15);
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 0.0f);
        double double16 = grayPaintScale13.getUpperBound();
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        double double19 = grayPaintScale13.getUpperBound();
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) double19);
        double double21 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        double double23 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint(0.0d);
        double double26 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass29 = paint28.getClass();
        boolean boolean30 = grayPaintScale9.equals((java.lang.Object) wildcardClass29);
        boolean boolean31 = grayPaintScale0.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale22", grayPaintScale0.equals(grayPaintScale22) ? grayPaintScale0.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) '#');
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
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
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        double double20 = grayPaintScale18.getUpperBound();
        boolean boolean22 = grayPaintScale18.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint24 = grayPaintScale18.getPaint(0.0d);
        java.awt.Paint paint26 = grayPaintScale18.getPaint(0.0d);
        double double27 = grayPaintScale18.getLowerBound();
        double double28 = grayPaintScale18.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale18", grayPaintScale4.equals(grayPaintScale18) ? grayPaintScale4.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getUpperBound();
        boolean boolean23 = grayPaintScale19.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint25 = grayPaintScale19.getPaint(0.0d);
        java.awt.Paint paint27 = grayPaintScale19.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean32 = grayPaintScale19.equals((java.lang.Object) double31);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
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
        double double25 = grayPaintScale4.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) (byte) 10);
        boolean boolean31 = grayPaintScale4.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean35 = grayPaintScale4.equals((java.lang.Object) grayPaintScale34);
        java.awt.Paint paint37 = grayPaintScale4.getPaint((double) (byte) 0);
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj7 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale3.equals((java.lang.Object) double11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj7", grayPaintScale3.equals(obj7) ? grayPaintScale3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) double13);
        double double15 = grayPaintScale9.getUpperBound();
        java.lang.Object obj16 = grayPaintScale9.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj16", grayPaintScale9.equals(obj16) ? grayPaintScale9.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) false);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.awt.Paint paint13 = grayPaintScale0.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) '#');
        java.lang.Object obj17 = grayPaintScale9.clone();
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj17", grayPaintScale9.equals(obj17) ? grayPaintScale9.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj6 = grayPaintScale0.clone();
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale5.getPaint(52.0d);
        java.lang.Object obj10 = grayPaintScale5.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj10", grayPaintScale5.equals(obj10) ? grayPaintScale5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 1);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) grayPaintScale10);
        java.lang.Class<?> wildcardClass13 = grayPaintScale9.getClass();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 1.0f);
        double double15 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) grayPaintScale18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) (short) 0);
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale11.clone();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj14", grayPaintScale11.equals(obj14) ? grayPaintScale11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        double double11 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0);
        double double20 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale12.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        boolean boolean26 = grayPaintScale12.equals((java.lang.Object) grayPaintScale25);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale17.getPaint(0.0d);
        double double25 = grayPaintScale17.getUpperBound();
        double double26 = grayPaintScale17.getLowerBound();
        boolean boolean28 = grayPaintScale17.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj29 = grayPaintScale17.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale17", grayPaintScale10.equals(grayPaintScale17) ? grayPaintScale10.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        double double17 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0);
        double double24 = grayPaintScale16.getUpperBound();
        double double25 = grayPaintScale16.getUpperBound();
        double double26 = grayPaintScale16.getUpperBound();
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) 'a');
        double double13 = grayPaintScale8.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale11", grayPaintScale2.equals(grayPaintScale11) ? grayPaintScale2.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10.0f);
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 1);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double7 = grayPaintScale6.getUpperBound();
        double double8 = grayPaintScale6.getUpperBound();
        double double9 = grayPaintScale6.getUpperBound();
        java.lang.Object obj10 = grayPaintScale6.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj10", grayPaintScale6.equals(obj10) ? grayPaintScale6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
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
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        java.lang.Class<?> wildcardClass21 = grayPaintScale20.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double26 = grayPaintScale25.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale25.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        double double30 = grayPaintScale29.getUpperBound();
        boolean boolean32 = grayPaintScale29.equals((java.lang.Object) true);
        double double33 = grayPaintScale29.getLowerBound();
        boolean boolean34 = grayPaintScale25.equals((java.lang.Object) grayPaintScale29);
        java.awt.Paint paint36 = grayPaintScale25.getPaint((double) 10.0f);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale29", grayPaintScale4.equals(grayPaintScale29) ? grayPaintScale4.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) '#');
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(0.0d);
        double double15 = grayPaintScale11.getUpperBound();
        double double16 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0);
        double double19 = grayPaintScale11.getLowerBound();
        double double20 = grayPaintScale11.getLowerBound();
        double double21 = grayPaintScale11.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 0.0d);
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
        java.lang.Object obj18 = grayPaintScale3.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj18", grayPaintScale3.equals(obj18) ? grayPaintScale3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale10.equals(obj11);
        java.lang.Class<?> wildcardClass13 = grayPaintScale10.getClass();
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = grayPaintScale7.clone();
        boolean boolean16 = grayPaintScale0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj15", grayPaintScale7.equals(obj15) ? grayPaintScale7.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale0.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale11.equals(obj12);
        java.awt.Paint paint15 = grayPaintScale11.getPaint((double) 100L);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (byte) -1);
        double double21 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale17.getPaint((double) 1);
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) 1.0f);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(0.0d);
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) paint8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale5", grayPaintScale0.equals(grayPaintScale5) ? grayPaintScale0.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) grayPaintScale10);
        double double13 = grayPaintScale9.getUpperBound();
        java.lang.Object obj14 = grayPaintScale9.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 97.0d);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
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
        double double23 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getUpperBound();
        double double28 = grayPaintScale26.getUpperBound();
        boolean boolean30 = grayPaintScale26.equals((java.lang.Object) (short) 10);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale26", grayPaintScale10.equals(grayPaintScale26) ? grayPaintScale10.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1));
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint10 = grayPaintScale8.getPaint(0.0d);
        double double11 = grayPaintScale8.getUpperBound();
        java.lang.Object obj12 = grayPaintScale8.clone();
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj12", grayPaintScale8.equals(obj12) ? grayPaintScale8.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint(52.0d);
        java.lang.Object obj14 = grayPaintScale9.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
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
        double double26 = grayPaintScale5.getUpperBound();
        java.lang.Object obj27 = grayPaintScale5.clone();
        java.lang.Object obj28 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj27", grayPaintScale5.equals(obj27) ? grayPaintScale5.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) double10);
        double double12 = grayPaintScale6.getUpperBound();
        double double13 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale14.getClass();
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = grayPaintScale6.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale3.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (byte) -1);
        double double13 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) 1);
        java.awt.Paint paint17 = grayPaintScale9.getPaint(0.0d);
        java.lang.Class<?> wildcardClass18 = grayPaintScale9.getClass();
        boolean boolean19 = grayPaintScale3.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj6", grayPaintScale3.equals(obj6) ? grayPaintScale3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getUpperBound();
        boolean boolean14 = grayPaintScale11.equals((java.lang.Object) true);
        double double15 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        double double17 = grayPaintScale7.getLowerBound();
        java.lang.Object obj18 = grayPaintScale7.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj18", grayPaintScale7.equals(obj18) ? grayPaintScale7.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) false);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getLowerBound();
        boolean boolean20 = grayPaintScale17.equals((java.lang.Object) grayPaintScale18);
        double double21 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale17.getPaint(32.0d);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale17", grayPaintScale6.equals(grayPaintScale17) ? grayPaintScale6.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
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
        double double23 = grayPaintScale2.getLowerBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass25 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj24", grayPaintScale2.equals(obj24) ? grayPaintScale2.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = grayPaintScale3.equals((java.lang.Object) (byte) 1);
        double double8 = grayPaintScale3.getLowerBound();
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 0.0f);
        double double16 = grayPaintScale13.getUpperBound();
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        boolean boolean19 = grayPaintScale3.equals((java.lang.Object) double18);
        double double20 = grayPaintScale3.getLowerBound();
        double double21 = grayPaintScale3.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) double21);
        java.lang.Object obj23 = grayPaintScale2.clone();
        double double24 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 1);
        double double9 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.lang.Object obj13 = grayPaintScale12.clone();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        java.lang.Class<?> wildcardClass19 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        double double24 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint(0.0d);
        double double27 = grayPaintScale23.getUpperBound();
        double double28 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale23.getPaint((double) 0);
        double double31 = grayPaintScale23.getLowerBound();
        double double32 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale23.getPaint((double) 0);
        boolean boolean35 = grayPaintScale20.equals((java.lang.Object) paint34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale20", grayPaintScale2.equals(grayPaintScale20) ? grayPaintScale2.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double14 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) '#');
        java.lang.Object obj21 = grayPaintScale13.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj21", grayPaintScale13.equals(obj21) ? grayPaintScale13.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
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
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale11.equals(obj12);
        java.awt.Paint paint15 = grayPaintScale11.getPaint((double) (-1.0f));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) (byte) 10);
        double double27 = grayPaintScale24.getUpperBound();
        double double28 = grayPaintScale24.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        double double30 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale29.getPaint(0.0d);
        double double33 = grayPaintScale29.getUpperBound();
        double double34 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale29.getPaint((double) 0);
        double double37 = grayPaintScale29.getLowerBound();
        double double38 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint40 = grayPaintScale29.getPaint((double) 0);
        double double41 = grayPaintScale29.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean46 = grayPaintScale44.equals((java.lang.Object) 0.0f);
        double double47 = grayPaintScale44.getLowerBound();
        java.lang.Class<?> wildcardClass48 = grayPaintScale44.getClass();
        boolean boolean49 = grayPaintScale29.equals((java.lang.Object) wildcardClass48);
        boolean boolean50 = grayPaintScale24.equals((java.lang.Object) grayPaintScale29);
        double double51 = grayPaintScale24.getLowerBound();
        java.lang.Object obj52 = grayPaintScale24.clone();
        boolean boolean53 = grayPaintScale2.equals(obj52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and grayPaintScale44", grayPaintScale12.equals(grayPaintScale44) ? grayPaintScale12.hashCode() == grayPaintScale44.hashCode() : true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) 0);
        double double20 = grayPaintScale12.getLowerBound();
        double double21 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale12.getPaint((double) 0);
        boolean boolean24 = grayPaintScale9.equals((java.lang.Object) paint23);
        boolean boolean26 = grayPaintScale9.equals((java.lang.Object) false);
        double double27 = grayPaintScale9.getLowerBound();
        boolean boolean28 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale12", grayPaintScale0.equals(grayPaintScale12) ? grayPaintScale0.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
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
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
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
        boolean boolean33 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double34 = grayPaintScale13.getUpperBound();
        java.lang.Object obj35 = grayPaintScale13.clone();
        boolean boolean36 = grayPaintScale2.equals(obj35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj35", grayPaintScale13.equals(obj35) ? grayPaintScale13.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean15 = grayPaintScale11.equals((java.lang.Object) grayPaintScale14);
        double double16 = grayPaintScale14.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale14", grayPaintScale5.equals(grayPaintScale14) ? grayPaintScale5.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale3.getUpperBound();
        java.lang.Object obj7 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj7", grayPaintScale3.equals(obj7) ? grayPaintScale3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale6.getPaint((double) (short) 1);
        boolean boolean13 = grayPaintScale3.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 0.0f);
        double double8 = grayPaintScale5.getUpperBound();
        double double9 = grayPaintScale5.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj11 = grayPaintScale5.clone();
        double double12 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj11", grayPaintScale5.equals(obj11) ? grayPaintScale5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        boolean boolean5 = grayPaintScale2.equals(obj3);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 10);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 32.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale12.equals(obj13);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        java.lang.Object obj19 = grayPaintScale18.clone();
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj19", grayPaintScale18.equals(obj19) ? grayPaintScale18.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 1.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double7 = grayPaintScale6.getUpperBound();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj8", grayPaintScale6.equals(obj8) ? grayPaintScale6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass3 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) double6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        boolean boolean16 = grayPaintScale12.equals((java.lang.Object) (short) 10);
        boolean boolean18 = grayPaintScale12.equals((java.lang.Object) 10.0f);
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) 1L);
        double double21 = grayPaintScale12.getUpperBound();
        double double22 = grayPaintScale12.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        double double27 = grayPaintScale26.getUpperBound();
        java.lang.Object obj28 = grayPaintScale26.clone();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale26 and obj28", grayPaintScale26.equals(obj28) ? grayPaintScale26.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        double double11 = grayPaintScale0.getLowerBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint(0.0d);
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double19 = grayPaintScale18.getUpperBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale18.getClass();
        boolean boolean21 = grayPaintScale10.equals((java.lang.Object) grayPaintScale18);
        double double22 = grayPaintScale10.getUpperBound();
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double25 = grayPaintScale24.getLowerBound();
        double double26 = grayPaintScale24.getLowerBound();
        double double27 = grayPaintScale24.getUpperBound();
        boolean boolean28 = grayPaintScale3.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale24", grayPaintScale3.equals(grayPaintScale24) ? grayPaintScale3.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 0);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (short) 10);
        boolean boolean14 = grayPaintScale8.equals((java.lang.Object) 10.0f);
        boolean boolean16 = grayPaintScale8.equals((java.lang.Object) 1L);
        double double17 = grayPaintScale8.getUpperBound();
        double double18 = grayPaintScale8.getLowerBound();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
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
        double double28 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and grayPaintScale31", grayPaintScale15.equals(grayPaintScale31) ? grayPaintScale15.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) 0);
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale12", grayPaintScale6.equals(grayPaintScale12) ? grayPaintScale6.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1));
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 1);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
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
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) 0.0f);
        double double10 = grayPaintScale7.getUpperBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj11", grayPaintScale7.equals(obj11) ? grayPaintScale7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint36 = grayPaintScale34.getPaint((double) 1L);
        boolean boolean37 = grayPaintScale30.equals((java.lang.Object) 1L);
        double double38 = grayPaintScale30.getLowerBound();
        java.lang.Object obj39 = grayPaintScale30.clone();
        double double40 = grayPaintScale30.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale30 and obj39", grayPaintScale30.equals(obj39) ? grayPaintScale30.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        double double5 = grayPaintScale3.getUpperBound();
        double double6 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) grayPaintScale10);
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getUpperBound();
        double double15 = grayPaintScale9.getLowerBound();
        boolean boolean16 = grayPaintScale3.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale10", grayPaintScale0.equals(grayPaintScale10) ? grayPaintScale0.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100L);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (short) 10);
        boolean boolean14 = grayPaintScale8.equals((java.lang.Object) 10.0f);
        boolean boolean16 = grayPaintScale8.equals((java.lang.Object) 1L);
        java.lang.Object obj17 = grayPaintScale8.clone();
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale8", grayPaintScale0.equals(grayPaintScale8) ? grayPaintScale0.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 'a');
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        double double18 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(0.0d);
        double double21 = grayPaintScale17.getUpperBound();
        double double22 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale17.getPaint((double) 0);
        double double25 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale17.getPaint((double) 0);
        double double28 = grayPaintScale17.getUpperBound();
        double double29 = grayPaintScale17.getUpperBound();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj6 = grayPaintScale3.clone();
        java.lang.Object obj7 = grayPaintScale3.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj6", grayPaintScale3.equals(obj6) ? grayPaintScale3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 'a');
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) ' ');
        double double10 = grayPaintScale5.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) double14);
        double double16 = grayPaintScale10.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
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
        java.lang.Class<?> wildcardClass21 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint36 = grayPaintScale34.getPaint((double) 1L);
        boolean boolean37 = grayPaintScale30.equals((java.lang.Object) 1L);
        java.awt.Paint paint39 = grayPaintScale30.getPaint(97.0d);
        java.lang.Object obj40 = grayPaintScale30.clone();
        double double41 = grayPaintScale30.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale30 and obj40", grayPaintScale30.equals(obj40) ? grayPaintScale30.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean32 = grayPaintScale27.equals((java.lang.Object) double31);
        double double33 = grayPaintScale27.getUpperBound();
        double double34 = grayPaintScale27.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double38 = grayPaintScale37.getUpperBound();
        double double39 = grayPaintScale37.getUpperBound();
        java.lang.Object obj40 = null;
        boolean boolean41 = grayPaintScale37.equals(obj40);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean45 = grayPaintScale37.equals((java.lang.Object) grayPaintScale44);
        boolean boolean46 = grayPaintScale27.equals((java.lang.Object) grayPaintScale37);
        double double47 = grayPaintScale27.getUpperBound();
        double double48 = grayPaintScale27.getUpperBound();
        boolean boolean49 = grayPaintScale2.equals((java.lang.Object) double48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale37", grayPaintScale2.equals(grayPaintScale37) ? grayPaintScale2.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (short) 10);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) 10.0f);
        double double12 = grayPaintScale5.getUpperBound();
        double double13 = grayPaintScale5.getLowerBound();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) double13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        double double7 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(100.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
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
        java.lang.Object obj21 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double28 = grayPaintScale27.getLowerBound();
        boolean boolean29 = grayPaintScale24.equals((java.lang.Object) double28);
        double double30 = grayPaintScale24.getUpperBound();
        double double31 = grayPaintScale24.getUpperBound();
        double double32 = grayPaintScale24.getLowerBound();
        double double33 = grayPaintScale24.getUpperBound();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) grayPaintScale14);
        double double17 = grayPaintScale14.getUpperBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale14.getClass();
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
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
        double double23 = grayPaintScale20.getLowerBound();
        java.lang.Object obj24 = grayPaintScale20.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double28 = grayPaintScale27.getUpperBound();
        boolean boolean29 = grayPaintScale20.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj24", grayPaintScale20.equals(obj24) ? grayPaintScale20.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) true);
        double double11 = grayPaintScale7.getLowerBound();
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale0.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj12 = grayPaintScale6.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj12", grayPaintScale6.equals(obj12) ? grayPaintScale6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        double double5 = grayPaintScale3.getUpperBound();
        double double6 = grayPaintScale3.getUpperBound();
        java.lang.Object obj7 = grayPaintScale3.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj7", grayPaintScale3.equals(obj7) ? grayPaintScale3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint6 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint16 = grayPaintScale14.getPaint(0.0d);
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint(1.0d);
        boolean boolean13 = grayPaintScale3.equals((java.lang.Object) paint12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double17 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 0.0f);
        double double23 = grayPaintScale20.getUpperBound();
        double double24 = grayPaintScale20.getUpperBound();
        double double25 = grayPaintScale20.getLowerBound();
        double double26 = grayPaintScale20.getUpperBound();
        boolean boolean27 = grayPaintScale16.equals((java.lang.Object) double26);
        double double28 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        double double30 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale29.getPaint(0.0d);
        double double33 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint35 = grayPaintScale29.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass36 = paint35.getClass();
        boolean boolean37 = grayPaintScale16.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = grayPaintScale3.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale29", grayPaintScale0.equals(grayPaintScale29) ? grayPaintScale0.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (short) 0);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
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
        double double23 = grayPaintScale5.getLowerBound();
        double double24 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double28 = grayPaintScale27.getUpperBound();
        double double29 = grayPaintScale27.getUpperBound();
        java.lang.Object obj30 = null;
        boolean boolean31 = grayPaintScale27.equals(obj30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean35 = grayPaintScale27.equals((java.lang.Object) grayPaintScale34);
        double double36 = grayPaintScale27.getLowerBound();
        boolean boolean37 = grayPaintScale5.equals((java.lang.Object) grayPaintScale27);
        java.awt.Paint paint39 = grayPaintScale5.getPaint(0.0d);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 1);
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) double14);
        double double16 = grayPaintScale10.getUpperBound();
        double double17 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        double double22 = grayPaintScale18.getUpperBound();
        double double23 = grayPaintScale18.getLowerBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale18.getClass();
        boolean boolean25 = grayPaintScale10.equals((java.lang.Object) wildcardClass24);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double29 = grayPaintScale28.getUpperBound();
        boolean boolean30 = grayPaintScale10.equals((java.lang.Object) grayPaintScale28);
        double double31 = grayPaintScale28.getUpperBound();
        java.lang.Object obj32 = grayPaintScale28.clone();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale28 and obj32", grayPaintScale28.equals(obj32) ? grayPaintScale28.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
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
        double double14 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        double double5 = grayPaintScale0.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
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
        java.lang.Object obj20 = grayPaintScale8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj19", grayPaintScale8.equals(obj19) ? grayPaintScale8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) grayPaintScale7);
        double double10 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale6.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 1L);
        double double9 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) '4');
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double11 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (byte) -1);
        double double14 = grayPaintScale10.getLowerBound();
        double double15 = grayPaintScale10.getUpperBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale6.equals(obj7);
        java.awt.Paint paint10 = grayPaintScale6.getPaint(10.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale4.getPaint(0.0d);
        double double12 = grayPaintScale4.getUpperBound();
        java.lang.Object obj13 = grayPaintScale4.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        boolean boolean3 = grayPaintScale0.equals((java.lang.Object) true);
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) double12);
        double double14 = grayPaintScale8.getLowerBound();
        double double15 = grayPaintScale8.getUpperBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) '4');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 1.0f);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double23 = grayPaintScale22.getUpperBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale22.equals(obj25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) grayPaintScale29);
        double double31 = grayPaintScale22.getLowerBound();
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) grayPaintScale22);
        double double33 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) 1L);
        double double39 = grayPaintScale36.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale();
        double double41 = grayPaintScale40.getUpperBound();
        java.awt.Paint paint43 = grayPaintScale40.getPaint((double) 0);
        double double44 = grayPaintScale40.getLowerBound();
        double double45 = grayPaintScale40.getUpperBound();
        boolean boolean46 = grayPaintScale36.equals((java.lang.Object) double45);
        double double47 = grayPaintScale36.getUpperBound();
        boolean boolean48 = grayPaintScale22.equals((java.lang.Object) double47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale40", grayPaintScale0.equals(grayPaintScale40) ? grayPaintScale0.hashCode() == grayPaintScale40.hashCode() : true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) false);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 32.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) (-1.0d));
        boolean boolean8 = grayPaintScale4.equals((java.lang.Object) (byte) 1);
        double double9 = grayPaintScale4.getLowerBound();
        boolean boolean11 = grayPaintScale4.equals((java.lang.Object) (short) 0);
        java.lang.Object obj12 = grayPaintScale4.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj12", grayPaintScale4.equals(obj12) ? grayPaintScale4.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
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
        double double22 = grayPaintScale17.getLowerBound();
        java.lang.Class<?> wildcardClass23 = grayPaintScale17.getClass();
        boolean boolean24 = grayPaintScale9.equals((java.lang.Object) wildcardClass23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double28 = grayPaintScale27.getUpperBound();
        boolean boolean29 = grayPaintScale9.equals((java.lang.Object) grayPaintScale27);
        double double30 = grayPaintScale9.getLowerBound();
        java.lang.Object obj31 = grayPaintScale9.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double8 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (byte) -1);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) true);
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double22 = grayPaintScale21.getUpperBound();
        java.lang.Object obj23 = grayPaintScale21.clone();
        boolean boolean24 = grayPaintScale8.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale21", grayPaintScale8.equals(grayPaintScale21) ? grayPaintScale8.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 100.0d);
        java.lang.Object obj19 = grayPaintScale18.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getUpperBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) double27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) false);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 97.0d);
        java.lang.Class<?> wildcardClass19 = grayPaintScale18.getClass();
        boolean boolean20 = grayPaintScale5.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) (byte) 10);
        boolean boolean28 = grayPaintScale24.equals((java.lang.Object) 1);
        double double29 = grayPaintScale24.getUpperBound();
        double double30 = grayPaintScale24.getUpperBound();
        boolean boolean31 = grayPaintScale5.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale24", grayPaintScale5.equals(grayPaintScale24) ? grayPaintScale5.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getUpperBound();
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
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
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) '#');
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj5 = grayPaintScale3.clone();
        double double6 = grayPaintScale3.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj5", grayPaintScale3.equals(obj5) ? grayPaintScale3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 'a');
        double double6 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) 10.0f);
        double double9 = grayPaintScale5.getUpperBound();
        java.lang.Object obj10 = grayPaintScale5.clone();
        boolean boolean11 = grayPaintScale2.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj10", grayPaintScale5.equals(obj10) ? grayPaintScale5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
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
        java.lang.Object obj22 = grayPaintScale12.clone();
        java.lang.Class<?> wildcardClass23 = grayPaintScale12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj22", grayPaintScale12.equals(obj22) ? grayPaintScale12.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint14 = grayPaintScale8.getPaint(0.0d);
        java.awt.Paint paint16 = grayPaintScale8.getPaint(0.0d);
        double double17 = grayPaintScale8.getLowerBound();
        double double18 = grayPaintScale8.getUpperBound();
        java.lang.Object obj19 = grayPaintScale8.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        double double8 = grayPaintScale7.getUpperBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) true);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale7", grayPaintScale3.equals(grayPaintScale7) ? grayPaintScale3.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
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
        double double31 = grayPaintScale13.getLowerBound();
        double double32 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (byte) 100);
        double double36 = grayPaintScale35.getUpperBound();
        double double37 = grayPaintScale35.getUpperBound();
        java.lang.Object obj38 = null;
        boolean boolean39 = grayPaintScale35.equals(obj38);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        boolean boolean43 = grayPaintScale35.equals((java.lang.Object) grayPaintScale42);
        double double44 = grayPaintScale35.getLowerBound();
        boolean boolean45 = grayPaintScale13.equals((java.lang.Object) grayPaintScale35);
        double double46 = grayPaintScale35.getLowerBound();
        boolean boolean47 = grayPaintScale0.equals((java.lang.Object) double46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale13", grayPaintScale0.equals(grayPaintScale13) ? grayPaintScale0.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) '#');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint(0.0d);
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj12 = grayPaintScale6.clone();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj12", grayPaintScale6.equals(obj12) ? grayPaintScale6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
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
        double double24 = grayPaintScale20.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, 97.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 1L);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }
}

