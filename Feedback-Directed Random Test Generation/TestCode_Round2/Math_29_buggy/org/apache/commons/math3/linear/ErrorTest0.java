package org.apache.commons.math3.linear;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector2.mapAddToSelf((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector8 and openMapRealVector4", openMapRealVector8.equals(openMapRealVector4) ? openMapRealVector8.hashCode() == openMapRealVector4.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        double double7 = openMapRealVector2.getL1Norm();
        openMapRealVector2.set(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector4", openMapRealVector2.equals(openMapRealVector4) ? openMapRealVector2.hashCode() == openMapRealVector4.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector9.mapAdd((double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector35", openMapRealVector9.equals(openMapRealVector35) ? openMapRealVector9.hashCode() == openMapRealVector35.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector12.append(openMapRealVector17);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        boolean boolean22 = openMapRealVector12.isDefaultValue((double) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector12.mapAddToSelf(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector24", openMapRealVector2.equals(openMapRealVector24) ? openMapRealVector2.hashCode() == openMapRealVector24.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(0.0d);
        double double17 = openMapRealVector13.getNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector13 and realVector16", openMapRealVector13.equals(realVector16) ? openMapRealVector13.hashCode() == realVector16.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        double double15 = realVector14.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector14", openMapRealVector9.equals(realVector14) ? openMapRealVector9.hashCode() == realVector14.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        int int15 = openMapRealVector9.getMinIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector14", openMapRealVector9.equals(realVector14) ? openMapRealVector9.hashCode() == realVector14.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        boolean boolean15 = openMapRealVector9.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector14", openMapRealVector9.equals(realVector14) ? openMapRealVector9.hashCode() == realVector14.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector12.append(openMapRealVector17);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector12.mapAddToSelf((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector22", openMapRealVector2.equals(openMapRealVector22) ? openMapRealVector2.hashCode() == openMapRealVector22.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15, 100);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector23.append(openMapRealVector28);
        int int31 = openMapRealVector30.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30, (int) (byte) 0);
        double double34 = openMapRealVector30.getMinValue();
        boolean boolean35 = openMapRealVector19.equals((java.lang.Object) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector9.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector36.mapAddToSelf(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector38", openMapRealVector9.equals(openMapRealVector38) ? openMapRealVector9.hashCode() == openMapRealVector38.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        int int24 = openMapRealVector22.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector27.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector22.append((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector59.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector59.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65, 100);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double74 = openMapRealVector73.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector73);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double79 = openMapRealVector78.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector73.append(openMapRealVector78);
        int int81 = openMapRealVector80.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector80, (int) (byte) 0);
        double double84 = openMapRealVector80.getMinValue();
        boolean boolean85 = openMapRealVector69.equals((java.lang.Object) openMapRealVector80);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector59.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.RealVector realVector87 = openMapRealVector47.combine((double) (short) 1, 19.0d, (org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector80.unitVector();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector87", openMapRealVector9.equals(realVector87) ? openMapRealVector9.hashCode() == realVector87.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAdd(0.0d);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector9.mapDivideToSelf((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector11", openMapRealVector2.equals(realVector11) ? openMapRealVector2.hashCode() == realVector11.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        int int15 = openMapRealVector9.getDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector14", openMapRealVector9.equals(realVector14) ? openMapRealVector9.hashCode() == realVector14.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAdd(0.0d);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector6.sparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector18.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector25.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector29.mapSubtract(10.0d);
        double double33 = openMapRealVector18.getL1Distance(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector18.mapDivide((-1.0d));
        openMapRealVector10.setSubVector(0, (org.apache.commons.math3.linear.RealVector) openMapRealVector18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector10", openMapRealVector9.equals(openMapRealVector10) ? openMapRealVector9.hashCode() == openMapRealVector10.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAdd(0.0d);
        double double10 = openMapRealVector6.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector16 = realVector14.mapDivideToSelf((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector16", openMapRealVector9.equals(realVector16) ? openMapRealVector9.hashCode() == realVector16.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        int int24 = openMapRealVector22.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector27.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector22.append((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector59.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector59.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65, 100);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double74 = openMapRealVector73.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector73);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double79 = openMapRealVector78.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector73.append(openMapRealVector78);
        int int81 = openMapRealVector80.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector80, (int) (byte) 0);
        double double84 = openMapRealVector80.getMinValue();
        boolean boolean85 = openMapRealVector69.equals((java.lang.Object) openMapRealVector80);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector59.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.RealVector realVector87 = openMapRealVector47.combine((double) (short) 1, 19.0d, (org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.RealVector realVector88 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector87", openMapRealVector9.equals(realVector87) ? openMapRealVector9.hashCode() == realVector87.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector12.append(openMapRealVector17);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector2.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector2.mapAdd((double) 'a');
        org.apache.commons.math3.linear.RealVector realVector26 = openMapRealVector24.mapMultiplyToSelf((double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector24.mapAdd((double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector38.copy();
        boolean boolean40 = openMapRealVector38.isInfinite();
        boolean boolean42 = openMapRealVector38.equals((java.lang.Object) 1.0f);
        org.apache.commons.math3.linear.RealVector realVector44 = openMapRealVector38.mapSubtract((double) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector28.append(openMapRealVector38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector44", openMapRealVector9.equals(realVector44) ? openMapRealVector9.hashCode() == realVector44.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector12.append(openMapRealVector17);
        double double20 = openMapRealVector12.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector23.append(openMapRealVector28);
        int int31 = openMapRealVector30.getMinIndex();
        int int32 = openMapRealVector30.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector45.append(openMapRealVector50);
        org.apache.commons.math3.linear.RealVector realVector53 = openMapRealVector35.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector30.append((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector12.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector7.add(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector59.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double71 = openMapRealVector66.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector70);
        org.apache.commons.math3.linear.RealVector realVector73 = openMapRealVector70.mapSubtract(10.0d);
        double double74 = openMapRealVector59.getL1Distance(openMapRealVector70);
        org.apache.commons.math3.linear.RealVector realVector76 = openMapRealVector70.mapSubtract((double) 'a');
        org.apache.commons.math3.linear.RealVector realVector78 = realVector76.mapDivide((double) (short) 0);
        double double79 = openMapRealVector56.getL1Distance(realVector78);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double83 = openMapRealVector82.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector82);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double88 = openMapRealVector87.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector82.append(openMapRealVector87);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector82.mapAddToSelf((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector92 = openMapRealVector56.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector91);
        org.apache.commons.math3.linear.RealVector realVector94 = realVector92.mapMultiply(0.3333333333333333d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector92", openMapRealVector2.equals(realVector92) ? openMapRealVector2.hashCode() == realVector92.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector2.unitVector();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor6 = openMapRealVector2.iterator();
        double double8 = openMapRealVector2.getEntry((int) (byte) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector2.mapAdd(0.13333333333333333d);
        org.apache.commons.math3.linear.RealVector realVector12 = openMapRealVector10.mapMultiplyToSelf((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector12", openMapRealVector2.equals(realVector12) ? openMapRealVector2.hashCode() == realVector12.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector9.mapAdd((double) (short) 0);
        int int36 = openMapRealVector35.getMaxIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector35", openMapRealVector9.equals(openMapRealVector35) ? openMapRealVector9.hashCode() == openMapRealVector35.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector2.mapSubtractToSelf((double) (-1));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        double double19 = openMapRealVector14.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector2.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        double double21 = openMapRealVector14.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector20", openMapRealVector4.equals(openMapRealVector20) ? openMapRealVector4.hashCode() == openMapRealVector20.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        int int24 = openMapRealVector22.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector27.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector22.append((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector27);
        openMapRealVector27.set((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector27", openMapRealVector2.equals(openMapRealVector27) ? openMapRealVector2.hashCode() == openMapRealVector27.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector2.mapSubtractToSelf((double) (-1));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        double double19 = openMapRealVector14.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector2.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        int int21 = openMapRealVector14.getMaxIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector20", openMapRealVector4.equals(openMapRealVector20) ? openMapRealVector4.hashCode() == openMapRealVector20.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector9.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(10.0d);
        double double17 = openMapRealVector2.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        int int28 = openMapRealVector27.getMinIndex();
        int int29 = openMapRealVector27.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector32.append(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector42.append(openMapRealVector47);
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector32.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector27.append((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        org.apache.commons.math3.linear.RealVector realVector52 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector60.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.append(openMapRealVector60);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double71 = openMapRealVector70.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector65.append(openMapRealVector70);
        org.apache.commons.math3.linear.RealVector realVector73 = openMapRealVector55.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        boolean boolean75 = openMapRealVector65.isDefaultValue((double) 10);
        double double76 = openMapRealVector2.getLInfDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        int int77 = openMapRealVector65.getMaxIndex();
        org.apache.commons.math3.linear.RealVector realVector79 = openMapRealVector65.mapMultiply((double) 100.0f);
        org.apache.commons.math3.linear.RealVector realVector81 = openMapRealVector65.mapSubtract(0.0d);
        double double83 = openMapRealVector65.getEntry(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector81", openMapRealVector2.equals(realVector81) ? openMapRealVector2.hashCode() == realVector81.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector9.mapAdd((double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator36 = openMapRealVector9.new OpenMapSparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector35", openMapRealVector9.equals(openMapRealVector35) ? openMapRealVector9.hashCode() == openMapRealVector35.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(0.0d);
        org.apache.commons.math3.linear.RealVector realVector18 = realVector16.mapMultiply((double) 34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector13 and realVector16", openMapRealVector13.equals(realVector16) ? openMapRealVector13.hashCode() == realVector16.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        int int21 = openMapRealVector20.getMinIndex();
        int int22 = openMapRealVector20.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.append(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        org.apache.commons.math3.linear.RealVector realVector43 = openMapRealVector25.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector20.append((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector2.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector47 = openMapRealVector45.mapMultiplyToSelf((double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector50.append(openMapRealVector55);
        int int58 = openMapRealVector57.getMinIndex();
        int int59 = openMapRealVector57.getDimension();
        double double60 = openMapRealVector57.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector45.append(openMapRealVector57);
        openMapRealVector45.set(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector45", openMapRealVector2.equals(openMapRealVector45) ? openMapRealVector2.hashCode() == openMapRealVector45.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        org.apache.commons.math3.linear.RealVector realVector10 = realVector8.mapDivide((double) (short) -1);
        int int11 = realVector8.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector8);
        org.apache.commons.math3.linear.RealVector realVector13 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor14 = openMapRealVector12.iterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector12.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector18.append(openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector25.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double30 = openMapRealVector26.getL1Distance(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector29.mapSubtract(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector12.append(openMapRealVector29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector29 and realVector32", openMapRealVector29.equals(realVector32) ? openMapRealVector29.hashCode() == realVector32.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector12.add(openMapRealVector22);
        boolean boolean28 = openMapRealVector22.isDefaultValue((double) (byte) 0);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator29 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry30 = openMapRealVector22.new OpenMapEntry(iterator29);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator31 = openMapRealVector22.new OpenMapSparseIterator();
        openMapRealVector22.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        int int43 = openMapRealVector42.getMinIndex();
        int int44 = openMapRealVector42.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector47.append(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector57);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double63 = openMapRealVector62.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector57.append(openMapRealVector62);
        org.apache.commons.math3.linear.RealVector realVector65 = openMapRealVector47.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector57);
        org.apache.commons.math3.linear.RealVector realVector67 = openMapRealVector47.mapDivide((double) 20);
        double double68 = openMapRealVector42.getL1Distance(openMapRealVector47);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator69 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry70 = openMapRealVector42.new OpenMapEntry(iterator69);
        openMapRealVector42.addToEntry((int) (short) 10, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector42.mapAdd(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector22.add(openMapRealVector75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector42 and openMapRealVector75", openMapRealVector42.equals(openMapRealVector75) ? openMapRealVector42.hashCode() == openMapRealVector75.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector9.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(10.0d);
        double double17 = openMapRealVector2.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        int int28 = openMapRealVector27.getMinIndex();
        int int29 = openMapRealVector27.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector32.append(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector42.append(openMapRealVector47);
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector32.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector27.append((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        org.apache.commons.math3.linear.RealVector realVector52 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector2.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double57 = openMapRealVector56.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector56.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector60);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector60.mapAdd(0.0d);
        double double64 = openMapRealVector53.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector63", openMapRealVector2.equals(openMapRealVector63) ? openMapRealVector2.hashCode() == openMapRealVector63.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector10.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector18.copy();
        double[] doubleArray23 = openMapRealVector18.toArray();
        double double24 = openMapRealVector18.getLInfNorm();
        openMapRealVector18.set(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        int int21 = openMapRealVector20.getMinIndex();
        int int22 = openMapRealVector20.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.append(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        org.apache.commons.math3.linear.RealVector realVector43 = openMapRealVector25.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector20.append((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector2.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator46 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry47 = openMapRealVector25.new OpenMapEntry(iterator46);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector25.mapAdd(0.0d);
        java.lang.Double[] doubleArray50 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray50, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray50, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59);
        double[] doubleArray62 = openMapRealVector59.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray62, (double) (-1L));
        double double65 = openMapRealVector56.getL1Distance(openMapRealVector64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector64.append((double) (-1L));
        org.apache.commons.math3.linear.RealVector realVector68 = openMapRealVector49.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector49", openMapRealVector2.equals(openMapRealVector49) ? openMapRealVector2.hashCode() == openMapRealVector49.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtract((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector9.mapDivideToSelf((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector16 and realVector14", realVector16.equals(realVector14) ? realVector16.hashCode() == realVector14.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector12.append(openMapRealVector17);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector2.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector2.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector2.mapAdd((double) 'a');
        org.apache.commons.math3.linear.RealVector realVector26 = openMapRealVector24.mapMultiplyToSelf((double) (byte) 10);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector24.mapSubtractToSelf(1.0d);
        realVector28.addToEntry((int) (byte) 0, 14.142135623730951d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector36.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector43.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector47.mapSubtract(10.0d);
        double double51 = openMapRealVector36.getL1Distance(openMapRealVector47);
        org.apache.commons.math3.linear.RealVector realVector52 = realVector28.combineToSelf((double) 0.0f, (double) '4', (org.apache.commons.math3.linear.RealVector) openMapRealVector36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector52", openMapRealVector2.equals(realVector52) ? openMapRealVector2.hashCode() == realVector52.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        double double13 = openMapRealVector9.getMinValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector9.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, 6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.append(openMapRealVector24);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor27 = openMapRealVector26.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30, 100);
        double double35 = openMapRealVector34.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector34.mapSubtract((double) 1.0f);
        openMapRealVector34.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector26.append(openMapRealVector34);
        org.apache.commons.math3.linear.RealVector realVector40 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector26.mapAdd((double) (-1.0f));
        org.apache.commons.math3.linear.RealVector realVector43 = openMapRealVector9.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double47 = openMapRealVector46.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector46);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector46, 100);
        org.apache.commons.math3.linear.RealVector realVector52 = openMapRealVector50.mapDivideToSelf((double) 10.0f);
        openMapRealVector50.setEntry(1, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector57 = openMapRealVector50.mapSubtract((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector60.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector60);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector60.append(openMapRealVector65);
        double double68 = openMapRealVector60.getLInfNorm();
        boolean boolean69 = openMapRealVector60.isInfinite();
        double double70 = openMapRealVector50.getDistance(openMapRealVector60);
        double double71 = openMapRealVector50.getSparsity();
        org.apache.commons.math3.linear.RealMatrix realMatrix72 = realVector43.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector34 and openMapRealVector50", openMapRealVector34.equals(openMapRealVector50) ? openMapRealVector34.hashCode() == openMapRealVector50.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15, 100);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector23.append(openMapRealVector28);
        int int31 = openMapRealVector30.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30, (int) (byte) 0);
        double double34 = openMapRealVector30.getMinValue();
        boolean boolean35 = openMapRealVector19.equals((java.lang.Object) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector9.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.append(openMapRealVector44);
        double double47 = openMapRealVector39.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector50.append(openMapRealVector55);
        int int58 = openMapRealVector57.getMinIndex();
        int int59 = openMapRealVector57.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double63 = openMapRealVector62.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double68 = openMapRealVector67.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector62.append(openMapRealVector67);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double73 = openMapRealVector72.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double78 = openMapRealVector77.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector72.append(openMapRealVector77);
        org.apache.commons.math3.linear.RealVector realVector80 = openMapRealVector62.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector57.append((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector39.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector82.mapMultiplyToSelf((double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector36.append(openMapRealVector82);
        double[] doubleArray86 = openMapRealVector82.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double90 = openMapRealVector89.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector89);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector92 = openMapRealVector82.subtract(openMapRealVector91);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector82.mapAddToSelf(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector94", openMapRealVector2.equals(openMapRealVector94) ? openMapRealVector2.hashCode() == openMapRealVector94.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13, 100);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector17.mapSubtract((double) 1.0f);
        openMapRealVector17.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector9.append(openMapRealVector17);
        org.apache.commons.math3.linear.RealVector realVector23 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector9.mapAdd((double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((-1), 10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector9.append(openMapRealVector28);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector29.unitVector();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector29 and realVector31", openMapRealVector29.equals(realVector31) ? openMapRealVector29.hashCode() == realVector31.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        int int5 = openMapRealVector4.getDimension();
        openMapRealVector4.set(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector4", openMapRealVector2.equals(openMapRealVector4) ? openMapRealVector2.hashCode() == openMapRealVector4.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        double double9 = openMapRealVector6.getSparsity();
        boolean boolean10 = openMapRealVector6.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14, 100);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector18.mapDivideToSelf((double) 10.0f);
        openMapRealVector18.setEntry(1, (double) (short) 0);
        boolean boolean24 = openMapRealVector18.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector18.copy();
        double double27 = openMapRealVector25.getEntry((int) (short) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector30.append(openMapRealVector35);
        boolean boolean39 = openMapRealVector30.equals((java.lang.Object) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector42.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector49.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        org.apache.commons.math3.linear.RealVector realVector56 = openMapRealVector53.mapSubtract(10.0d);
        double double57 = openMapRealVector42.getL1Distance(openMapRealVector53);
        org.apache.commons.math3.linear.RealVector realVector59 = openMapRealVector53.mapSubtract((double) 'a');
        org.apache.commons.math3.linear.RealMatrix realMatrix60 = openMapRealVector30.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector25.append(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector6.append(openMapRealVector25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector6 and openMapRealVector18", openMapRealVector6.equals(openMapRealVector18) ? openMapRealVector6.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAdd(0.0d);
        boolean boolean10 = openMapRealVector9.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector9.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(10.0d);
        double double17 = openMapRealVector2.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector2.mapDivide((-1.0d));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(9, (int) ' ', (double) (byte) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector26.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        double[] doubleArray32 = openMapRealVector26.toArray();
        double[] doubleArray33 = openMapRealVector26.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray33);
        org.apache.commons.math3.linear.RealMatrix realMatrix35 = openMapRealVector23.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector38.append(openMapRealVector43);
        double double46 = openMapRealVector38.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double55 = openMapRealVector54.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector49.append(openMapRealVector54);
        int int57 = openMapRealVector56.getMinIndex();
        int int58 = openMapRealVector56.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.append(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double72 = openMapRealVector71.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector71);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double77 = openMapRealVector76.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector71.append(openMapRealVector76);
        org.apache.commons.math3.linear.RealVector realVector79 = openMapRealVector61.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector71);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector56.append((org.apache.commons.math3.linear.RealVector) openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector38.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector61);
        double double82 = openMapRealVector81.getLInfNorm();
        org.apache.commons.math3.linear.RealVector realVector83 = openMapRealVector34.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector81);
        double double84 = openMapRealVector2.dotProduct(openMapRealVector81);
        org.apache.commons.math3.linear.RealVector realVector86 = openMapRealVector81.mapSubtractToSelf((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector86", openMapRealVector2.equals(realVector86) ? openMapRealVector2.hashCode() == realVector86.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        int int24 = openMapRealVector22.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector27.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector22.append((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector59.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector59.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector65, 100);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double74 = openMapRealVector73.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector73);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double79 = openMapRealVector78.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector73.append(openMapRealVector78);
        int int81 = openMapRealVector80.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector80, (int) (byte) 0);
        double double84 = openMapRealVector80.getMinValue();
        boolean boolean85 = openMapRealVector69.equals((java.lang.Object) openMapRealVector80);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector59.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.RealVector realVector87 = openMapRealVector47.combine((double) (short) 1, 19.0d, (org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        int int88 = openMapRealVector80.getMinIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector87", openMapRealVector9.equals(realVector87) ? openMapRealVector9.hashCode() == realVector87.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor15 = openMapRealVector13.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector17 = openMapRealVector13.mapSubtract((double) 110);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector13.mapSubtract((double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13, 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector13 and realVector19", openMapRealVector13.equals(realVector19) ? openMapRealVector13.hashCode() == realVector19.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        openMapRealVector6.setEntry(1, (double) (short) 0);
        boolean boolean12 = openMapRealVector6.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector6.append((double) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector17 = openMapRealVector6.mapSubtractToSelf(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector17 and openMapRealVector13", realVector17.equals(openMapRealVector13) ? realVector17.hashCode() == openMapRealVector13.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        int int24 = openMapRealVector22.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector27.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector22.append((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector27);
        double[] doubleArray48 = openMapRealVector7.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48, (double) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48, (double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector51", openMapRealVector2.equals(openMapRealVector51) ? openMapRealVector2.hashCode() == openMapRealVector51.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        int int21 = openMapRealVector20.getMinIndex();
        int int22 = openMapRealVector20.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.append(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        org.apache.commons.math3.linear.RealVector realVector43 = openMapRealVector25.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector20.append((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector2.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator46 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry47 = openMapRealVector25.new OpenMapEntry(iterator46);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector25.mapAdd(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double57 = openMapRealVector52.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector56);
        double[] doubleArray58 = openMapRealVector52.toArray();
        openMapRealVector52.set(10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector52.append((double) (byte) 0);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator63 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry64 = openMapRealVector52.new OpenMapEntry(iterator63);
        double double65 = openMapRealVector25.getDistance(openMapRealVector52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector49", openMapRealVector2.equals(openMapRealVector49) ? openMapRealVector2.hashCode() == openMapRealVector49.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector2.mapSubtractToSelf((double) (-1));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        double double19 = openMapRealVector14.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector2.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        double double21 = openMapRealVector14.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector20", openMapRealVector4.equals(openMapRealVector20) ? openMapRealVector4.hashCode() == openMapRealVector20.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector9.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapSubtract(10.0d);
        double double17 = openMapRealVector2.getL1Distance(openMapRealVector13);
        double double18 = openMapRealVector13.getL1Norm();
        boolean boolean19 = openMapRealVector13.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector13.mapAdd((double) 0L);
        double double22 = openMapRealVector21.getMaxValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor15 = openMapRealVector13.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector17 = openMapRealVector13.mapSubtract((double) 110);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector13.mapSubtract((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor20 = openMapRealVector13.iterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector13 and realVector19", openMapRealVector13.equals(realVector19) ? openMapRealVector13.hashCode() == realVector19.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor15 = openMapRealVector13.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector17 = openMapRealVector13.mapSubtract((double) 110);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector13.mapSubtract((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector20 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector13 and realVector19", openMapRealVector13.equals(realVector19) ? openMapRealVector13.hashCode() == realVector19.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        openMapRealVector2.set((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector6", openMapRealVector2.equals(openMapRealVector6) ? openMapRealVector2.hashCode() == openMapRealVector6.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector9.mapAdd((double) (short) 0);
        boolean boolean37 = openMapRealVector9.isDefaultValue(52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector35", openMapRealVector9.equals(openMapRealVector35) ? openMapRealVector9.hashCode() == openMapRealVector35.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        double[] doubleArray34 = openMapRealVector14.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray34, (double) 100.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray34, (double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector38", openMapRealVector2.equals(openMapRealVector38) ? openMapRealVector2.hashCode() == openMapRealVector38.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector9.mapAdd((double) (short) 0);
        boolean boolean36 = openMapRealVector35.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector35", openMapRealVector9.equals(openMapRealVector35) ? openMapRealVector9.hashCode() == openMapRealVector35.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        int int23 = openMapRealVector22.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector12.add(openMapRealVector22);
        boolean boolean27 = openMapRealVector12.isInfinite();
        org.apache.commons.math3.linear.RealVector realVector29 = openMapRealVector12.mapSubtractToSelf((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector29", openMapRealVector9.equals(realVector29) ? openMapRealVector9.hashCode() == realVector29.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 5);
        org.apache.commons.math3.linear.RealVector realVector10 = openMapRealVector8.mapSubtract(0.0d);
        org.apache.commons.math3.linear.RealVector realVector12 = realVector10.mapSubtract((double) 6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector8 and realVector10", openMapRealVector8.equals(realVector10) ? openMapRealVector8.hashCode() == realVector10.hashCode() : true);
    }
}

