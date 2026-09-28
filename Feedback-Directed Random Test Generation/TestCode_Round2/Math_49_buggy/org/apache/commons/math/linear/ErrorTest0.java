package org.apache.commons.math.linear;

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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.ebeMultiply(doubleArray6);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor8 = openMapRealVector5.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector2.mapDivide((double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.ebeMultiply(doubleArray18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor20 = openMapRealVector17.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector17);
        double double22 = openMapRealVector14.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.ebeMultiply(doubleArray26);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor28 = openMapRealVector25.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.ebeMultiply(doubleArray32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector36.ebeMultiply(doubleArray37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector33.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector25.getDistance(openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector43.ebeMultiply(doubleArray44);
        double double46 = openMapRealVector33.getDistance(doubleArray44);
        double double47 = openMapRealVector14.getLInfDistance(doubleArray44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector52.ebeMultiply(doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector52.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector14.combine((double) '4', (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double double60 = openMapRealVector52.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector66.ebeMultiply(doubleArray67);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor69 = openMapRealVector66.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector63.append(openMapRealVector66);
        double double71 = openMapRealVector63.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector74.ebeMultiply(doubleArray75);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor77 = openMapRealVector74.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector80.ebeMultiply(doubleArray81);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray86 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector85.ebeMultiply(doubleArray86);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector82.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector87);
        double double89 = openMapRealVector74.getDistance(openMapRealVector82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray93 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector92.ebeMultiply(doubleArray93);
        double double95 = openMapRealVector82.getDistance(doubleArray93);
        double double96 = openMapRealVector63.getLInfDistance(doubleArray93);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector52.projection(doubleArray93);
        org.apache.commons.math.linear.RealVector realVector98 = openMapRealVector2.add(doubleArray93);
        int int99 = openMapRealVector2.getMaxIndex();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector98.", openMapRealVector2.equals(realVector98) == realVector98.equals(openMapRealVector2));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.ebeMultiply(doubleArray13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector9.append(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector4.combineToSelf(Double.NaN, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.ebeMultiply(doubleArray20);
        double double22 = openMapRealVector19.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.ebeMultiply(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector32.ebeMultiply(doubleArray33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector29.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator36 = openMapRealVector34.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.ebeMultiply(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector39.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        boolean boolean46 = openMapRealVector34.equals((java.lang.Object) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector19.combineToSelf((double) 10.0f, (double) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector9.append(openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double52 = openMapRealVector51.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector58.ebeMultiply(doubleArray59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector58.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.append(openMapRealVector58);
        double double63 = openMapRealVector51.getDistance(openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector51.append((double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector9.subtract(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector69.ebeMultiply(doubleArray70);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector51.add(doubleArray70);
        openMapRealVector51.set((double) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector72.", openMapRealVector2.equals(realVector72) == realVector72.equals(openMapRealVector2));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.ebeMultiply(doubleArray13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector9.append(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector4.combineToSelf(Double.NaN, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.ebeMultiply(doubleArray20);
        double double22 = openMapRealVector19.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.ebeMultiply(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector32.ebeMultiply(doubleArray33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector29.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator36 = openMapRealVector34.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.ebeMultiply(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector39.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        boolean boolean46 = openMapRealVector34.equals((java.lang.Object) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector19.combineToSelf((double) 10.0f, (double) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector9.append(openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double52 = openMapRealVector51.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector58.ebeMultiply(doubleArray59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector58.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.append(openMapRealVector58);
        double double63 = openMapRealVector51.getDistance(openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector51.append((double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector9.subtract(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector69.ebeMultiply(doubleArray70);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector51.add(doubleArray70);
        double double73 = openMapRealVector51.getMinValue();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector72.", openMapRealVector2.equals(realVector72) == realVector72.equals(openMapRealVector2));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMinValue();
        boolean boolean4 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.ebeMultiply(doubleArray8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.ebeMultiply(doubleArray13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector9.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        boolean boolean16 = openMapRealVector9.isInfinite();
        boolean boolean17 = openMapRealVector2.equals((java.lang.Object) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.ebeMultiply(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.ebeMultiply(doubleArray26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector22.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator29 = openMapRealVector22.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector22.mapAddToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector22.mapDivideToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector2.append((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double38 = openMapRealVector37.getMaxValue();
        int int39 = openMapRealVector37.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector22.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector22.mapAdd((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.ebeMultiply(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector46.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector57.ebeMultiply(doubleArray58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector57.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector62);
        double[] doubleArray64 = openMapRealVector62.getData();
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector51.combine((double) 100L, (double) (byte) -1, doubleArray64);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector22.add(doubleArray64);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator67 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry68 = openMapRealVector22.new OpenMapEntry(iterator67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector66.", openMapRealVector2.equals(realVector66) == realVector66.equals(openMapRealVector2));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector9.ebeMultiply(doubleArray10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor12 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.append(openMapRealVector9);
        double double14 = openMapRealVector2.getDistance(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector2.mapAddToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.mapAddToSelf((double) (byte) 10);
        double[] doubleArray19 = openMapRealVector16.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector22.ebeMultiply(doubleArray23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector32.ebeMultiply(doubleArray33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector29.append(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector24.combineToSelf(Double.NaN, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.ebeMultiply(doubleArray40);
        double double42 = openMapRealVector39.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector47.ebeMultiply(doubleArray48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector52.ebeMultiply(doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector49.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator56 = openMapRealVector54.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector59.ebeMultiply(doubleArray60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector59.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        boolean boolean66 = openMapRealVector54.equals((java.lang.Object) openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector39.combineToSelf((double) 10.0f, (double) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector29.append(openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double72 = openMapRealVector71.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector78.ebeMultiply(doubleArray79);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor81 = openMapRealVector78.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector75.append(openMapRealVector78);
        double double83 = openMapRealVector71.getDistance(openMapRealVector78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector71.append((double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector29.subtract(openMapRealVector71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray90 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector89.ebeMultiply(doubleArray90);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector71.add(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector16.ebeDivide(doubleArray90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector16 and realVector92.", openMapRealVector16.equals(realVector92) == realVector92.equals(openMapRealVector16));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor5 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.ebeMultiply(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.ebeMultiply(doubleArray14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector10.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector2.getDistance(openMapRealVector10);
        int int18 = openMapRealVector2.getMaxIndex();
        int int19 = openMapRealVector2.getMinIndex();
        int int20 = openMapRealVector2.getMaxIndex();
        int int21 = openMapRealVector2.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.ebeMultiply(doubleArray25);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor27 = openMapRealVector24.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector30.ebeMultiply(doubleArray31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector35.ebeMultiply(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector32.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        double double39 = openMapRealVector24.getDistance(openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.ebeMultiply(doubleArray43);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor45 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector48.ebeMultiply(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector53.ebeMultiply(doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector50.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        double double57 = openMapRealVector42.getDistance(openMapRealVector50);
        double double58 = openMapRealVector32.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector64.ebeMultiply(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector61.append(doubleArray65);
        double double68 = openMapRealVector32.dotProduct(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector2.add(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray65, (double) (byte) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector69.", openMapRealVector2.equals(realVector69) == realVector69.equals(openMapRealVector2));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector6.ebeMultiply(doubleArray7);
        int int9 = openMapRealVector8.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector2.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.ebeMultiply(doubleArray14);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector13.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.ebeMultiply(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.ebeMultiply(doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector21.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector13.getDistance(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.ebeMultiply(doubleArray32);
        double double34 = openMapRealVector21.getDistance(doubleArray32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector37.ebeMultiply(doubleArray38);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector37.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector43.ebeMultiply(doubleArray44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector48.ebeMultiply(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector45.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double52 = openMapRealVector37.getDistance(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector55.ebeMultiply(doubleArray56);
        double double58 = openMapRealVector45.getDistance(doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector21.projection(doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector67.ebeMultiply(doubleArray68);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector67.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector64.append(openMapRealVector67);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector74.ebeMultiply(doubleArray75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector71.append(openMapRealVector74);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector21.combine(0.0d, (double) (short) -1, (org.apache.commons.math.linear.RealVector) openMapRealVector71);
        boolean boolean79 = openMapRealVector71.isInfinite();
        double[] doubleArray80 = openMapRealVector71.toArray();
        double[] doubleArray81 = openMapRealVector71.toArray();
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector10.add(doubleArray81);
        double double83 = openMapRealVector10.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector82.", openMapRealVector2.equals(realVector82) == realVector82.equals(openMapRealVector2));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector3.unitVector();
        openMapRealVector3.set((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector3", openMapRealVector2.equals(openMapRealVector3) ? openMapRealVector2.hashCode() == openMapRealVector3.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.ebeMultiply(doubleArray6);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor8 = openMapRealVector5.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector5);
        double double10 = openMapRealVector2.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector2.append((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double17 = openMapRealVector16.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector23.ebeMultiply(doubleArray24);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor26 = openMapRealVector23.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector23);
        double double28 = openMapRealVector16.getDistance(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector16.mapAddToSelf((double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator31 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry32 = openMapRealVector30.new OpenMapEntry(iterator31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double36 = openMapRealVector35.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double40 = openMapRealVector39.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.ebeMultiply(doubleArray47);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor49 = openMapRealVector46.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.append(openMapRealVector46);
        double double51 = openMapRealVector39.getDistance(openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.ebeMultiply(doubleArray55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor57 = openMapRealVector54.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector60.ebeMultiply(doubleArray61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector65.ebeMultiply(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector62.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        double double69 = openMapRealVector54.getDistance(openMapRealVector62);
        int int70 = openMapRealVector54.getMaxIndex();
        double double71 = openMapRealVector46.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector35.append(openMapRealVector46);
        double double73 = openMapRealVector30.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double77 = openMapRealVector76.getMinValue();
        boolean boolean78 = openMapRealVector76.isInfinite();
        double[] doubleArray79 = openMapRealVector76.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector30.add(doubleArray79);
        double double82 = openMapRealVector13.dotProduct(realVector81);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector81.", openMapRealVector2.equals(realVector81) == realVector81.equals(openMapRealVector2));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector2.mapMultiplyToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(realVector5);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor7 = openMapRealVector6.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double11 = openMapRealVector10.getMinValue();
        boolean boolean12 = openMapRealVector10.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector15.ebeMultiply(doubleArray16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.ebeMultiply(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        boolean boolean24 = openMapRealVector17.isInfinite();
        boolean boolean25 = openMapRealVector10.equals((java.lang.Object) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.ebeMultiply(doubleArray29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.ebeMultiply(doubleArray34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector30.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator37 = openMapRealVector30.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector30.mapAddToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector30.mapDivideToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector10.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double46 = openMapRealVector45.getMaxValue();
        int int47 = openMapRealVector45.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector30.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector30.mapAdd((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.ebeMultiply(doubleArray55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector54.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector65.ebeMultiply(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector65.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double[] doubleArray72 = openMapRealVector70.getData();
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector59.combine((double) 100L, (double) (byte) -1, doubleArray72);
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector30.add(doubleArray72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector6.ebeDivide(doubleArray72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector74.", openMapRealVector2.equals(realVector74) == realVector74.equals(openMapRealVector2));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, (int) (byte) 100, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.mapAddToSelf(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector3, (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double11 = openMapRealVector10.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.ebeMultiply(doubleArray18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor20 = openMapRealVector17.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector17);
        double double22 = openMapRealVector10.getDistance(openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.mapAddToSelf(0.0d);
        int int25 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.ebeMultiply(doubleArray32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector31.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector28.append(openMapRealVector31);
        double double36 = openMapRealVector28.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector28.copy();
        double double38 = openMapRealVector37.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector44.ebeMultiply(doubleArray45);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor47 = openMapRealVector44.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector41.append(openMapRealVector44);
        double double49 = openMapRealVector41.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector52.ebeMultiply(doubleArray53);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector52.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector58.ebeMultiply(doubleArray59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector63.ebeMultiply(doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector60.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        double double67 = openMapRealVector52.getDistance(openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray71 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector70.ebeMultiply(doubleArray71);
        double double73 = openMapRealVector60.getDistance(doubleArray71);
        double double74 = openMapRealVector41.getLInfDistance(doubleArray71);
        double double75 = openMapRealVector37.getLInfDistance(doubleArray71);
        double double76 = openMapRealVector24.getDistance(doubleArray71);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector7.add(doubleArray71);
        double double78 = openMapRealVector7.getNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector10 and realVector77.", openMapRealVector10.equals(realVector77) == realVector77.equals(openMapRealVector10));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMinValue();
        boolean boolean4 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.ebeMultiply(doubleArray8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.ebeMultiply(doubleArray13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector9.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        boolean boolean16 = openMapRealVector9.isInfinite();
        boolean boolean17 = openMapRealVector2.equals((java.lang.Object) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.ebeMultiply(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.ebeMultiply(doubleArray26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector22.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator29 = openMapRealVector22.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector22.mapAddToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector22.mapDivideToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector2.append((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double38 = openMapRealVector37.getMaxValue();
        int int39 = openMapRealVector37.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector22.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector22.mapAdd((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.ebeMultiply(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector46.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector57.ebeMultiply(doubleArray58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector57.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector62);
        double[] doubleArray64 = openMapRealVector62.getData();
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector51.combine((double) 100L, (double) (byte) -1, doubleArray64);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector22.add(doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector66.", openMapRealVector2.equals(realVector66) == realVector66.equals(openMapRealVector2));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double3 = openMapRealVector2.getMinValue();
        boolean boolean4 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.mapMultiplyToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, (int) (byte) 100, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.mapAddToSelf(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector10, (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double18 = openMapRealVector17.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.ebeMultiply(doubleArray25);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor27 = openMapRealVector24.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector21.append(openMapRealVector24);
        double double29 = openMapRealVector17.getDistance(openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf(0.0d);
        int int32 = openMapRealVector31.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector38.ebeMultiply(doubleArray39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector38.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector38);
        double double43 = openMapRealVector35.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector35.copy();
        double double45 = openMapRealVector44.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector51.ebeMultiply(doubleArray52);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor54 = openMapRealVector51.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector51);
        double double56 = openMapRealVector48.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector59.ebeMultiply(doubleArray60);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor62 = openMapRealVector59.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector65.ebeMultiply(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray71 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector70.ebeMultiply(doubleArray71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector67.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double double74 = openMapRealVector59.getDistance(openMapRealVector67);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector77.ebeMultiply(doubleArray78);
        double double80 = openMapRealVector67.getDistance(doubleArray78);
        double double81 = openMapRealVector48.getLInfDistance(doubleArray78);
        double double82 = openMapRealVector44.getLInfDistance(doubleArray78);
        double double83 = openMapRealVector31.getDistance(doubleArray78);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector14.add(doubleArray78);
        double double85 = openMapRealVector2.getDistance(openMapRealVector14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector84.", openMapRealVector2.equals(realVector84) == realVector84.equals(openMapRealVector2));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector2.mapDivideToSelf((double) (byte) 10);
        boolean boolean5 = openMapRealVector2.isNaN();
        boolean boolean6 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double10 = openMapRealVector9.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.ebeMultiply(doubleArray14);
        int int16 = openMapRealVector15.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector9.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector2.append((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector21.mapMultiply((double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(realVector24);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector25.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector30.ebeMultiply(doubleArray31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector30.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        double[] doubleArray37 = openMapRealVector35.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector41.ebeMultiply(doubleArray42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector41.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector47.ebeMultiply(doubleArray48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector52.ebeMultiply(doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector49.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector41.getDistance(openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector59.ebeMultiply(doubleArray60);
        double double62 = openMapRealVector49.getDistance(doubleArray60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector65.ebeMultiply(doubleArray66);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector65.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector71.ebeMultiply(doubleArray72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray77 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector76.ebeMultiply(doubleArray77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector73.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector78);
        double double80 = openMapRealVector65.getDistance(openMapRealVector73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray84 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector83.ebeMultiply(doubleArray84);
        double double86 = openMapRealVector73.getDistance(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector49.projection(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector38.ebeDivide(doubleArray84);
        double double89 = openMapRealVector25.getLInfDistance(doubleArray84);
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector2.add(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector90.", openMapRealVector2.equals(realVector90) == realVector90.equals(openMapRealVector2));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor5 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.ebeMultiply(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.ebeMultiply(doubleArray14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector10.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector2.getDistance(openMapRealVector10);
        int int18 = openMapRealVector2.getMaxIndex();
        double double19 = openMapRealVector2.getMaxValue();
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), (-1.0d) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector2.append(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.ebeMultiply(doubleArray28);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector27.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.ebeMultiply(doubleArray34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector38.ebeMultiply(doubleArray39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector35.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector27.getDistance(openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector45.ebeMultiply(doubleArray46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.ebeMultiply(doubleArray51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector47.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator54 = openMapRealVector47.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector47.mapAddToSelf((double) (short) 10);
        double double57 = openMapRealVector47.getSparsity();
        double[] doubleArray58 = openMapRealVector47.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector27.ebeMultiply(doubleArray58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray58, (double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector2.add(doubleArray58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector2.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector62.", openMapRealVector2.equals(realVector62) == realVector62.equals(openMapRealVector2));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor5 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.ebeMultiply(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.ebeMultiply(doubleArray14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector10.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector2.getDistance(openMapRealVector10);
        int int18 = openMapRealVector2.getMaxIndex();
        int int19 = openMapRealVector2.getMinIndex();
        int int20 = openMapRealVector2.getMaxIndex();
        int int21 = openMapRealVector2.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.ebeMultiply(doubleArray25);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor27 = openMapRealVector24.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector30.ebeMultiply(doubleArray31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector35.ebeMultiply(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector32.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        double double39 = openMapRealVector24.getDistance(openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.ebeMultiply(doubleArray43);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor45 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector48.ebeMultiply(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector53.ebeMultiply(doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector50.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        double double57 = openMapRealVector42.getDistance(openMapRealVector50);
        double double58 = openMapRealVector32.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector64.ebeMultiply(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector61.append(doubleArray65);
        double double68 = openMapRealVector32.dotProduct(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector2.add(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector69.", openMapRealVector2.equals(realVector69) == realVector69.equals(openMapRealVector2));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector2.ebeMultiply(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        double[] doubleArray9 = openMapRealVector7.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector7);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, (double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor19 = openMapRealVector17.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, (int) (byte) 100, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector23.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.mapAdd((-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.mapAddToSelf((double) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.ebeMultiply(doubleArray35);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector34.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector41.ebeMultiply(doubleArray42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector38.append(openMapRealVector41);
        double[] doubleArray45 = openMapRealVector44.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray45, (double) 100);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector28.add(doubleArray45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector17.append(openMapRealVector28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector48.", openMapRealVector2.equals(realVector48) == realVector48.equals(openMapRealVector2));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.ebeMultiply(doubleArray6);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor8 = openMapRealVector5.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector5);
        double double10 = openMapRealVector2.getNorm();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector2.mapMultiply((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.ebeMultiply(doubleArray18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor20 = openMapRealVector17.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector23.ebeMultiply(doubleArray24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.ebeMultiply(doubleArray29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector25.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector17.getDistance(openMapRealVector25);
        int int33 = openMapRealVector17.getMaxIndex();
        int int34 = openMapRealVector17.getMinIndex();
        int int35 = openMapRealVector17.getMaxIndex();
        int int36 = openMapRealVector17.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.ebeMultiply(doubleArray40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector39.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector45.ebeMultiply(doubleArray46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.ebeMultiply(doubleArray51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector47.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double double54 = openMapRealVector39.getDistance(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector57.ebeMultiply(doubleArray58);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor60 = openMapRealVector57.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector63.ebeMultiply(doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector68.ebeMultiply(doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector65.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector57.getDistance(openMapRealVector65);
        double double73 = openMapRealVector47.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 100L);
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector79.ebeMultiply(doubleArray80);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector76.append(doubleArray80);
        double double83 = openMapRealVector47.dotProduct(doubleArray80);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector17.add(doubleArray80);
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector2.combineToSelf((double) '#', (double) (short) 100, doubleArray80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector85 and realVector84.", realVector85.equals(realVector84) == realVector84.equals(realVector85));
    }
}

